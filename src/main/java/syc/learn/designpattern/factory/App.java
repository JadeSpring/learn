package syc.learn.designpattern.factory;

import java.net.URLEncoder;

/**
 * @author yuchun.shao
 * @date 2020/4/14
 */
public class App {
    public static void main(String[] args) throws Exception {
        String req = "{\"ip\":\"" + "123.77.0.2"
                + "\",\"callback\":\"\",\"acc\":\"2e538071f20148a998ad91ebdda56303\",\"method\":\"getIpLoc\"}";
        System.out.println(URLEncoder.encode(req, "utf-8"));
    }
}
