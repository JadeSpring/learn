package syc.learn.java.stream;

import syc.learn.java.stream.entity.ChatSupporterGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author syc
 * @date 2020/2/7
 */
public class StreamApp {
    public static void main(String[] args) {
//        List<ChatSupporterGroup> list = ChatSupporterGroup.makeData();
//        Map<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(ChatSupporterGroup::getSupporterId, Collectors.mapping(ChatSupporterGroup::getGroupId, Collectors.toList())));
//        System.out.println(collect);

        String msg = null;
        String s = "hhdh" + msg + "hdkdkf";
        System.out.println(s);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);

        filter(list);

        System.out.println(list);
    }

    private static void filter(List<Integer> list) {
//       list.iterator().forEachRemaining();
    }
}
