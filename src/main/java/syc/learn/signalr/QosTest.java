package syc.learn.signalr;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ly.signalr.client.model.NotifyModel;
import com.ly.signalr.client.trace.MsgTraceUtils;
import com.ly.signalr.client.utils.HttpClientUtil;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author syc
 * @date 2024/7/3
 */
public class QosTest {
    public static void main(String[] args) {

        testSendToSupporter();
        testSendToGuest();
    }

    private static void testSendToGuest() {
        ObjectMapper objectMapper = new ObjectMapper();

        String url = "https://livechat.t.ly.com/livechatcore/inner/Support/SendToGuest";
        OrderCredentialsRequest request = new OrderCredentialsRequest();
        request.setContent("qos测试");
        request.setContentType(1);
        request.setGuestId("7351e65d-1182-4c05-9b09-397520e2e856");
        request.setLeave(false);
        request.setSupporterId(1049894);
        request.setMessageSource(0);
        request.setSendTime(String.valueOf(System.currentTimeMillis()));
        Map<String, String> headers = new HashMap<>();
        headers.put("Cookie", "access_token=bddc66de3ec045c59447aeeb5571605a");
        try {
            for (int i = 0; i < 10; i++) {
                request.setContent("qos测试Pc55_" + (i + 1));
                request.setMsgTraceId(MsgTraceUtils.genMsgTraceId("test"));
                HttpClientUtil.sendPost(url, objectMapper.writeValueAsString(request), headers);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testSendToSupporter() {
        String url = "https://livechat.t.ly.com/livechatcust/api/guest/sendToSupporterWap";
        ObjectMapper objectMapper = new ObjectMapper();
        SendMessageFrontRequest request = new SendMessageFrontRequest();
        request.setContentType("1");
        request.setConnectionId("");
        request.setAskType("1");
        request.setIsFirst(0);
        Map<String, String> headers = new HashMap<>();
        headers.put("Cookie", "guestId=7351e65d-1182-4c05-9b09-397520e2e856");
        try {
            for (int i = 0; i < 10; i++) {
                request.setContent("qos测试工作台qq_" + (i + 1));
                request.setMsgTraceId(MsgTraceUtils.genMsgTraceId("test2SupV123"));
                HttpClientUtil.sendPost(url, objectMapper.writeValueAsString(request), headers);
                TimeUnit.MILLISECONDS.sleep(new Random().nextInt(300));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Data
    public static class OrderCredentialsRequest {
        @JsonProperty("Content")
        private String content;
        @JsonProperty("GuestId")
        private String guestId;
        @JsonProperty("SupporterId")
        private int supporterId;
        @JsonProperty("IsLeave")
        private boolean isLeave;
        @JsonProperty("ContentType")
        private int contentType;

        /**
         * 发送消息类型
         * 0:人工 1：机器人 2：系统消息 3：机器人介入发送消息
         */
        @JsonProperty("MessageSource")
        private int messageSource;

        @JsonProperty("SendTime")
        private String sendTime;

        /**
         * 引用的消息
         */
        @JsonProperty("RefMessageId")
        private String refMessageId;

        @JsonProperty("RefMessageContent")
        private String refMessageContent;

        private String msgTraceId;
    }

    @Data
    public static class SendMessageFrontRequest {

        private String connectionId;

        private String content;

        private String contentType;

        /**
         * 资源地址（图片、视频、音频），根据消息的类型来区分存放的内容
         */
        private String mediaUrl;

        /**
         * 消息来源 0：人工 1：机器人 2：系统消息 3：机器人介入消息 4：语音消息
         */
        private int messageSource;

        /**
         * 是否首次发送
         * 1. 是 0 ：否
         */
        private int isFirst;

        /**
         * 用户输入方式，记录 0：默认 1：用户输入 2：点击热门问题 3：点击相关问题 4：点击联想问
         */
        private String askType;

        private String msgTraceId;

    }



    @Data
    public static class SignalNotifyRequest {
        private String url;
        private String userId;
        private NotifyModel data;
        private boolean http;
        private int timeout = 5000;
        private int maxNum = 1;
        private String contentKey;
        private int sleep;
        private boolean needFallback;
    }
}
