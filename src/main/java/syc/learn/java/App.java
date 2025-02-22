package syc.learn.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson2.JSON;

import lombok.Data;

/**
 * @author syc
 * @date 2024/9/19
 */
public class App {
    public static void main(String[] args) {

        List<String> dataList = new ArrayList<>();
        dataList.add(adminData());
        dataList.add(robotData());
        dataList.add(custData());
        dataList.add(coreData());
        dataList.add(memberData());
        dataList.add(jobData());
        dataList.add(orderData());
        for (String s : dataList) {
            List<A> as = JSON.parseArray(s, A.class);
            as.sort(Comparator.comparing(A::getCount).reversed());
            for (A a : as) {
                System.out.println(String.format("%s\t%s\t%s\t%s\t%s", uk(a.destId), a.destId, a.count, a.elapsedTime(), outApi(a.destId)));
            }
        }

    }

    private static String adminData() {
        return "[\n" +
                "  {\n" +
                "    \"elapsed\": 14779,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiChatSortStatReport/GetChatSortStat\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1343,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiRobotService/GetPageTypeList\",\n" +
                "    \"count\": 119\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6651898,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/out/api/getMemberInfo\",\n" +
                "    \"count\": 920848\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 35560,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/hotspotConsultMonitorApi/getRobotQuestionTotalConsultCount\",\n" +
                "    \"count\": 1193\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 348,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/MemberLabel/getAuditHistoryList\",\n" +
                "    \"count\": 25\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 179971,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/monitor/querySumTimeSpanList\",\n" +
                "    \"count\": 1159\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 470,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/reportStatistics/getNewFCR\",\n" +
                "    \"count\": 4\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 129,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/preQuestion/batchDelete\",\n" +
                "    \"count\": 6\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 416,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/*\",\n" +
                "    \"count\": 399\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6381,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/artificialConfig/listArtificialConfig\",\n" +
                "    \"count\": 625\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 11,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/role/listRoleMenus\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 79,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/chatInfoManageData/listOtherReasonToExcel\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 912,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiRobotService/updateHotQuestionTypeLevel\",\n" +
                "    \"count\": 86\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3558,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/monitor/exportSupporterOnlineTime\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1229,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/monitor/getTranInfoByDetail\",\n" +
                "    \"count\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 188054,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/supporter/role\",\n" +
                "    \"count\": 54519\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 179,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiRobotService/DeleteRobotHotAsk\",\n" +
                "    \"count\": 16\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 100522,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/product/pageInfo\",\n" +
                "    \"count\": 55292\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3307,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiConfig/listExtendServiceManage\",\n" +
                "    \"count\": 365\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 13,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/repeatAdvisory/getRepeatAdvisory\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 139,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiManage/GetSendToSupporter\",\n" +
                "    \"count\": 6\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 822,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/oauth/replaceUserRole\",\n" +
                "    \"count\": 16\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 61703,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/robotTran/exportTranDetail\",\n" +
                "    \"count\": 20\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 137,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiDataStatReport/ExportChartTimeSumStat\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6670,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiMonitor/robotCountTrend\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 72728,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/monitor/exportSupporterStateDetails\",\n" +
                "    \"count\": 22\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 123,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/supporterGroup/updateGroup\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 38,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/warnRule/getStatisticalPeriod\",\n" +
                "    \"count\": 10\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 136,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiRobotService/batchAddRobotHotQuestionLabel\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 80319,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiDataStatReport/ExportChatSessRepeatStat\",\n" +
                "    \"count\": 37\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 20135,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/monitor/getSupporterLogin\",\n" +
                "    \"count\": 356\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2508,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/service/GetQuotaReadTapeStat\",\n" +
                "    \"count\": 14\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 13335,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiDataStatReport/GetChartTimeSumStat\",\n" +
                "    \"count\": 14\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3276398,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/chatRecord/getConnectInfo\",\n" +
                "    \"count\": 8029\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 525612,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/searchChatContent\",\n" +
                "    \"count\": 10356\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 370,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/role/listRoleLevelLable\",\n" +
                "    \"count\": 56\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 158,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/monitor/exportSumTimeSpanList\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 9,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/link_address/list/info\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1061744,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/service/GetCustomServiceCount\",\n" +
                "    \"count\": 9032\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 284,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/product/getProductList\",\n" +
                "    \"count\": 26\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1049,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/outInterFace/listRobotHotQuestion\",\n" +
                "    \"count\": 27\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 21,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/GetCustomServiceInfo\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 225,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/talkSort/listOneLevelSort\",\n" +
                "    \"count\": 37\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 109460,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/jobMonitor/refreshImage\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 33475,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/reportStatistics/listReportStatisticsAndSummary\",\n" +
                "    \"count\": 16\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 372,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/superLongAdvisory/listSuperLongAdvisory\",\n" +
                "    \"count\": 6\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 17,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/warnRule/stop\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 151391,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/robotTran/getTranDetail\",\n" +
                "    \"count\": 172\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 160432,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/listOriginalQuestionsInfo\",\n" +
                "    \"count\": 50399\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 47,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/sortProblem/updateSort\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 300,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/robotQuestionSortData/exportXiaoIResolutionRate\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 367,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/push/changeStatus\",\n" +
                "    \"count\": 21\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1378,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/push/updateCache\",\n" +
                "    \"count\": 46\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 12841,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/service/robotServiceEfficiency\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 606,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/liveChatSystemData/getSelfHelpAjax\",\n" +
                "    \"count\": 12\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 10624446,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/listMessage/sessions\",\n" +
                "    \"count\": 587943\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 329728,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/chatRecord/exportRecordToExcel\",\n" +
                "    \"count\": 64\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2093217,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/getChatSessionCountTotal\",\n" +
                "    \"count\": 108071\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 30,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiServiceQuality/GetSatisfactionList\",\n" +
                "    \"count\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 343,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/getNetProductList\",\n" +
                "    \"count\": 45\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 32,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/chat/role\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 47,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/hotspotConsultMonitorApi/exportRobotQuestionConsultStatistics\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 192274,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/MemberLabel/doAudit\",\n" +
                "    \"count\": 10529\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5495,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/getSupporterLoginLog\",\n" +
                "    \"count\": 219\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 32735446,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/GetServiceAndQualityList\",\n" +
                "    \"count\": 39771\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 37,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiRobotService/listRobotHotAskClasses\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5601182,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/session/history\",\n" +
                "    \"count\": 1151269\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6397,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiConfig/setExtendServiceCache\",\n" +
                "    \"count\": 520\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 60,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/push/addConfig\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 633341,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiServiceQuality/ExportLoginStateListBySup\",\n" +
                "    \"count\": 84\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/strategy/getOrderExclude\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 415718,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/getSupLoginInfo\",\n" +
                "    \"count\": 74817\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 229,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/out/api/getLabelList\",\n" +
                "    \"count\": 27\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1203672,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/getChatSessionCountByHour\",\n" +
                "    \"count\": 108064\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 679,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiConfig/setExtendServiceOnline\",\n" +
                "    \"count\": 30\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 915,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/role/listRoleUser\",\n" +
                "    \"count\": 54\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 79213,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/enum/listMemberType\",\n" +
                "    \"count\": 10208\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 94495,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/repeatAdvisory/listRepeatAdvisory\",\n" +
                "    \"count\": 14\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 23061,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiMonitor/saveMonitorSupporterConfig\",\n" +
                "    \"count\": 1079\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 171,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/sortProblem/listSort\",\n" +
                "    \"count\": 11\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6865,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/enum/listAllSourceType\",\n" +
                "    \"count\": 1531\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 252364,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/service/GetChatSessRepeatStat\",\n" +
                "    \"count\": 434\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 29,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/qucikTalk/updateQuickTalk\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1084286,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiServiceQuality/GetNonResolvedList\",\n" +
                "    \"count\": 1160\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 87093912,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/listBroadCastingContent\",\n" +
                "    \"count\": 60290621\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5798,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/role/listRoles\",\n" +
                "    \"count\": 153\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 20390,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/SupporterManage/exportPageVisitCount\",\n" +
                "    \"count\": 8\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 42,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/listPlatForm\",\n" +
                "    \"count\": 34\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 788,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/push/updateConfig\",\n" +
                "    \"count\": 33\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 40,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/warnRule/getWarnRuleDetailName\",\n" +
                "    \"count\": 10\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 620,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/role/getLevelLables\",\n" +
                "    \"count\": 74\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 385462,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/outInterFace/quickTalkList\",\n" +
                "    \"count\": 124249\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 506993,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/GetProductList\",\n" +
                "    \"count\": 46500\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 10374,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiRobotService/GetRobotHotAskList\",\n" +
                "    \"count\": 350\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 9664,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiMonitor/robotToServerCountTable\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 54305,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/oauth/listPageRole\",\n" +
                "    \"count\": 9037\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 165,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiRobotService/SortRobotHotAsk\",\n" +
                "    \"count\": 6\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 16046,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/AddScalpeLabel\",\n" +
                "    \"count\": 591\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 42677,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/getOnlineExtendService\",\n" +
                "    \"count\": 15958\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 14,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ConfigGroup/listConfigGroup\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 130,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/qucikTalk/addQuickTalk\",\n" +
                "    \"count\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 14486,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/livebroadcasting/query\",\n" +
                "    \"count\": 1169\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 747,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/liveChatSystemData/updateSelfHelp\",\n" +
                "    \"count\": 37\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 21,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/recall/search\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 98,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/service/listSupporterManPower\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 41454,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/listLocale\",\n" +
                "    \"count\": 36379\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 9908,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/adminHeplerData/getGuestCountChart\",\n" +
                "    \"count\": 69\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 56,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/hotspotConsultMonitorApi/exportRobotQuestionConsultStatisticsWithRank\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 237342,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/oauth/LoginUser\",\n" +
                "    \"count\": 34612\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 54,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/online_link/page/query\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3631,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiServiceQuality/GetMemberInfoByGuestId\",\n" +
                "    \"count\": 449\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 28259,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiDataStatReport/listSupporterManPower\",\n" +
                "    \"count\": 26\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 99438,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/hotspotConsultMonitorApi/getRobotQuestionConsultStatisticsWithRank\",\n" +
                "    \"count\": 590\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 136170561,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiMonitor/GetCustomServiceCount\",\n" +
                "    \"count\": 2981548\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 86,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/chatNoticeInfo/addAnnouncement\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 465,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiRobotService/SaveRobotHotAsk\",\n" +
                "    \"count\": 21\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3780,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/jobMonitor/refreshCache\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 55,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/listPhoneProduct\",\n" +
                "    \"count\": 21\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1129,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiRobotService/listQuestionTypes\",\n" +
                "    \"count\": 76\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 385,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/sortProblem/getSortProblemByProductId\",\n" +
                "    \"count\": 38\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 43,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/warnRule/getCompareType\",\n" +
                "    \"count\": 10\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 145895,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/listProduct\",\n" +
                "    \"count\": 22156\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 13843,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/role/getAllotBtnOperation\",\n" +
                "    \"count\": 2754\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1208652,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/sugr\",\n" +
                "    \"count\": 920847\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 48642,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/hotspotConsultMonitorApi/getRobotQuestionConsultStatistics\",\n" +
                "    \"count\": 605\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 72,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiRobotService/FreshRobotStatusMapping\",\n" +
                "    \"count\": 4\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 37249,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/out/api/listSourceType\",\n" +
                "    \"count\": 18061\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 117661,\n" +
                "    \"errs\": 1,\n" +
                "    \"destId\": \"POST /livechat/admin/report/robotServiceEfficiency\",\n" +
                "    \"count\": 22\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 687,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/SupporterManage/saveSupporter\",\n" +
                "    \"count\": 16\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 856,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/preQuestion/updateQuestion\",\n" +
                "    \"count\": 35\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1330,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ConfigGroupField/list\",\n" +
                "    \"count\": 161\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 37869,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiServiceQuality/ExportGetNonResolvedList\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6186,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/analyze/session/{sessionId}\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 500,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/role/deleteRoleUser\",\n" +
                "    \"count\": 8\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 35,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/sourceType/page/query\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 491294,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/listNoticeModels\",\n" +
                "    \"count\": 352164\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1050,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiRobotService/UpdateRobotHotAskRedis\",\n" +
                "    \"count\": 30\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 25,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/strategy/configList\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 303248,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/out/api/getMenuList\",\n" +
                "    \"count\": 46836\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2303667,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/service/GetCustomServiceInfo\",\n" +
                "    \"count\": 100765\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 8176,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/resource/voucher\",\n" +
                "    \"count\": 449\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1022885,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/out/api/operation/handler/session/{sessionId}\",\n" +
                "    \"count\": 203870\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 596,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/robotEvaluation/exportEvaluationtail\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 17293,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/robotQuestionSortData/listXiaoIResolutionRate\",\n" +
                "    \"count\": 51\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 93,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/apifile/AddFile\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 479563,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/out/api/searchChatRecordList\",\n" +
                "    \"count\": 18056\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 16048384,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiServiceQuality/GetSatisfactionList\",\n" +
                "    \"count\": 57771\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 167,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/supporterGroup/supportGroupList\",\n" +
                "    \"count\": 21\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5116,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/MemberLabel/exportAuditRecordModel\",\n" +
                "    \"count\": 16\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 29731,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/report/exportRobotServiceEfficiency\",\n" +
                "    \"count\": 4\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 93366,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiServiceQuality/GetMemberInfo\",\n" +
                "    \"count\": 8474\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 104942,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/service/GetSatisfactionList\",\n" +
                "    \"count\": 357\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 204,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/product/getProductModel\",\n" +
                "    \"count\": 23\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1151,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/SupporterManage/getPageInfoList\",\n" +
                "    \"count\": 150\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 224,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/liveChatSystemData/orderSelfHelp\",\n" +
                "    \"count\": 11\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 86,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiManage/GetWarningConfigList\",\n" +
                "    \"count\": 8\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 282,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/robFirstReply/search\",\n" +
                "    \"count\": 9\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 130157,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/GetGroupList\",\n" +
                "    \"count\": 21356\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4200,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/getSupporterStateDetail\",\n" +
                "    \"count\": 790\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2553,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiMonitor/getMonitorSupporterConfig\",\n" +
                "    \"count\": 359\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3232,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/artificialConfig/getConfigInfo\",\n" +
                "    \"count\": 376\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1903,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/livebroadcasting/update\",\n" +
                "    \"count\": 30\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 195086,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/outInterFace/product/list\",\n" +
                "    \"count\": 59298\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1895,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/push/listConfig\",\n" +
                "    \"count\": 269\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 16,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/GetCustomServiceCount\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 74,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/out/api/listMessage/{sessionId}\",\n" +
                "    \"count\": 8\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 313,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/askSorts/listHotelOneAskSorts\",\n" +
                "    \"count\": 38\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 244,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/online_link/refreshCache\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 142693852,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiMonitor/GetCustomServiceInfo\",\n" +
                "    \"count\": 2981609\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 771,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiConfig/getExtendService\",\n" +
                "    \"count\": 105\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3590470,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/getTranDetailHour\",\n" +
                "    \"count\": 15522\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1589778,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiDataStatReport/GetChatSessRepeatStat\",\n" +
                "    \"count\": 4436\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 11518,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/chatNoticeInfo/GetAnnouncementConfigList\",\n" +
                "    \"count\": 1088\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 223531,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/GetSourceList\",\n" +
                "    \"count\": 45807\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 122176,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/supporterGroup/getSupporterNameList\",\n" +
                "    \"count\": 5509\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 15,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/talkSort/listTalkSort\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6557,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/chatNoticeInfo/SetAnnouncementConfigValid\",\n" +
                "    \"count\": 341\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4236291,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/chatRecord/getSupporterGuestRelation\",\n" +
                "    \"count\": 11985\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 94,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/talkSort/listSecondLevelSort\",\n" +
                "    \"count\": 11\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1624,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiDataStatReport/GetRobotHotAskStat\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 138,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/chatInfoManageData/exportComplainChatRecordListToHtml\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 878,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/robotReport/robotServiceQualityNew\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1023,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/role/addRoleUser\",\n" +
                "    \"count\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 27899,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/pageInfo/listByProductSourceType\",\n" +
                "    \"count\": 4045\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5696,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/artificialConfig/upsertConfig\",\n" +
                "    \"count\": 234\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 79,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/livebroadcasting/list\",\n" +
                "    \"count\": 12\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 17300,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/livebroadcasting/status\",\n" +
                "    \"count\": 444\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 113,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/SupporterManage/getSupporter\",\n" +
                "    \"count\": 19\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 641,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiRobotService/GetRobotOrderStatusList\",\n" +
                "    \"count\": 27\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 193850,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/contact/listPlatService\",\n" +
                "    \"count\": 114263\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 958,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/warnRule/update\",\n" +
                "    \"count\": 20\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 959395,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/out/api/listProductivity\",\n" +
                "    \"count\": 2850\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3027,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiSessionSortStatReport/getSessionSortSummary\",\n" +
                "    \"count\": 9\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 8296,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiServiceQuality/ExportLoginStateDetails\",\n" +
                "    \"count\": 8\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 32,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/out/api/baseData/getSourceList\",\n" +
                "    \"count\": 13\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1227,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/apifile/GetImgPageList\",\n" +
                "    \"count\": 29\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 646,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/preQuestion/refreshRedisRobotPreQuestion\",\n" +
                "    \"count\": 23\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 16449,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/livebroadcasting/refresh\",\n" +
                "    \"count\": 2435\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 12193,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiChatSortStatReport/ExportChatSortDetStat\",\n" +
                "    \"count\": 4\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 51,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/apifile/EditFile\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 798,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/supporter/active\",\n" +
                "    \"count\": 148\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3571,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/chatNoticeInfo/SaveAnnouncementConfig\",\n" +
                "    \"count\": 169\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 193,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/role/getRoleUserList\",\n" +
                "    \"count\": 18\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 73,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/sortProblem/insertSort\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 110,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/monitor/exportLoginStateCountBySupToExcel\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 54293917,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/out/api/getRobotSessionDetails\",\n" +
                "    \"count\": 5003533\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 182763,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/AddMemberLabel\",\n" +
                "    \"count\": 11404\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1302,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/role/listAllProductLevelLables\",\n" +
                "    \"count\": 56\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1035,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/SetSupporterOffLine\",\n" +
                "    \"count\": 24\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1730,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/chatNoticeInfo/UpdateAnnouncementConfigRedis\",\n" +
                "    \"count\": 203\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 60,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/phoneService/search\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 38,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/product/putProductInRedis\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4626,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/artificialConfig/refresh\",\n" +
                "    \"count\": 184\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 33224,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/chatRecord/getChildProblemByProductId\",\n" +
                "    \"count\": 3189\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 333109,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiDataStatReport/GetReplyEfficiencyStat\",\n" +
                "    \"count\": 348\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 324812,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/saveQuickTalkTrace\",\n" +
                "    \"count\": 134112\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 476,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/getMonitorAndHour\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1201,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiConfig/updateExtendService\",\n" +
                "    \"count\": 52\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 80706,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiServiceQuality/GetLoginStateBySup\",\n" +
                "    \"count\": 158\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 8,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/role/getallotLables\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 648,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiRobotService/listRobotHotQuestion\",\n" +
                "    \"count\": 58\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 26503425,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/service/GetLoginStateListBySup\",\n" +
                "    \"count\": 100789\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 43693,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/SetSupporterMaxGuestCount\",\n" +
                "    \"count\": 1053\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 203,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/product/updateProduct\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1115,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/reportStatistics/getManualResolutionRate\",\n" +
                "    \"count\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 30179184,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/listPushConfig\",\n" +
                "    \"count\": 8454957\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 173464,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiServiceQuality/GetChatReportList\",\n" +
                "    \"count\": 196\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 63,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiRobotService/GetRobotStatusById\",\n" +
                "    \"count\": 4\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2226,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/oauth/getUserListByIdName\",\n" +
                "    \"count\": 19\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 10304,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/SupporterManage/getPageVisitCount\",\n" +
                "    \"count\": 33\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2007982,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiServiceQuality/GetLoginStateListBySup\",\n" +
                "    \"count\": 3492\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 613,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/oauth/getRoleByUserId\",\n" +
                "    \"count\": 18\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1707899,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/session/list\",\n" +
                "    \"count\": 6636\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 538,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/oauth/listRole\",\n" +
                "    \"count\": 18\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 50059539,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/out/api/strategyCondition/getMemberInfo\",\n" +
                "    \"count\": 11878132\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 224117,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/listChatFunctionConfig\",\n" +
                "    \"count\": 78053\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 23987803,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/getChatSession\",\n" +
                "    \"count\": 3857956\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 81861,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/qucikTalk/getQuickTalkTraceList\",\n" +
                "    \"count\": 4\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 344,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/qucikTalk/listQuickTalk\",\n" +
                "    \"count\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 66,\n" +
                "    \"errs\": 1,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiChatSortStatReport/exportChatSortStat\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6080326,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/listTimeSpanAskCount\",\n" +
                "    \"count\": 79524\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 566,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/MemberLabel/postRemoveLabelAudit\",\n" +
                "    \"count\": 41\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 34,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/robotQuestionSortData/listPageType\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 24756,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiServiceQuality/ExportSatisfactionList\",\n" +
                "    \"count\": 65\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 49,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/warnRule/getSendType\",\n" +
                "    \"count\": 10\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 202,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/out/api/getProductList\",\n" +
                "    \"count\": 27\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2959,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiRobotService/GetOrderStatusList\",\n" +
                "    \"count\": 256\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2276,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/service/GetReplyEfficiencyStat\",\n" +
                "    \"count\": 357\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5769944,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/jobMonitor/robotHourChatCount\",\n" +
                "    \"count\": 140\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 217,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/liveChatSystemData/addSelfHelp\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 30,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/RemoveMemberLabel\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 67092,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/chatRecord/exportRecordToEmail\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2005250,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/oauth/left_menu_list\",\n" +
                "    \"count\": 34175\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 74,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/supporterGroup/addGroup\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3118,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/SupporterManage/batchSaveSupporter\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5928151,\n" +
                "    \"errs\": 6,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/GetSupporterMultiProductList\",\n" +
                "    \"count\": 41507\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 208,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/resource/listEvalutionTypes\",\n" +
                "    \"count\": 26\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 166,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/pageInfoConfig/listPageInfo\",\n" +
                "    \"count\": 8\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 28,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiServiceQuality/GetSatisfactionCount\",\n" +
                "    \"count\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1825,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/monitor/exportTranInfoByDetail\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 242,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/qucikTalk/listQuickTalkExport\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 24597,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/static/*\",\n" +
                "    \"count\": 16321\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3879407,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiDataStatReport/GetFieldContent\",\n" +
                "    \"count\": 860060\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4220500,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiServiceQuality/GetSatisfactionCount\",\n" +
                "    \"count\": 57769\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 25493,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/reportjob/syncChatSessionStat\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 12947,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/qucikTalk/updateRedis\",\n" +
                "    \"count\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 620,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/preQuestion/batchAddQuestion\",\n" +
                "    \"count\": 22\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2855,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/UpdateSupporterInfo\",\n" +
                "    \"count\": 201\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4568,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/*\",\n" +
                "    \"count\": 5681\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4852,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/oauth/SetSupporterInfo\",\n" +
                "    \"count\": 464\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 9282,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/liveChatSystemData/listSelfHelpCount\",\n" +
                "    \"count\": 113\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 422767,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/listArtificialConfigs\",\n" +
                "    \"count\": 185986\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1080,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/chatNoticeInfo/GetAnnouncementConfigDetail\",\n" +
                "    \"count\": 211\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 32,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/chatNoticeInfo/DeleteAnnouncementConfig\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 359,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/SupporterManage/getOperation\",\n" +
                "    \"count\": 62\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3074806,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/chatRecord/getSumReplyEfficiencyCount\",\n" +
                "    \"count\": 8029\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 27691,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/enum/listAllProduct\",\n" +
                "    \"count\": 3043\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 68309841,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/service/querySumTimeSpanList\",\n" +
                "    \"count\": 509813\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 679,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/push/getConfig\",\n" +
                "    \"count\": 87\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 613564,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/apifile/GetPlatformImgUrl\",\n" +
                "    \"count\": 131609\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 966,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiRobotService/InsertRobotHotAsk\",\n" +
                "    \"count\": 36\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 183576,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/MemberLabel/getAuditRecordList\",\n" +
                "    \"count\": 3325\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1434,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiDataStatReport/ExportReplyEfficiencyStat\",\n" +
                "    \"count\": 18\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1448,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/preQuestion/listRobotPreQuestion\",\n" +
                "    \"count\": 59\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 11717,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiDataStatReport/GetQuotaReadTapeStat\",\n" +
                "    \"count\": 18\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 37620,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/listPhoneService\",\n" +
                "    \"count\": 9240\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 64015,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/qucikTalk/exportQuickTalkTraceList\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5886,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/SupporterManage/listSupporterForAllot\",\n" +
                "    \"count\": 176\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5005,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/preQuestion/searchRobotPreQuestion\",\n" +
                "    \"count\": 117\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 29387,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/warnRule/getList\",\n" +
                "    \"count\": 48\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 74,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/strategy/list\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1488,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/out/api/exportChatContent\",\n" +
                "    \"count\": 21\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 88,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/apifile/GetTagList\",\n" +
                "    \"count\": 25\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 838,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/apifile/UploadFile\",\n" +
                "    \"count\": 6\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3526,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/listReverseRecallConfigs\",\n" +
                "    \"count\": 2520\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 454,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/warnRule/getDetail\",\n" +
                "    \"count\": 33\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1711,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/SetSupporterSelHide\",\n" +
                "    \"count\": 42\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1257483,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/chatInfoManageData/listOtherReason\",\n" +
                "    \"count\": 1865\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 12447828,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/GetGuestStatusCount\",\n" +
                "    \"count\": 39774\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 8924179,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/out/api/robotMonitoring\",\n" +
                "    \"count\": 10078\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 885,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/UpdateSupporterSourceType\",\n" +
                "    \"count\": 25\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1964,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiDataStatReport/ExportChatSessRepeatDetStat\",\n" +
                "    \"count\": 13\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 275059,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiServiceQuality/GetChatRecordList\",\n" +
                "    \"count\": 8474\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 9307,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/monitor/getTranInfoCountByPro\",\n" +
                "    \"count\": 23\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5254633,\n" +
                "    \"errs\": 7,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/GetSupporterList\",\n" +
                "    \"count\": 42336\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 80,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/robFirstReply/refresh\",\n" +
                "    \"count\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 416725,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiServiceQuality/GetSortProblemTreeView\",\n" +
                "    \"count\": 8803\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 27,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/sortProblem/getSupSortModel\",\n" +
                "    \"count\": 4\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 85,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/ApiRobotService/SaveRobotStatusMapping\",\n" +
                "    \"count\": 4\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1954,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/liveChatSystemData/setSelfHelpInRedis\",\n" +
                "    \"count\": 25\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 138345,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/ApiMonitor/GetGroupMultiProductList\",\n" +
                "    \"count\": 21205\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 244,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/livebroadcasting/get\",\n" +
                "    \"count\": 33\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 8759070,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/cache_producer/supporter_guest\",\n" +
                "    \"count\": 1007\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3617,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/listCityPolicyConfigs\",\n" +
                "    \"count\": 1575\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 683,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/admin/liveChatSystemData/selfHelpDialog\",\n" +
                "    \"count\": 46\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 64367526,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/outInterFace/GetChatMemberLabel\",\n" +
                "    \"count\": 3075572\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 345,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/admin/repeatAdvisory/listChatHistory\",\n" +
                "    \"count\": 6\n" +
                "  }\n" +
                "]";
    }

