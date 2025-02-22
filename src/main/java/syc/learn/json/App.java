package syc.learn.json;

//import com.ly.tcwlservice.livechat.cust.common.util.HttpClientUtil;
//import com.ly.tcwlservice.livechat.cust.common.util.JsonUtil;
//import com.ly.tcwlservice.livechat.cust.common.util.ThreadPoolUtil;
//import com.ly.tcwlservice.livechat.cust.guest.controller.vo.traffic.Response;
//import org.springframework.util.StopWatch;
//
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.concurrent.Future;
//import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author syc
 * @date 2024/9/14
 */
public class App {
    public static void main(String[] args) {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        ConcurrentHashMap<String, AtomicInteger> result = new ConcurrentHashMap<>();
//        result.put("限流", new AtomicInteger(0));
//        result.put("不限", new AtomicInteger(0));
//        AtomicInteger xian = new AtomicInteger(0);
//        AtomicInteger buXian = new AtomicInteger(0);
//        List<java.util.concurrent.Future<?>> futures = new ArrayList<>();
//        for (int i = 0; i < 200; i++) {
//            Future<?> sessionId = ThreadPoolUtil.addTask(() -> {
//                try {
//                    Map<String, Object> map = new HashMap<>();
//                    map.put("sessionId", 54759845);
//                    String post = HttpClientUtil.post("http://livechat.t.ly.com/livechatcust/api/out/session/listMessages", JsonUtil.toJson(map));
//                    Response response = JsonUtil.toObject(post, Response.class);
//                    if ("限流".equals(response.getMsg())) {
//                        xian.incrementAndGet();
//                    } else {
//                        buXian.incrementAndGet();
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            });
//            futures.add(sessionId);
//        }
//
//        for (Future<?> future : futures) {
//            try {
//                future.get();
//            } catch (Exception e) {
//                //
//            }
//        }
//
//        stopWatch.stop();
//        System.out.println("耗时：" + stopWatch.getTotalTimeMillis());
//        System.out.println("限流数：" + xian);
//        System.out.println("不限：" + buXian);

    }
}
