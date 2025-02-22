package syc.learn.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang.time.StopWatch;

import com.alibaba.fastjson2.JSON;
import com.ly.signalr.client.utils.HttpClientUtil;

/**
 * @author syc
 * @date 2024/9/26
 */
public class RateLimitTest {

    public static void main(String[] args) {
//        ConcurrentHashMap<Object, AtomicInteger> map = new ConcurrentHashMap<>();
//        map.put("", new AtomicInteger());
//        map.put("服务繁忙，请稍后再试", new AtomicInteger());
//        map.put("ok", new AtomicInteger());

        ConcurrentHashMap<String, ConcurrentHashMap<Object, AtomicInteger>> mm = new ConcurrentHashMap<>();

        String tcwl = "http://tcwlservice.t.17usoft.com";
        String ly = "http://livechat.t.ly.com";
        String member = tcwl;
        String job = tcwl;

        String admin_url = tcwl + "/livechat/admin/actuator-monitor/prometheus";
        String test_admin_url = tcwl + "/livechat/admin/ApiMonitor/GetSourceList";
        String core_url = ly + "/livechatcore/actuator-monitor/prometheus";
        String test_core_url = ly + "/livechatcore/common/enum/listLiveState";
        String cust_url = ly + "/livechatcust/actuator-monitor/prometheus";
        String test_cust_url = ly + "/livechatcust/ccactuator-monitor/prometheus";
        String robot_url = ly + "/livechatrobot/actuator-monitor/prometheus";
        String test_robot_url = ly + "/livechatrobot/ccactuator-monitor/prometheus";
        String order_url = ly + "/livechatorder/actuator-monitor/prometheus";
        String test_order_url = ly + "/livechatorder/inner/Support/listSrSummarys";
        String job_url = job + "/livechat/job/actuator-monitor/prometheus";
        String member_url = member + "/livechat/member/actuator-monitor/prometheus";
        String test_member_url = member + "/livechat/member/member_info/guest_id/7351e65d-1182-4c05-9b09-397520e2e856";

        List<String> list = new LinkedList<>();
        list.add(admin_url);
        list.add(test_admin_url);
        list.add(core_url);
        list.add(test_core_url);
        list.add(cust_url);
        list.add(test_cust_url);
        list.add(robot_url);
        list.add(test_robot_url);
        list.add(order_url);
        list.add(test_order_url);
        list.add(job_url);
        list.add(member_url);
        list.add(test_member_url);

        for (String s : list) {
            ConcurrentHashMap<Object, AtomicInteger> map = new ConcurrentHashMap<>();
            map.put("", new AtomicInteger());
            map.put("服务繁忙，请稍后再试", new AtomicInteger());
            map.put("ok", new AtomicInteger());
            mm.put(s, map);
        }

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        List<Future<Void>> futureList = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            for (String u : list) {
                futureList.add(ThreadPoolUtil.addTask(() -> {
                    try {
                        String s = HttpClientUtil.sendGet(u, 3000, new HashMap<>());
                        map.put(u, s);
                    } catch (Throwable e) {
                        map.put(u, e.getMessage());
                    }
                }));
            }
        }

        for (Future future : futureList) {
            try {
                future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        stopWatch.stop();
        System.out.println("耗时：" + stopWatch.getTime() + "，结果：\n" + JSON.toJSONString(map));

        System.exit(0);
    }


}
