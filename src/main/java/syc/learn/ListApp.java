package syc.learn;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.collections4.IterableMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author syc
 * @date 2022/11/28
 */
public class ListApp {
    public static void main(String[] args) {
        Leave leave1 = new Leave("1","1",new Date(),Arrays.asList("A","B"));
        Leave leave2 = new Leave("2","2",new Date(), Arrays.asList("C","D"));
        Leave leave3 = new Leave("3","3",new Date(),Arrays.asList("E","F"));
        List<Leave> leaves = Arrays.asList(leave1, leave2, leave3);
        List<String> resultList = leaves.stream()
                .flatMap(leave -> leave.getNameList().stream())
                .collect(Collectors.toList());
        System.out.println(resultList);
    }

    @Data
    @AllArgsConstructor
    public static class Leave {
        private String i;
        private String b;
        private Date c;
        private List<String> nameList;
    }


    public static List<List<Item>> fun(List<List<Item>> all_list, List<Item> l2) {
        List<List<Item>> all_list2 = new ArrayList<>();
        for (List<Item> items : all_list) {
            for (Item item : l2) {
                List<Item> ll = new ArrayList<>(items);
                ll.add(item);
                all_list2.add(ll);
            }
        }

        return all_list2;
    }

    @Data
    @AllArgsConstructor
    public static class Item {
        private int a;
    }
}