    private static String robotData() {
        return "[\n" +
                "  {\n" +
                "    \"elapsed\": 170865052,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/init\",\n" +
                "    \"count\": 4265062\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1791932,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatrobot/api/robot/unsolvedOptimized\",\n" +
                "    \"count\": 31482\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 27872772,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/getConfig\",\n" +
                "    \"count\": 3978484\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3779102679,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/robotResponse\",\n" +
                "    \"count\": 4348770\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 246,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/test/forwardRequest\",\n" +
                "    \"count\": 4\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 458568,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/out/listRobotCommonQuestions\",\n" +
                "    \"count\": 33253\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 31701350,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatrobot/api/strategyCondition/getMemberInfo\",\n" +
                "    \"count\": 7012863\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 17374011,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/out/openPlatform/init\",\n" +
                "    \"count\": 64393\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4991548,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/out/getMemberSysTypeByProduct\",\n" +
                "    \"count\": 66779\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1502728,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/out/syncOrderScore\",\n" +
                "    \"count\": 141551\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2112,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/out/getPlatSourceProductId\",\n" +
                "    \"count\": 1038\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"OPTIONS /livechatrobot/api/robot/getHotQuestionNew\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 460,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatrobot/*\",\n" +
                "    \"count\": 156\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 32,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/out/refreshData\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 79,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"OPTIONS /livechatrobot/api/robot/heartbeat\",\n" +
                "    \"count\": 62\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5136277,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/out/getOrderLabel\",\n" +
                "    \"count\": 1725768\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 103092566,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/getOneWayMessage\",\n" +
                "    \"count\": 5257474\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 210,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/addFeedBackOld\",\n" +
                "    \"count\": 29\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2923640417,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/createRobGuest\",\n" +
                "    \"count\": 4232357\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 138,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/**\",\n" +
                "    \"count\": 24\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 798756,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/forwarding/workOrder\",\n" +
                "    \"count\": 8501\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 100108,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/out/checkQuestionValid\",\n" +
                "    \"count\": 1290\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 161,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/firstContent\",\n" +
                "    \"count\": 52\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 722,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatrobot/api/order/sessionId/{guestId}/{product}\",\n" +
                "    \"count\": 155\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3635161,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/addXiaoIHotClick\",\n" +
                "    \"count\": 588970\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1316259,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/setFaqQuestion\",\n" +
                "    \"count\": 84092\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 296,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatrobot/api/msg/acquireId\",\n" +
                "    \"count\": 1198\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5736913,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/out/listRobotQuestions\",\n" +
                "    \"count\": 362103\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1369195783,\n" +
                "    \"errs\": 1,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/predict\",\n" +
                "    \"count\": 2562224\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 32116212,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatrobot/api/push/send\",\n" +
                "    \"count\": 3948511\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3874508,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/recommendMatchOrder\",\n" +
                "    \"count\": 5594\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1125980,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/addFeedBack\",\n" +
                "    \"count\": 41059\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"OPTIONS /livechatrobot/api/robot/firstReply\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1949171,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/session/changeServiceState\",\n" +
                "    \"count\": 603708\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 305633820,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/getRecommend\",\n" +
                "    \"count\": 11165333\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 106681223,\n" +
                "    \"errs\": 374,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/loadHistory\",\n" +
                "    \"count\": 1353953\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 172564966,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/out/serviceSchedule/resume\",\n" +
                "    \"count\": 16381615\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET\",\n" +
                "    \"count\": 60\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5536278,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/heartbeat\",\n" +
                "    \"count\": 1783193\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 387233300,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/out/openPlatform/openApi\",\n" +
                "    \"count\": 275127\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 465292,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/getHotQuestionNew\",\n" +
                "    \"count\": 7480\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 643,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/getNoOrderQuestion\",\n" +
                "    \"count\": 25\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 745,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatrobot/**\",\n" +
                "    \"count\": 310\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 17095057,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/work/init\",\n" +
                "    \"count\": 31617\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"OPTIONS /livechatrobot/api/robot/createRobGuest\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 17034955,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatrobot/api/robot/queueStrategy\",\n" +
                "    \"count\": 3914648\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"OPTIONS /livechatrobot/api/robot/init\",\n" +
                "    \"count\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 42,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/*\",\n" +
                "    \"count\": 11\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 15889038,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatrobot/api/robot/firstReply\",\n" +
                "    \"count\": 2642743\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 994438,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/out/serviceOrderOutButton\",\n" +
                "    \"count\": 11227\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6473659,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/push/pushAssistantMessage\",\n" +
                "    \"count\": 591724\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 159,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/test/forwardDsf\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 18616,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatrobot/api/job/streamRecordData\",\n" +
                "    \"count\": 10079\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 16004158,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/out/getServiceOrderOut\",\n" +
                "    \"count\": 221048\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 317722509,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatrobot/api/robot/getHotQuestionList\",\n" +
                "    \"count\": 3823314\n" +
                "  }\n" +
                "]";
    }

    private static String custData() {
        return "[\n" +
                "  {\n" +
                "    \"elapsed\": 257733,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/robot/inner/isHasSupporter\",\n" +
                "    \"count\": 3845\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 51607581,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/guest/clearNotActiveGuest\",\n" +
                "    \"count\": 10078\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 36,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/*\",\n" +
                "    \"count\": 21\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 571728,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/robot/inner/updateLastSession\",\n" +
                "    \"count\": 192249\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 90628,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/addLeaveMsg\",\n" +
                "    \"count\": 473\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 39533079,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/noticeInput\",\n" +
                "    \"count\": 6171155\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 904875,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/addEvaluate\",\n" +
                "    \"count\": 34174\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 45279806,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/robot/isHasSupporter\",\n" +
                "    \"count\": 223119\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5837,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/guest/getWaitQueue\",\n" +
                "    \"count\": 385\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 62261,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/noticeWaitQueue\",\n" +
                "    \"count\": 90595\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 27304611,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/getImgUrl\",\n" +
                "    \"count\": 45871\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6689339,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/job/checkDelayAllotOverFlow\",\n" +
                "    \"count\": 604663\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2684,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/out/allot/init\",\n" +
                "    \"count\": 118\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3061876,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/out/noticeGuestWaitState\",\n" +
                "    \"count\": 12476\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1954803,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/removeCacheGuest\",\n" +
                "    \"count\": 35223\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 9700,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/out/evaluate/verify\",\n" +
                "    \"count\": 2864\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 24269753,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/robot/inner/searchAllotLabel\",\n" +
                "    \"count\": 4320530\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 528821786,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/out/session/listMessages\",\n" +
                "    \"count\": 27051463\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 989218,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/robot/cancelSupporterWaitting\",\n" +
                "    \"count\": 6310\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4013935,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/out/guest/chatLinkUrl\",\n" +
                "    \"count\": 1208793\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1664,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/guest/getAdviceInfo\",\n" +
                "    \"count\": 565\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 8993,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/out/searchUserData\",\n" +
                "    \"count\": 3114\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 554115,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/updateGuestConnectionId\",\n" +
                "    \"count\": 50850\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2542430,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/im/getConnectionId\",\n" +
                "    \"count\": 1235482\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 7464791,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/operatorOrder\",\n" +
                "    \"count\": 64944\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 16390855,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/job/delayHandleUpdateEsMessageData\",\n" +
                "    \"count\": 21112\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 273,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/**\",\n" +
                "    \"count\": 126\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4147209,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/uploadImg\",\n" +
                "    \"count\": 55209\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 11117,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/out/allot/getDBMonitorData\",\n" +
                "    \"count\": 2243\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 278501,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/guest/leaveSession\",\n" +
                "    \"count\": 7394\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 34807,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/out/allot/getMonitorData\",\n" +
                "    \"count\": 2242\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 50522,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST //livechatcust/api/robot/inner/isHasSupporter\",\n" +
                "    \"count\": 901\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 720700,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/autoReplyRequest\",\n" +
                "    \"count\": 158000\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 0,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET\",\n" +
                "    \"count\": 16\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1603564,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/robot/inner/notifySupporterManMachineRobotChat\",\n" +
                "    \"count\": 1131113\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 171087,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/operatorMessage\",\n" +
                "    \"count\": 1268\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 26979,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/firstReply\",\n" +
                "    \"count\": 5632\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 9782562,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/robot/inner/updateMessageContent\",\n" +
                "    \"count\": 112660\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 11105439,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/closeChat\",\n" +
                "    \"count\": 195879\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3862246,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/guest/noticeGuestLeave\",\n" +
                "    \"count\": 1680\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 14041868,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/job/jobLeaveSession\",\n" +
                "    \"count\": 15115\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 56540668,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/guest/getWXApiConfig\",\n" +
                "    \"count\": 2937336\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4192,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/guest/checkRepeat\",\n" +
                "    \"count\": 2572\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 12495004,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/api/robot/inner/getGuestInfo\",\n" +
                "    \"count\": 4319425\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 255343,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/out/openPlatform/sendMsg\",\n" +
                "    \"count\": 386794\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 178530,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/robot/inner/allotService\",\n" +
                "    \"count\": 3510\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 198,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcust/*\",\n" +
                "    \"count\": 67\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 107737343,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/robot/tranToSupport\",\n" +
                "    \"count\": 199777\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 267103,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/robot/inner/removeGuest\",\n" +
                "    \"count\": 5925\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 133141928,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/decrMessageCount\",\n" +
                "    \"count\": 3091739\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 52,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/**\",\n" +
                "    \"count\": 14\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 7784257,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/updateOldConnectionWap\",\n" +
                "    \"count\": 1309433\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 19,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"OPTIONS /livechatcust/api/robot/isHasSupporter\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 228129950,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/sendToSupporterWap\",\n" +
                "    \"count\": 2198600\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 70035,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/robot/inner/checkUserUnRead\",\n" +
                "    \"count\": 108675\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 13650,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/out/evaluate/add\",\n" +
                "    \"count\": 944\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 683764,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcust/api/guest/addGuestLeaveLog\",\n" +
                "    \"count\": 56993\n" +
                "  }\n" +
                "]";
    }

    private static String coreData() {
        return "[\n" +
                "  {\n" +
                "    \"elapsed\": 298882,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/canOperatorHide\",\n" +
                "    \"count\": 40469\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2351,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/getMemberLabelProducts\",\n" +
                "    \"count\": 4\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 271,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/getSessionRelatedOrders\",\n" +
                "    \"count\": 54\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3176605,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/inner/Support/listProSortProblemByProductId\",\n" +
                "    \"count\": 37057\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 74,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/static/*\",\n" +
                "    \"count\": 4847\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 499,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/api/submitSort\",\n" +
                "    \"count\": 20\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 199702915,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/SendToGuest\",\n" +
                "    \"count\": 3072206\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 258950,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/SendEvaluate\",\n" +
                "    \"count\": 4596\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 23384,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/addNoSolve\",\n" +
                "    \"count\": 3983\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 908,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/api/changeSupportState\",\n" +
                "    \"count\": 202\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 7243,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/api/updateSupporterInfo\",\n" +
                "    \"count\": 577\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 66,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/inner/Support/listHotelCash\",\n" +
                "    \"count\": 17\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 40330647,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/recommendAnswer\",\n" +
                "    \"count\": 1021853\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3099179,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/api/saveCheckInfo\",\n" +
                "    \"count\": 13449\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 31654349,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/GetHistorySupport\",\n" +
                "    \"count\": 265641\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3531999,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/vatInvoice\",\n" +
                "    \"count\": 6302\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 644674,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/api/getImPlusInit\",\n" +
                "    \"count\": 106262\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1730931,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/inner/Support/listAISummary\",\n" +
                "    \"count\": 23936\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 461638,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/api/qualityHandler\",\n" +
                "    \"count\": 40710\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 301126,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/api/getSupporterInfo\",\n" +
                "    \"count\": 63228\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 259131538,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/noticeInput\",\n" +
                "    \"count\": 27003161\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2683271,\n" +
                "    \"errs\": 1,\n" +
                "    \"destId\": \"GET /livechatcore/inner/Support/GetQuickTalkList\",\n" +
                "    \"count\": 124048\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1797506,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/ChangeState\",\n" +
                "    \"count\": 85754\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4999,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/UpdateSupport\",\n" +
                "    \"count\": 513\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1333826,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/adopt\",\n" +
                "    \"count\": 24827\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 407,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/sendPicByEmail\",\n" +
                "    \"count\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 774912859,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/searchKnowledge\",\n" +
                "    \"count\": 1923188\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 19144,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/common/enum/listLiveState\",\n" +
                "    \"count\": 4694\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1578200,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/switchSupporter\",\n" +
                "    \"count\": 4000\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 310,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/addBlack\",\n" +
                "    \"count\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 87633,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/api/addSendEvaluateCount\",\n" +
                "    \"count\": 16259\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 61,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/inner/member/getTrafficRights\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1654736,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/sendRichMess\",\n" +
                "    \"count\": 24262\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 10275576,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/getAllSupporter\",\n" +
                "    \"count\": 23672\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3829619,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/DeleteCache\",\n" +
                "    \"count\": 153723\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 339981168,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/PullMemberInfo\",\n" +
                "    \"count\": 2660550\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 244722,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/inner/Support/hasSorted\",\n" +
                "    \"count\": 43122\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 88112,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/trace/knowledge\",\n" +
                "    \"count\": 24917\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 7368,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/**\",\n" +
                "    \"count\": 1585\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 274,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/inner/Support/getBlackReason\",\n" +
                "    \"count\": 9\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2807964,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/inner/Support/getUnfinishedSR\",\n" +
                "    \"count\": 29008\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3097,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/*\",\n" +
                "    \"count\": 3989\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 388407,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/getSupporterKpi\",\n" +
                "    \"count\": 19476\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 117378,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/inner/Support/getTenReplyAndRepeatAsk\",\n" +
                "    \"count\": 20765\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 32484,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/inner/Support/urgeSR\",\n" +
                "    \"count\": 446\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 7981552,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/api/crmEvaluate\",\n" +
                "    \"count\": 125185\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 39862807,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/operatorOrderBtn\",\n" +
                "    \"count\": 102852\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/*\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 68444,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/GetScalpedProduct\",\n" +
                "    \"count\": 121\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6378,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/PostScalpedLabel\",\n" +
                "    \"count\": 119\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/api/selImPlusMenu\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 14467,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/api/changeStateByNewJobNumber\",\n" +
                "    \"count\": 640\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5207175,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/operatorOrder\",\n" +
                "    \"count\": 25099\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 821873,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/addSortProblem\",\n" +
                "    \"count\": 33157\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 905615732,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/api/order/operatorOrderBtn\",\n" +
                "    \"count\": 4264864\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1381044,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/saveCheckInfo\",\n" +
                "    \"count\": 11531\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2050498,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/NewSupportInit\",\n" +
                "    \"count\": 22343\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 444503,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/logout\",\n" +
                "    \"count\": 19764\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 344796,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/LoginCheck\",\n" +
                "    \"count\": 20779\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3135605,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/PullMembersNew\",\n" +
                "    \"count\": 299163\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 8668309,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/operation\",\n" +
                "    \"count\": 2515276\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2304923,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/PullChatMsg\",\n" +
                "    \"count\": 18144\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 416958,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/addSupporterIdle\",\n" +
                "    \"count\": 50530\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2165150,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/api/getSupporterKpi\",\n" +
                "    \"count\": 108267\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 13995,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/collection/saveCollectionData\",\n" +
                "    \"count\": 943\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 62896,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/common/enum/listLiveState\",\n" +
                "    \"count\": 16112\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1110116,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/PullWaitGuest\",\n" +
                "    \"count\": 85507\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 175136,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/inner/Support/listLinkAddress\",\n" +
                "    \"count\": 20569\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 17146925,\n" +
                "    \"errs\": 6,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/getProductInfo\",\n" +
                "    \"count\": 20816\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1307111,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/feedback\",\n" +
                "    \"count\": 24837\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2353991,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/saveQuickTalkTrace\",\n" +
                "    \"count\": 134302\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6580839,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/pullMemberExtraInfo\",\n" +
                "    \"count\": 414840\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 13940611,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/PullChatMessages\",\n" +
                "    \"count\": 844648\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 27094891,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/decrMessageCount\",\n" +
                "    \"count\": 2549059\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 974055,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/uploadImg\",\n" +
                "    \"count\": 31158\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1444,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/api/clearUselessRedisKey\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 7684,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/api/setSupporterOffLine\",\n" +
                "    \"count\": 313\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 442374977,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/getWaitCount\",\n" +
                "    \"count\": 17471959\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1763,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/api/ivrEvaluate\",\n" +
                "    \"count\": 67\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 54263,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/inner/collection/getCollectionData\",\n" +
                "    \"count\": 8370\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 838552,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatcore/inner/Support/revokeMessage\",\n" +
                "    \"count\": 13555\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 553,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/api/test/supporter/login\",\n" +
                "    \"count\": 21\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2282142,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatcore/inner/Support/listCommonPics\",\n" +
                "    \"count\": 20573\n" +
                "  }\n" +
                "]";
    }

    private static String memberData() {
        return "[\n" +
                "  {\n" +
                "    \"elapsed\": 162110,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /scalped/record/page/query\",\n" +
                "    \"count\": 3321\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 9852,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /guest_id/list/mobile/{mobile}\",\n" +
                "    \"count\": 6178\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 78821373,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /label/listRecordLastStatus\",\n" +
                "    \"count\": 7663665\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1738906,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /member_info/newest/EL/{ELMemberId}\",\n" +
                "    \"count\": 722055\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 12898834,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /member_info/newest/open_id/{OpenId}\",\n" +
                "    \"count\": 3495644\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 24917047,\n" +
                "    \"errs\": 4,\n" +
                "    \"destId\": \"POST /member_info/update\",\n" +
                "    \"count\": 3527749\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 9980390,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /member_info/add\",\n" +
                "    \"count\": 784735\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 323298,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /label/get/one\",\n" +
                "    \"count\": 208714\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 35674079,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /**\",\n" +
                "    \"count\": 32207861\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4453109,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /guest_id/list/member/{MemberId}\",\n" +
                "    \"count\": 2327172\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 141,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /scalped/record/history\",\n" +
                "    \"count\": 24\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 100072,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /scalped/record/audit\",\n" +
                "    \"count\": 10500\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 11,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /scalped/record/listReasons\",\n" +
                "    \"count\": 4\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 17916998,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /list_member/info/guest_ids\",\n" +
                "    \"count\": 551943\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6415262,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /member_info/newest/member\",\n" +
                "    \"count\": 2067116\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 63938556,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /label/listDetails\",\n" +
                "    \"count\": 6924709\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 69885739,\n" +
                "    \"errs\": 1,\n" +
                "    \"destId\": \"GET /member_info/guest_id/{guestId}\",\n" +
                "    \"count\": 41553924\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 137,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /list_member/info/mobile/{mobile}\",\n" +
                "    \"count\": 29\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1927441,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /guest_id/list/open_id/{OpenId}\",\n" +
                "    \"count\": 1048216\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 131581,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /scalped/record/add\",\n" +
                "    \"count\": 12012\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 242,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /scalped/record/remove\",\n" +
                "    \"count\": 41\n" +
                "  }\n" +
                "]";
    }

    private static String jobData() {
        return "[\n" +
                "  {\n" +
                "    \"elapsed\": 5375441,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/business/wxFeedBack\",\n" +
                "    \"count\": 10078\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4087,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/messagesummary/summaryETL\",\n" +
                "    \"count\": 60471\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 14709,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/supporter_login/auto_complete\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4552029,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/job/report/chatStatSession/add\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1216326,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/business/repeatAdvisoryWarning\",\n" +
                "    \"count\": 1008\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 82418,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/session/push/ivrRecallOrder\",\n" +
                "    \"count\": 10079\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1220,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/session/push/knowledgeSort\",\n" +
                "    \"count\": 1008\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1354113,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/robotQuestion/cleanMySQL/{size}\",\n" +
                "    \"count\": 120944\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 33108,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/monitor/refreshMonitorInfo\",\n" +
                "    \"count\": 21\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 66512511,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/robotQuestion/transferToMySql\",\n" +
                "    \"count\": 10079\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 7961,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/job/monitor/alarm\",\n" +
                "    \"count\": 19\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 251129,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/session/push/ivrDelayRecall\",\n" +
                "    \"count\": 10079\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 30018,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/allot/allotClear\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 45780,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/supporter_login/check\",\n" +
                "    \"count\": 10079\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 20759286,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/session/push/crmEvaluate\",\n" +
                "    \"count\": 10078\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 103,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/session/markTest\",\n" +
                "    \"count\": 168\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4743,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/job/session/push/ivrSatisfactionRecall\",\n" +
                "    \"count\": 1230\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 66696357,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/allot/allotMonitor\",\n" +
                "    \"count\": 10079\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 54774,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/average_reply_time/session/repaire\",\n" +
                "    \"count\": 84\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1673199,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/report/message/clearManualDay\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6745091,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/session/snapshot/recordSupporterServiceSnapshot\",\n" +
                "    \"count\": 20158\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 27,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/waring_handel/DB/{chargeId}\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 770,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/weChatComplain/errorMessage/recheck\",\n" +
                "    \"count\": 672\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 648759,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/weChatComplain/negotiationHistory/{workId}\",\n" +
                "    \"count\": 115640\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 420,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/average_reply_time/statistics/supporter\",\n" +
                "    \"count\": 154\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4789646,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/session/push/robotEvaluate\",\n" +
                "    \"count\": 7\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2432739,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/product/caution/saturation\",\n" +
                "    \"count\": 2016\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 39267613,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/**\",\n" +
                "    \"count\": 19317324\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 63875,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechat/job/home/wxWork/asyncResponse\",\n" +
                "    \"count\": 24902\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 188,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechat/job/average_reply_time/date/append\",\n" +
                "    \"count\": 154\n" +
                "  }\n" +
                "]";
    }

    private static String orderData() {
        return "[\n" +
                "  {\n" +
                "    \"elapsed\": 359318,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/listSRCount\",\n" +
                "    \"count\": 5912\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1335556,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/guest/userOperator\",\n" +
                "    \"count\": 6865\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1626813,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/chatplat/getConfig\",\n" +
                "    \"count\": 101483\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 35483,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/workOrder/templateInfo\",\n" +
                "    \"count\": 1501\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1964,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/GetMemberEticketNo\",\n" +
                "    \"count\": 46\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 2409,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/workorder/listType\",\n" +
                "    \"count\": 100\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 10843774,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/crmJudgeServiceAddLog\",\n" +
                "    \"count\": 218204\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1675271,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/getCheckOrderSession/byOrderId\",\n" +
                "    \"count\": 580233\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 67947685,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/guest/setOrderCardHist\",\n" +
                "    \"count\": 3416381\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1249149,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/CreateMemberCRMServiceOrder\",\n" +
                "    \"count\": 171480\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 482,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/proxy/post\",\n" +
                "    \"count\": 6\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5326,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/workorder/getDetail\",\n" +
                "    \"count\": 145\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3915787,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/GetMemberCRMServiceOrderCount\",\n" +
                "    \"count\": 253049\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1505725,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatorder/inner/Support/getRepeatCount\",\n" +
                "    \"count\": 99663\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 64511,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/flight/refundUrge\",\n" +
                "    \"count\": 8496\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 42045808,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/sub/add\",\n" +
                "    \"count\": 45771\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 391573,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/GetOrderDetail\",\n" +
                "    \"count\": 14004\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 10868766,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/shuKe/listCrmOverflowTags\",\n" +
                "    \"count\": 412490\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3051221,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/sub/verify\",\n" +
                "    \"count\": 64707\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 67181,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/getNoticeInfo\",\n" +
                "    \"count\": 29122\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 66251,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatorder/inner/Support/listSrSummarys\",\n" +
                "    \"count\": 48\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3776098,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/ServiceSync\",\n" +
                "    \"count\": 104243\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 18226468,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/shuKe/listSkCrmElement\",\n" +
                "    \"count\": 412500\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 84053,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/trackOperation/saveOperationData\",\n" +
                "    \"count\": 25840\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 38833809,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/GetMemberMultiOrders\",\n" +
                "    \"count\": 413178\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 7488,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/addSrOrder\",\n" +
                "    \"count\": 23\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 24245,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/getMailInfoBySerialId\",\n" +
                "    \"count\": 1713\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 243731592,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/order/getDetails\",\n" +
                "    \"count\": 1667676\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 15309153,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/shuKe/searchCrmEvent\",\n" +
                "    \"count\": 413705\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 685690364,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/guest/getOrderDetail\",\n" +
                "    \"count\": 3362278\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 33297,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/shuKe/listCrmRecommends\",\n" +
                "    \"count\": 1264\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 56911648,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/guest/getSelfHelpNew\",\n" +
                "    \"count\": 3219014\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 88033,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/shuKe/createCrmEvent\",\n" +
                "    \"count\": 1214\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4814,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/getExpressProgress\",\n" +
                "    \"count\": 186\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 0,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET\",\n" +
                "    \"count\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 437765364,\n" +
                "    \"errs\": 3383,\n" +
                "    \"destId\": \"POST /livechatorder/api/guest/getOrderInfo\",\n" +
                "    \"count\": 3880391\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 852893,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/guest/getLoadProject\",\n" +
                "    \"count\": 406481\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 13571217,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/crm/syncCrmService\",\n" +
                "    \"count\": 163539\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 268945,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/leave/addWorkOrder\",\n" +
                "    \"count\": 1390\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 24,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"GET /livechatorder/*\",\n" +
                "    \"count\": 26\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4100,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/guest/add\",\n" +
                "    \"count\": 131\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 3465,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST //livechatorder/api/dujia/requireOrder\",\n" +
                "    \"count\": 18\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 5,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/*\",\n" +
                "    \"count\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 9140061,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/guest/getSelfHelp\",\n" +
                "    \"count\": 1008079\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 108617,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/flight/changeMobile\",\n" +
                "    \"count\": 779\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 357467,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/sub/template\",\n" +
                "    \"count\": 21559\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 25253823,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/guest/getCouponList\",\n" +
                "    \"count\": 1959105\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 4340,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/workorder/add\",\n" +
                "    \"count\": 49\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 6508,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/flight/certificate\",\n" +
                "    \"count\": 336\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 7167150,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/shuKe/existEvents\",\n" +
                "    \"count\": 8201\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1858,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/chatplat/getConfig4EL\",\n" +
                "    \"count\": 117\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 1107,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/inner/Support/AddCRMAdvBooking\",\n" +
                "    \"count\": 31\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 407677,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/sub/quesTypes\",\n" +
                "    \"count\": 43174\n" +
                "  },\n" +
                "  {\n" +
                "    \"elapsed\": 131,\n" +
                "    \"errs\": 0,\n" +
                "    \"destId\": \"POST /livechatorder/api/workorder/cancelOrder\",\n" +
                "    \"count\": 2\n" +
                "  }\n" +
                "]";
    }

    @Data
    public static class A {
        private String destId;
        private long count;
        private long elapsed;

        public long elapsedTime() {
            if (count == 0) {
                return 0;
            }
            return elapsed / count;
        }

    }

    private static String uk(String d) {
        d = d.replace("GET /", "").replace("POST /", "");
        String[] split = d.split("/");
        if ("livechat".equals(split[0]) && split.length > 1) {
            return String.format("%s.%s", split[0], split[1]);
        }
        return split[0];
    }

    private static String outApi(String d) {
        if (StringUtils.containsAny(d, "/out/", "outInterFace")) {
            return "外部";
        }

        return "内部";
    }

}
