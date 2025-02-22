package syc.learn.kafka;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

//
//import com.ly.tcwlservice.livechat.robot.common.util.JsonHelperUtil;
//import com.ly.tcwlservice.livechat.robot.guest.kafka.dto.MsgSendRecvLogDTO;
//import org.apache.kafka.clients.producer.*;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.*;
//
///**
// * @author syc
// * @date 2024/1/14
// */
//@Component
public class TestKafkaProducer {
    private static final Logger logger = LoggerFactory.getLogger(TestKafkaProducer.class);
    private static final String KAFKA_SERVER = "kafka.ops.17usoft.com:9092";
    private static final String TOPIC = "topic-q_im2db_msg_1";

    private static Properties buildProperties() {
        Properties pro = new Properties();
        pro.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, KAFKA_SERVER);
        pro.put(ProducerConfig.ACKS_CONFIG, "1"); //1:确保leader收到消息；0:消息发到发送缓冲区即可；-1/all:确保leader收到消息并且同步给follower
        pro.put(ProducerConfig.RETRIES_CONFIG, "1");
        pro.put(ProducerConfig.LINGER_MS_CONFIG, 3); //提高生产效率，尤其是在同步生产时
        pro.put(ProducerConfig.BATCH_SIZE_CONFIG, 1024 * 64);
        pro.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 64 * 1024 * 1024);
        pro.put(ProducerConfig.RECEIVE_BUFFER_CONFIG, 64 * 1024 * 1024);
        pro.put(ProducerConfig.COMPRESSION_TYPE_CONFIG, "snappy");    //推荐使用snappy或lz4格式压缩， 大流量下网络带宽容易成为瓶颈，发送前压缩消息；不影响消费，消费者会自动解压
        pro.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        pro.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

        return pro;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Properties pro = buildProperties();

//
        @SuppressWarnings("resource")
        Producer<String, String> producer = new KafkaProducer<String, String>(pro);
        for (int i = 0; i < 100; i++) {
            send(producer, "测试" + i);
        }
        producer.close();
//        logger.info("takes:{} ms", System.currentTimeMillis() - start);
    }

    private static void send(Producer<String, String> producer, String value) {
        final ProducerRecord<String, String> record = new ProducerRecord<String, String>(TOPIC, "key:" + System.currentTimeMillis(), value);
        //底层是异步发送,使用1跟2方法均可以，使用方可以根据实际需求自行选择
        //1. 可以等待获得服务端返回结果
        //2.可以添加回调接口
        producer.send(record, new Callback() {
            @Override
            public void onCompletion(RecordMetadata metadata, Exception exception) {
                if (exception == null) {
                    logger.info("{} sends to partion:{}, offset:{}", "key:" + record.key(), metadata.partition(), metadata.offset());
                } else {
                    logger.error("send error, details:" + exception);
                }
            }
        });
    }
}

