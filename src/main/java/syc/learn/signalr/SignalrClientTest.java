package syc.learn.signalr;

import com.ly.signalr.client.route.RouteHelper;
import com.ly.signalr.client.utils.GlobalHost;
import com.ly.signalr.client.utils.ISendLog;
import com.ly.signalr.client.utils.Marker;

import java.util.HashMap;

/**
 * @author syc
 * @date 2024/6/9
 */
public class SignalrClientTest {


    public static void main(String[] args) {
        GlobalHost.setTimeout(2000);
        GlobalHost.setSendLog(new ISendLog() {
            @Override
            public void info(String s) {

            }

            @Override
            public void error(Exception e, String s) {

            }

            @Override
            public void info(String message, Marker marker, String filter1, String filter2) {
                System.out.println(String.format("%s - %s - %s - %s", marker, message, filter1, filter2));
            }
        });

        GlobalHost.enableQos(true);
        GlobalHost.init();

        java.util.Map<String, Object> map = new HashMap<>();
        map.put("msgTraceId", "msgTraceId_1244555");
        map.put("content", "你好 qos");
        RouteHelper.getQosSignalrRoute().send(map, "test");
    }
}
