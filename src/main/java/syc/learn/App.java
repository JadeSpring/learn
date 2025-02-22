package syc.learn;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.nodes.Tag;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson2.JSON;

/**
 * @author syc
 * @date 2022/11/9
 */
public class App {
    public static void main(String[] args) {
        String str = "\n" + "" +
                "stories:\n" +
                "  - story: 用户_申请_取消_订单\n" +
                "    steps:\n" +
                "      - intent: 取消订单\n" +
                "      - action: 回复_取消_订单_信息\n" +
                "\n" +
                "  - story: 用户_申请_修改_订单\n" +
                "    steps:\n" +
                "      - or:\n" +
                "          - intent: 修改订单\n" +
                "          - intent: 修改_订单\n" +
                "      - action: 回复_修改_订单_信息\n" +
                "\n" +
                "  - story: 用户_申请_点评\n" +
                "    steps:\n" +
                "      - intent: 酒店，点评\n" +
                "      - action: 回复_点评_信息\n" +
                "\n" +
                "  - story: 用户_申请_催工单\n" +
                "    steps:\n" +
                "      - intent: 催工单处理\n" +
                "      - action: 回复_催工单_信息";


        JSONObject jsonObject = YamlUtil.toObject(str, JSONObject.class);
        System.out.println(jsonObject);
        System.out.println(YamlUtil.toYaml(jsonObject));


       StoryTrainVO vo = new StoryTrainVO();

       vo.setStories(Arrays.asList(create(), createOr()));
       System.out.println(YamlUtil.toYaml(vo));

       Yaml yaml = new Yaml();
       StoryTrainVO1 load = yaml.loadAs(str, StoryTrainVO1.class);
       System.out.println("load === ");
       System.out.println(JSON.toJSONString(load));
       String dump1 = yaml.dump(load);
       System.out.println(dump1);
       System.out.println("load === ");
       System.out.println(JSON.parseObject(JSON.toJSONString(vo)));
       String dump = yaml.dumpAs(JSON.parseObject(JSON.toJSONString(vo)), Tag.MAP, null);

       System.out.println(str);
       System.out.println("dump");
       System.out.println(dump);
       System.out.println("dump");
//        System.out.println(JSON.toJSONString(load));

       String s = "  S   ";
       System.out.println(s.length());
       System.out.println(s);
       s = StringUtils.trim(s);
       System.out.println(s.length());
       System.out.println(s);
       System.out.println("c12071cda93b44a18d606ef8be5cb537".length());
    }

    private static StoryTrainVO.Story create() {
        StoryTrainVO.IntentStep i_stp = new StoryTrainVO.IntentStep();
        i_stp.setIntent("取消订单");
        StoryTrainVO.ActionStep a_stp = new StoryTrainVO.ActionStep();
        a_stp.setAction("回复_取消_订单_信息");
        StoryTrainVO.Story story = new StoryTrainVO.Story();
        story.setStory("用户_申请_取消_订单");
        story.setSteps(Arrays.asList(i_stp, a_stp));
        return story;
    }

    private static StoryTrainVO.Story createOr() {
        StoryTrainVO.OrStep orStep = new StoryTrainVO.OrStep();
        StoryTrainVO.IntentStep i_stp = new StoryTrainVO.IntentStep();
        i_stp.setIntent("取消订单");
        StoryTrainVO.IntentStep i_stp1 = new StoryTrainVO.IntentStep();
        i_stp1.setIntent("疫情");
        orStep.setOr(Arrays.asList(i_stp, i_stp1));

        StoryTrainVO.ActionStep a_stp = new StoryTrainVO.ActionStep();
        a_stp.setAction("回复_取消_订单_信息");

        StoryTrainVO.Story story = new StoryTrainVO.Story();
        story.setStory("哈哈哈");
        story.setSteps(Arrays.asList(orStep, a_stp));
        return story;
    }
 }
