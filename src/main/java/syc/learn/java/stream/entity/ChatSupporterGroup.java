package syc.learn.java.stream.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syc
 * @date 2020/2/7
 */
@Data
public class ChatSupporterGroup {
    private int supporterId;
    private int groupId;

    public ChatSupporterGroup(int supporterId, int groupId) {
        this.supporterId = supporterId;
        this.groupId = groupId;
    }

    public static List<ChatSupporterGroup> makeData() {
        List<ChatSupporterGroup> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                list.add(new ChatSupporterGroup(i,i*10+j));
            }
        }
        return list;
    }
}
