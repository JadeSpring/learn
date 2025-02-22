//package syc.learn.java;
//
//import lombok.Data;
//import org.apache.commons.lang3.StringUtils;
//
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * @author syc
// * @date 2024/4/9
// */
//public class StringApp {
//
//    public static void main(String[] args) throws Exception {
////        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日");
////        HotelService hotelService  = new HotelService();
////        hotelService.tcModelClient = new TcModelClient();
//
//        List<TestDO> testList = new ArrayList<>();
//        // 都识别到，且时间区间正确
//        // 1号、下周一、周五、3天、3天后、一周、一个星期、下下周二
//        // 4月22号、
//        // 开始为x号，结束为所有类型
//        testList.add(new TestDO("1号", "4号", "2024年5月1日", "2024年5月4日", "2024年5月1日", "2024年5月4日"));
//        testList.add(new TestDO("1号", "3天", "2024年5月1日", "2024年5月4日", "2024年5月1日", "2024年5月4日"));
//        testList.add(new TestDO("1号", "5月2号", "2024年5月1日", "2024年5月2日", "2024年5月1日", "2024年5月2日"));
//        testList.add(new TestDO("21号", "下周一", "2024年4月21日", "2024年4月22日", "2024年4月21日", "2024年4月22日"));
//        testList.add(new TestDO("18号", "周五", "2024年4月18日", "2024年4月19日", "2024年4月18日", "2024年4月19日"));
//        // 2天后算法确定是个绝对时间，以当前时间为基准
//        testList.add(new TestDO("18号", "2天后", "2024年4月18日", "2024年4月20日", "2024年4月18日", "2024年4月20日"));
//        testList.add(new TestDO("18号", "一周", "2024年4月18日", "2024年4月25日", "2024年4月18日", "2024年4月25日"));
//        testList.add(new TestDO("18号", "一个星期", "2024年4月18日", "2024年4月25日", "2024年4月18日", "2024年4月25日"));
//        testList.add(new TestDO("18号", "下下周二", "2024年4月18日", "2024年4月30日", "2024年4月18日", "2024年4月30日"));
//
//        // 开始为x月x号，在当前时间后，结束为所有类型
//        testList.add(new TestDO("4月22号", "27日", "2024年4月22日", "2024年4月27日", "2024年4月22日", "2024年4月27日"));
//        testList.add(new TestDO("4月22号", "5天", "2024年4月22日", "2024年4月27日", "2024年4月22日", "2024年4月27日"));
//        testList.add(new TestDO("4月22号", "4月25日", "2024年4月22日", "2024年4月25日", "2024年4月22日", "2024年4月25日"));
//        testList.add(new TestDO("4月22号", "下周四", "2024年4月22日", "2024年4月25日", "2024年4月22日", "2024年4月25日"));
//        testList.add(new TestDO("4月19号", "周六", "2024年4月19日", "2024年4月20日", "2024年4月19日", "2024年4月20日"));
//        testList.add(new TestDO("4月19号", "一周", "2024年4月19日", "2024年4月26日", "2024年4月19日", "2024年4月26日"));
//        testList.add(new TestDO("4月19号", "一个星期", "2024年4月19日", "2024年4月26日", "2024年4月19日", "2024年4月26日"));
//        testList.add(new TestDO("4月19号", "下下周二", "2024年4月19日", "2024年4月30日", "2024年4月19日", "2024年4月30日"));
//
//        testList.add(new TestDO("下周一", "27号", "2024年4月22日", "2024年4月27日", "2024年4月22日", "2024年4月27日"));
//        testList.add(new TestDO("下周一", "5天", "2024年4月22日", "2024年4月27日", "2024年4月22日", "2024年4月27日"));
//        testList.add(new TestDO("下周一", "4月25日", "2024年4月22日", "2024年4月25日", "2024年4月22日", "2024年4月25日"));
//        testList.add(new TestDO("下周一", "下周四", "2024年4月22日", "2024年4月25日", "2024年4月22日", "2024年4月25日"));
//        testList.add(new TestDO("下周一", "一周", "2024年4月22日", "2024年4月29日", "2024年4月22日", "2024年4月29日"));
//        testList.add(new TestDO("下周一", "一个星期", "2024年4月22日", "2024年4月29日", "2024年4月22日", "2024年4月29日"));
//        testList.add(new TestDO("下周一", "下下周二", "2024年4月22日", "2024年4月30日", "2024年4月22日", "2024年4月30日"));
//
//        testList.add(new TestDO("周一", "27号", "2024年4月22日", "2024年4月27日", "2024年4月22日", "2024年4月27日"));
//        testList.add(new TestDO("周一", "5天", "2024年4月22日", "2024年4月27日", "2024年4月22日", "2024年4月27日"));
//        testList.add(new TestDO("周一", "4月25日", "2024年4月22日", "2024年4月25日", "2024年4月22日", "2024年4月25日"));
//        testList.add(new TestDO("周一", "下周四", "2024年4月22日", "2024年4月25日", "2024年4月22日", "2024年4月25日"));
//        testList.add(new TestDO("周一", "一周", "2024年4月22日", "2024年4月29日", "2024年4月22日", "2024年4月29日"));
//        testList.add(new TestDO("周一", "一个星期", "2024年4月22日", "2024年4月29日", "2024年4月22日", "2024年4月29日"));
//        testList.add(new TestDO("周一", "下下周二", "2024年4月22日", "2024年4月30日", "2024年4月22日", "2024年4月30日"));
//
//        testList.add(new TestDO("周五", "27号", "2024年4月19日", "2024年4月27日", "2024年4月19日", "2024年4月27日"));
//        testList.add(new TestDO("周五", "5天", "2024年4月19日", "2024年4月24日", "2024年4月19日", "2024年4月24日"));
//        testList.add(new TestDO("周五", "4月25日", "2024年4月19日", "2024年4月25日", "2024年4月19日", "2024年4月25日"));
//        testList.add(new TestDO("周五", "下周四", "2024年4月19日", "2024年4月25日", "2024年4月19日", "2024年4月25日"));
//        testList.add(new TestDO("周五", "一周", "2024年4月19日", "2024年4月26日", "2024年4月19日", "2024年4月26日"));
//        testList.add(new TestDO("周五", "一个星期", "2024年4月19日", "2024年4月26日", "2024年4月19日", "2024年4月26日"));
//        testList.add(new TestDO("周五", "下下周二", "2024年4月19日", "2024年4月30日", "2024年4月19日", "2024年4月30日"));
//
//        testList.add(new TestDO("2天后", "27号", "2024年4月20日", "2024年4月27日", "2024年4月20日", "2024年4月27日"));
//        testList.add(new TestDO("2天后", "5天", "2024年4月20日", "2024年4月25日", "2024年4月20日", "2024年4月25日"));
//        testList.add(new TestDO("2天后", "4月25日", "2024年4月20日", "2024年4月25日", "2024年4月20日", "2024年4月25日"));
//        testList.add(new TestDO("2天后", "下周四", "2024年4月20日", "2024年4月25日", "2024年4月20日", "2024年4月25日"));
//        testList.add(new TestDO("2天后", "一周", "2024年4月20日", "2024年4月27日", "2024年4月20日", "2024年4月27日"));
//        testList.add(new TestDO("2天后", "一个星期", "2024年4月20日", "2024年4月27日", "2024年4月20日", "2024年4月27日"));
//        testList.add(new TestDO("2天后", "下下周二", "2024年4月20日", "2024年4月30日", "2024年4月20日", "2024年4月30日"));
//
//        // 只识别到开始时间
//        testList.add(new TestDO("4号", "", "2024年5月4日","", "2024年5月4日", "2024年5月5日"));
//        testList.add(new TestDO("3天", "", "2024年4月21日","", "2024年4月21日", "2024年4月22日"));
//        testList.add(new TestDO("5月2号", "", "2024年5月2日", "","2024年5月2日", "2024年5月3日"));
//        testList.add(new TestDO("4月2号", "", "2024年4月2日", "","2024年4月18日", "2024年4月19日"));
//        testList.add(new TestDO("下周一", "", "2024年4月22日", "","2024年4月22日", "2024年4月23日"));
//        testList.add(new TestDO("周五", "", "2024年4月19日", "","2024年4月19日", "2024年4月20日"));
//        testList.add(new TestDO("2天后", "", "2024年4月20日", "", "2024年4月20日", "2024年4月21日"));
//        testList.add(new TestDO("一周", "", "2024年4月25日", "", "2024年4月25日", "2024年4月26日"));
//        testList.add(new TestDO("一个星期", "", "2024年4月25日", "", "2024年4月25日", "2024年4月26日"));
//        testList.add(new TestDO("下下周二", "", "2024年4月30日", "", "2024年4月30日", "2024年5月1日"));
//
//        // 只识别到结束时间
//        testList.add(new TestDO("", "4号", "", "2024年5月4日", "2024年4月18日", "2024年5月4日"));
//        testList.add(new TestDO("", "3天", "", "2024年4月21日", "2024年4月18日", "2024年4月21日"));
//        testList.add(new TestDO("", "5月2号", "", "2024年5月2日", "2024年4月18日", "2024年5月2日"));
//        testList.add(new TestDO("", "4月1号", "", "2024年4月1日", "2024年4月18日", "2024年4月19日"));
//        testList.add(new TestDO("", "下周一", "", "2024年4月22日", "2024年4月18日", "2024年4月22日"));
//        testList.add(new TestDO("", "周五", "", "2024年4月19日", "2024年4月18日", "2024年4月19日"));
//        testList.add(new TestDO("", "2天后", "", "2024年4月20日", "2024年4月18日", "2024年4月20日"));
//        testList.add(new TestDO("", "一周", "", "2024年4月25日", "2024年4月18日", "2024年4月25日"));
//        testList.add(new TestDO("", "一个星期", "", "2024年4月25日", "2024年4月18日", "2024年4月25日"));
//        testList.add(new TestDO("", "下下周二", "", "2024年4月30日", "2024年4月18日", "2024年4月30日"));
//
//        // 都识别到，当时间区间错误
//        testList.add(new TestDO("四月一号", "下周一", "2024年4月1日", "2024年4月22日", "2024年4月18日", "2024年4月19日"));
//        testList.add(new TestDO("4月1号", "", "2024年4月1日", "", "2024年4月18日", "2024年4月19日"));
//        testList.add(new TestDO("1号", "4月2号", "2024年5月1日", "2024年4月2日", "2024年4月18日", "2024年4月19日"));
//        testList.add(new TestDO("5月2号", "5月1号", "2024年5月2日", "2024年5月1日", "2024年4月18日", "2024年4月19日"));
//        testList.add(new TestDO("2023年5月2号", "5月5号", "2023年5月2日", "2024年5月5日", "2024年4月18日", "2024年4月19日"));
//        testList.add(new TestDO("2024年5月2号", "5月5号", "2024年5月2日", "2024年5月5日", "2024年5月2日", "2024年5月5日"));
//        testList.add(new TestDO("2024年5月2号", "5月5号", "2024年5月2日", "2024年5月5日", "2024年5月2日", "2024年5月5日"));
//
//        testList.add(new TestDO("4月1日", "一周", "2024年4月1日", "2024年4月8日", "2024年4月18日", "2024年4月19日"));
//        testList.add(new TestDO("4月1号", "三天", "2024年4月1日", "2024年4月4日", "2024年4月18日", "2024年4月19日"));
//        testList = new ArrayList<>();
//        testList.add(new TestDO("下周三", "周五", "2024年4月24日", "2024年4月26日", "2024年4月24日", "2024年4月26日"));
//        testList.add(new TestDO("五月五号", "五月1号", "2024年5月5日", "2024年5月1日", "2024年4月18日", "2024年4月19日"));
//        testList.add(new TestDO("五月28号", "1号", "2024年5月28日", "2024年6月1日", "2024年5月28日", "2024年6月1日"));
//        int okNum = 0;
//
////        testList = new ArrayList<>();
////        testList.add(new TestDO("18号", "周五", "2024年4月18日", "2024年4月19日", "2024年4月18日", "2024年4月19日"));
//
//        List<String> failList = new ArrayList<>();
//        int i = 0;
//        for (TestDO x : testList) {
//            i++;
//            boolean test = test(x.inDateStr, x.outDateStr, x.expectNerStartTime, x.expectNerEndTime, x.expectBookStartTime, x.expectBookEndTime);
//            if (test) {
//                okNum++;
//            } else {
//                failList.add(String.join(" - ", Arrays.asList(String.valueOf(i), x.inDateStr, x.outDateStr, x.expectNerStartTime, x.expectNerEndTime, x.expectBookStartTime, x.expectBookEndTime)));
//            }
//        }
//
//        System.err.println("total " + testList.size() + " okNum " + okNum + " 成功率：" + (okNum * 100.0)/ (testList.size() * 1.0) + "%");
//        for (String s : failList) {
//            System.err.println(s);
//        }
//    }
//
//    @Data
//    public static class TestDO {
//        String inDateStr; String outDateStr; String expectNerStartTime; String expectNerEndTime; String expectBookStartTime; String expectBookEndTime;
//
//        public TestDO(String inDateStr, String outDateStr, String expectNerStartTime, String expectNerEndTime, String expectBookStartTime, String expectBookEndTime) {
//            this.inDateStr = inDateStr;
//            this.outDateStr = outDateStr;
//            this.expectNerStartTime = expectNerStartTime;
//            this.expectNerEndTime = expectNerEndTime;
//            this.expectBookStartTime = expectBookStartTime;
//            this.expectBookEndTime = expectBookEndTime;
//        }
//    }
//
//    private static boolean test(String inDateStr, String outDateStr, String expectNerStartTime, String expectNerEndTime, String expectBookStartTime, String expectBookEndTime) {
//        boolean result;
//        System.out.println("==================================================");
//        System.out.println("inDateStr= " + inDateStr);
//        System.out.println("outDateStr= " + outDateStr);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日");
//        HotelService hotelService  = new HotelService();
//        hotelService.tcModelClient = new TcModelClient();
//
//        NerTimeDTO nerTimeDTO = hotelService.parseBookTime(inDateStr, outDateStr);
//        String bookStartTime = nerTimeDTO.getBookStartTime().format(formatter);
//        result = bookStartTime.equals(expectBookStartTime);
//        if (!bookStartTime.equals(expectBookStartTime)) {
//            System.err.println("输入" + inDateStr + " expectBookStartTime " + expectBookStartTime + " 实际：" + bookStartTime);
//        }
//
//        String bookEndTime = nerTimeDTO.getBookEndTime().format(formatter);
//        result = result && bookEndTime.equals(expectBookEndTime);
//        if (!bookEndTime.equals(expectBookEndTime)) {
//            System.err.println("输入: " + inDateStr + "," + outDateStr + " expectBookEndTime " + expectBookEndTime + " 实际：" + bookEndTime);
//        }
//
//
//        if (nerTimeDTO.getNerStartTime() != null) {
//            String nerStartTime = nerTimeDTO.getNerStartTime().format(formatter);
//            result = result && nerStartTime.equals(expectNerStartTime);
//            if (!nerStartTime.equals(expectNerStartTime)) {
//                System.err.println("输入" + inDateStr + " expectNerStartTime " + expectNerStartTime + " 实际：" + nerStartTime);
//            }
//        } else {
//            result = result && StringUtils.isBlank(expectNerStartTime);
//            if (!StringUtils.isBlank(expectNerStartTime)) {
//                System.err.println("输入" + inDateStr + " expectNerStartTime " + expectNerStartTime + " 实际：null");
//            }
//        }
//
//        if (nerTimeDTO.getNerEndTime() != null) {
//            String nerEndTime = nerTimeDTO.getNerEndTime().format(formatter);
//            result = result && nerEndTime.equals(expectNerEndTime);
//            if (!nerEndTime.equals(expectNerEndTime)) {
//                System.err.println("输入: " + inDateStr + "," + outDateStr + " expectNerEndTime " + expectNerEndTime + " 实际：" + nerEndTime);
//            }
//        } else {
//            result = result && StringUtils.isBlank(expectNerEndTime);
//            if (!StringUtils.isBlank(expectNerEndTime)) {
//                System.err.println("输入: " + inDateStr + "," + outDateStr + " expectNerEndTime " + expectNerEndTime + " 实际：null");
//            }
//        }
//
//        if (!nerTimeDTO.canShowNerTime()) {
//            System.err.println(String.format("can not show time: %s - %s ~ %s - %s", expectNerStartTime, expectBookStartTime, expectNerEndTime, expectBookEndTime));
//        }
//
//        System.out.println("==================================================");
//
//        return result;
//    }
//
//
//
//
//}
