package syc.learn;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author syc
 * @date 2024/1/31
 */
public class MenuTitle {

    public static void main(String[] args) {
        String s = "{\n" +
                "    \"code\": 10000,\n" +
                "    \"msg\": \"ok\",\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 102232,\n" +
                "            \"name\": \"ConfigManage\",\n" +
                "            \"title\": \"ConfigManage\",\n" +
                "            \"url\": \"\",\n" +
                "            \"orderNo\": null,\n" +
                "            \"mtype\": 10,\n" +
                "            \"hasPermisson\": null,\n" +
                "            \"subMenuList\": [\n" +
                "                {\n" +
                "                    \"id\": 119824,\n" +
                "                    \"name\": \"SourceTypeManage\",\n" +
                "                    \"title\": \"SourceTypeManage\",\n" +
                "                    \"url\": \"~/ConfigManage/SourceTypeManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 104938,\n" +
                "                    \"name\": \"ProductManageNew\",\n" +
                "                    \"title\": \"ProductManage\",\n" +
                "                    \"url\": \"~/ConfigManage/ProductManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105134,\n" +
                "                    \"name\": \"PageInfoConfigNew\",\n" +
                "                    \"title\": \"PageInfoConfigNew\",\n" +
                "                    \"url\": \"~/ConfigManage/PageInfoConfig\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105345,\n" +
                "                    \"name\": \"PageTypeManageNew\",\n" +
                "                    \"title\": \"入口咨询管理\",\n" +
                "                    \"url\": \"~/RobotService/PageTypeManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 120061,\n" +
                "                    \"name\": \"OnlineLinkManage\",\n" +
                "                    \"title\": \"OnlineLinkManage\",\n" +
                "                    \"url\": \"~/ConfigManage/OnlineLinkManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105132,\n" +
                "                    \"name\": \"CustomServiceManage\",\n" +
                "                    \"title\": \"电话客服配置\",\n" +
                "                    \"url\": \"~/ConfigManage/CustomServiceManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 102236,\n" +
                "                    \"name\": \"LinkAddressConfig\",\n" +
                "                    \"title\": \"LinkAddressConfig\",\n" +
                "                    \"url\": \"~/ConfigManage/LinkAddressConfig\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105968,\n" +
                "                    \"name\": \"SupporterSkillConfig\",\n" +
                "                    \"title\": \"SupporterSkillConfig\",\n" +
                "                    \"url\": \"~/ConfigManage/SupporterSkillConfig\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 114949,\n" +
                "                    \"name\": \"QuickTalkConfig\",\n" +
                "                    \"title\": \"QuickTalkConfig\",\n" +
                "                    \"url\": \"~/ConfigManage/QuickTalkConfig\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 114962,\n" +
                "                    \"name\": \"TalkSortConfig\",\n" +
                "                    \"title\": \"话术分类配置\",\n" +
                "                    \"url\": \"~/ConfigManage/TalkSortConfig\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 117557,\n" +
                "                    \"name\": \"kefuchannel\",\n" +
                "                    \"title\": \"kefuchannel\",\n" +
                "                    \"url\": \"~/ConfigManage/ExtendServiceConfig\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 120164,\n" +
                "                    \"name\": \"FirsReplyManage\",\n" +
                "                    \"title\": \"首次回复配置\",\n" +
                "                    \"url\": \"~/ConfigManage/FirstReplyManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 120156,\n" +
                "                    \"name\": \"AutoReplyManage\",\n" +
                "                    \"title\": \"自动回复配置\",\n" +
                "                    \"url\": \"~/ConfigManage/AutoReplyManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 124413,\n" +
                "                    \"name\": \"ConfigGroupManage\",\n" +
                "                    \"title\": \"数据组管理\",\n" +
                "                    \"url\": \"~/ConfigManage/ConfigGroupManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 124414,\n" +
                "                    \"name\": \"ConfigGroupFieldManage\",\n" +
                "                    \"title\": \"数据组字段管理\",\n" +
                "                    \"url\": \"~/ConfigManage/ConfigGroupFieldManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 124453,\n" +
                "                    \"name\": \"PushManage\",\n" +
                "                    \"title\": \"推送管理\",\n" +
                "                    \"url\": \"~/ConfigManage/PushManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 125144,\n" +
                "                    \"name\": \"ArtificialConfig\",\n" +
                "                    \"title\": \"ArtificialConfig\",\n" +
                "                    \"url\": \"~/ConfigManage/ArtificialConfig\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 138856,\n" +
                "                    \"name\": \"ChatPlatConfig\",\n" +
                "                    \"title\": \"平台入口页面配置\",\n" +
                "                    \"url\": \"~/ConfigManage/ChatPlatConfig\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 140880,\n" +
                "                    \"name\": \"LiveBroadCastingManager\",\n" +
                "                    \"title\": \"LiveBroadCastingManager\",\n" +
                "                    \"url\": \"~/ConfigManage/LiveBroadCastingManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 142665,\n" +
                "                    \"name\": \"PhoneServiceManage\",\n" +
                "                    \"title\": \"电话客服管理（新）\",\n" +
                "                    \"url\": \"~/ConfigManage/PhoneServiceManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 153496,\n" +
                "                    \"name\": \"ReverseRecallConfigManage\",\n" +
                "                    \"title\": \"电话客服预约回呼配置\",\n" +
                "                    \"url\": \"~/ConfigManage/ReverseRecallConfigManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 154506,\n" +
                "                    \"name\": \"CityPolicyConfigManage\",\n" +
                "                    \"title\": \"城市政策配置\",\n" +
                "                    \"url\": \"~/ConfigManage/CityPolicyConfigManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 102202,\n" +
                "            \"name\": \"BusinessManage\",\n" +
                "            \"title\": \"BusinessManage\",\n" +
                "            \"url\": \"\",\n" +
                "            \"orderNo\": null,\n" +
                "            \"mtype\": 10,\n" +
                "            \"hasPermisson\": null,\n" +
                "            \"subMenuList\": [\n" +
                "                {\n" +
                "                    \"id\": 104149,\n" +
                "                    \"name\": \"SupporterManage\",\n" +
                "                    \"title\": \"CustomerManage\",\n" +
                "                    \"url\": \"~/BusinessManage/SupporterManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 104313,\n" +
                "                    \"name\": \"SupporterGroupManage\",\n" +
                "                    \"title\": \"客服组管理\",\n" +
                "                    \"url\": \"~/BusinessManage/SupporterGroupManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105053,\n" +
                "                    \"name\": \"PageVisitedCountNew\",\n" +
                "                    \"title\": \"页面咨询量统计\",\n" +
                "                    \"url\": \"~/BusinessManage/PageVisitedCount\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105307,\n" +
                "                    \"name\": \"SelfHelpManageNew\",\n" +
                "                    \"title\": \"自助服务配置\",\n" +
                "                    \"url\": \"~/BusinessManage/SelfHelpManage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105302,\n" +
                "                    \"name\": \"SupportAndUnsatisfiedNew\",\n" +
                "                    \"title\": \"会话总结分类\",\n" +
                "                    \"url\": \"~/BusinessManage/SupportAndUnsatisfied\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 102203,\n" +
                "                    \"name\": \"WarningConfig\",\n" +
                "                    \"title\": \"WarningConfig\",\n" +
                "                    \"url\": \"~/BusinessManage/WarningConfig\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 102210,\n" +
                "                    \"name\": \"AnnouncementConfig\",\n" +
                "                    \"title\": \"AnnouncementConfig\",\n" +
                "                    \"url\": \"~/BusinessManage/AnnouncementConfig\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 102211,\n" +
                "            \"name\": \"MonitorManage\",\n" +
                "            \"title\": \"MonitorManage\",\n" +
                "            \"url\": \"\",\n" +
                "            \"orderNo\": null,\n" +
                "            \"mtype\": 10,\n" +
                "            \"hasPermisson\": null,\n" +
                "            \"subMenuList\": [\n" +
                "                {\n" +
                "                    \"id\": 102212,\n" +
                "                    \"name\": \"MonitorConsole\",\n" +
                "                    \"title\": \"MonitorConsole\",\n" +
                "                    \"url\": \"~/MonitorManage/MonitorConsole\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 102213,\n" +
                "                    \"name\": \"CustomServiceMonitor\",\n" +
                "                    \"title\": \"CustomServiceMonitor\",\n" +
                "                    \"url\": \"~/MonitorManage/CustomServiceMonitor\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105336,\n" +
                "                    \"name\": \"LoginMonitorNew\",\n" +
                "                    \"title\": \"登录监控\",\n" +
                "                    \"url\": \"~/MonitorManage/LoginMonitor\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105344,\n" +
                "                    \"name\": \"TranInfoCountNew\",\n" +
                "                    \"title\": \"转接详情\",\n" +
                "                    \"url\": \"~/MonitorManage/TranInfoCount\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105186,\n" +
                "                    \"name\": \"LeaveMessageNew\",\n" +
                "                    \"title\": \"留言管理\",\n" +
                "                    \"url\": \"~/MonitorManage/LeaveMessage\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 99,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105152,\n" +
                "                    \"name\": \"GuestCountChartNew\",\n" +
                "                    \"title\": \"访客数监控\",\n" +
                "                    \"url\": \"~/MonitorManage/GuestCountChart\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 104697,\n" +
                "                    \"name\": \"TimeSpanAskCountNew\",\n" +
                "                    \"title\": \"时段咨询量统计\",\n" +
                "                    \"url\": \"~/MonitorManage/TimeSpanAskCount\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 116266,\n" +
                "                    \"name\": \"RobotHourMonitor\",\n" +
                "                    \"title\": \"机器人时段监控\",\n" +
                "                    \"url\": \"~/MonitorManage/RobotHourMonitor\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 102237,\n" +
                "            \"name\": \"ChatInfo\",\n" +
                "            \"title\": \"ChatInfo\",\n" +
                "            \"url\": \"\",\n" +
                "            \"orderNo\": null,\n" +
                "            \"mtype\": 10,\n" +
                "            \"hasPermisson\": null,\n" +
                "            \"subMenuList\": [\n" +
                "                {\n" +
                "                    \"id\": 104544,\n" +
                "                    \"name\": \"ChatRecordNew\",\n" +
                "                    \"title\": \"ChatRecordNew\",\n" +
                "                    \"url\": \"~/ChatInfo/ChatRecord\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105210,\n" +
                "                    \"name\": \"ChatContentSearchNew\",\n" +
                "                    \"title\": \"ChatContentSearchNew\",\n" +
                "                    \"url\": \"~/ChatInfo/ChatContentSearch\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105204,\n" +
                "                    \"name\": \"ComplainCollectionBoxNew\",\n" +
                "                    \"title\": \"Opinion collection box\",\n" +
                "                    \"url\": \"~/ChatInfo/ComplainCollectionBox\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105495,\n" +
                "                    \"name\": \"BlackMenberCountNew\",\n" +
                "                    \"title\": \"黑名单统计与审核\",\n" +
                "                    \"url\": \"~/ChatInfo/BlackMemberCount\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 117145,\n" +
                "                    \"name\": \"BlackMemberCheckNew\",\n" +
                "                    \"title\": \"黑名单统计（新）\",\n" +
                "                    \"url\": \"~/ChatInfo/BlackMember\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 120065,\n" +
                "                    \"name\": \"MemberLabelAudit\",\n" +
                "                    \"title\": \"MemberLabelAudit\",\n" +
                "                    \"url\": \"~/ChatInfo/MemberLabelAudit\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 117264,\n" +
                "                    \"name\": \"BlackMemberReason\",\n" +
                "                    \"title\": \"拉黑原因\",\n" +
                "                    \"url\": \"~/ChatInfo/BlackReason\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 120068,\n" +
                "                    \"name\": \"RepeatAdvisory\",\n" +
                "                    \"title\": \"RepeatAdvisory\",\n" +
                "                    \"url\": \"～/ChatInfo/RepeatAdvisory\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 123004,\n" +
                "                    \"name\": \"SuperLongAdvisory\",\n" +
                "                    \"title\": \"SuperLongAdvisory\",\n" +
                "                    \"url\": \"~/ChatInfo/SuperLongAdvisory\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 102219,\n" +
                "            \"name\": \"StatisticsReport\",\n" +
                "            \"title\": \"StatisticsReport\",\n" +
                "            \"url\": \"\",\n" +
                "            \"orderNo\": null,\n" +
                "            \"mtype\": 10,\n" +
                "            \"hasPermisson\": null,\n" +
                "            \"subMenuList\": [\n" +
                "                {\n" +
                "                    \"id\": 102220,\n" +
                "                    \"name\": \"QuotaReadTape\",\n" +
                "                    \"title\": \"Indicator Overview\",\n" +
                "                    \"url\": \"~/StatisticsReport/QuotaReadTape\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 115652,\n" +
                "                    \"name\": \"NewFCRReport\",\n" +
                "                    \"title\": \"全渠道FCR报表\",\n" +
                "                    \"url\": \"~/StatisticsReport/NewFCRReport\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 102221,\n" +
                "                    \"name\": \"ServiceQualityStatistics\",\n" +
                "                    \"title\": \"ServiceQualityStatistics\",\n" +
                "                    \"url\": \"~/StatisticsReport/ServiceQualityStatistics\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 102222,\n" +
                "                    \"name\": \"ServiceEfficiencyStatistics\",\n" +
                "                    \"title\": \"ServiceEfficiencyStatistics\",\n" +
                "                    \"url\": \"~/StatisticsReport/ServiceEfficiencyStatistics\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 107549,\n" +
                "                    \"name\": \"ResolutionRate\",\n" +
                "                    \"title\": \"统一评价解决率报表\",\n" +
                "                    \"url\": \"~/StatisticsReport/ResolutionRate\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 102224,\n" +
                "                    \"name\": \"RobotHotAskStatistics\",\n" +
                "                    \"title\": \"Hot topic statistics\",\n" +
                "                    \"url\": \"~/StatisticsReport/RobotHotAskStatistics\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 105464,\n" +
                "                    \"name\": \"ToSupporterNew\",\n" +
                "                    \"title\": \"在线人工报表\",\n" +
                "                    \"url\": \"~/StatisticsReport/ToSupporter\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 118445,\n" +
                "                    \"name\": \"ChatSortProblemStatistics\",\n" +
                "                    \"title\": \"会话总结\",\n" +
                "                    \"url\": \"~/StatisticsReport/ChatSortProblemStatistics\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 121369,\n" +
                "                    \"name\": \"QuickTalkQualityStatistics\",\n" +
                "                    \"title\": \"快捷输入统计\",\n" +
                "                    \"url\": \"~/StatisticsReport/QuickTalkQualityStatistics\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 121386,\n" +
                "                    \"name\": \"RobotTranReport\",\n" +
                "                    \"title\": \"New-场景转人工报表\",\n" +
                "                    \"url\": \"~/StatisticsReport/RobotTranReport\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 121440,\n" +
                "                    \"name\": \"RobotTranDetail\",\n" +
                "                    \"title\": \"New-转人工类型明细报表\",\n" +
                "                    \"url\": \"~/StatisticsReport/RobotTranDetail\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 123502,\n" +
                "                    \"name\": \"SessionSortStatistics\",\n" +
                "                    \"title\": \"会话分类总结\",\n" +
                "                    \"url\": \"~/StatisticsReport/SessionSortStatistics\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 102225,\n" +
                "            \"name\": \"RobotService\",\n" +
                "            \"title\": \"RobotService\",\n" +
                "            \"url\": \"\",\n" +
                "            \"orderNo\": null,\n" +
                "            \"mtype\": 10,\n" +
                "            \"hasPermisson\": null,\n" +
                "            \"subMenuList\": [\n" +
                "                {\n" +
                "                    \"id\": 125933,\n" +
                "                    \"name\": \"RobotAskClassify\",\n" +
                "                    \"title\": \"小I问题分类（废弃）\",\n" +
                "                    \"url\": \"~/RobotService/RobotAskClassify\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 125934,\n" +
                "                    \"name\": \"RobotAskClassifyDetail\",\n" +
                "                    \"title\": \"小I问题分类详细（废弃）\",\n" +
                "                    \"url\": \"~/RobotService/RobotAskClassifyDetail\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 125935,\n" +
                "                    \"name\": \"SelfResolutionStatistics\",\n" +
                "                    \"title\": \"自助服务解决率（废弃）\",\n" +
                "                    \"url\": \"~/RobotService/SelfResolutionStatistics\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 102227,\n" +
                "                    \"name\": \"RobotHotAskConfig\",\n" +
                "                    \"title\": \"RobotHotAskConfig\",\n" +
                "                    \"url\": \"~/RobotService/RobotHotAskConfig\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 114581,\n" +
                "                    \"name\": \"ClassifyHotFAQConfig\",\n" +
                "                    \"title\": \"分类热门问题配置\",\n" +
                "                    \"url\": \"~/RobotService/ClassifyHotFAQConfig\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 125722,\n" +
                "                    \"name\": \"OriginalQuestionManager\",\n" +
                "                    \"title\": \"自问答问题答案配置管理\",\n" +
                "                    \"url\": \"~/RobotService/OriginalRobotQuestion\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 102229,\n" +
                "                    \"name\": \"RobotOrderStatus\",\n" +
                "                    \"title\": \"RobotOrderStatus\",\n" +
                "                    \"url\": \"~/RobotService/RobotOrderStatus\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 102231,\n" +
                "                    \"name\": \"RobotImageUpload\",\n" +
                "                    \"title\": \"消息图片/视频上传\",\n" +
                "                    \"url\": \"~/RobotService/RobotImageUpload\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 125932,\n" +
                "                    \"name\": \"XiaoIChatCountNew\",\n" +
                "                    \"title\": \"小I咨询量统计（废弃）\",\n" +
                "                    \"url\": \"~/RobotService/XiaoIChatCount\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 102535,\n" +
                "                    \"name\": \"RobotServiceQuality\",\n" +
                "                    \"title\": \"小I服务质量数据报表（废弃）\",\n" +
                "                    \"url\": \"~/RobotService/RobotServiceQuality\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 102536,\n" +
                "                    \"name\": \"RobotServiceEfficiency\",\n" +
                "                    \"title\": \"New-机器人服务效率数据报表\",\n" +
                "                    \"url\": \"~/RobotService/RobotServiceEfficiency\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 107060,\n" +
                "                    \"name\": \"XiaoIResolutionAnalysis\",\n" +
                "                    \"title\": \"小I解决率分析（废弃）\",\n" +
                "                    \"url\": \"~/RobotService/XiaoIResolutionAnalysis\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 125936,\n" +
                "                    \"name\": \"RobotHotQuestionAnalysis\",\n" +
                "                    \"title\": \"热门问题点击率统计（废弃）\",\n" +
                "                    \"url\": \"~/RobotService/RobotHotQuestionAnalysis\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 118307,\n" +
                "                    \"name\": \"QueueStrategy\",\n" +
                "                    \"title\": \"排队策略管理\",\n" +
                "                    \"url\": \"~/RobotService/QueueStrategy\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 118308,\n" +
                "                    \"name\": \"QueueStrategyConfig\",\n" +
                "                    \"title\": \"排队引导配置\",\n" +
                "                    \"url\": \"~/RobotService/Strategyconfig\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 120300,\n" +
                "                    \"name\": \"RobPreQuestionManagent\",\n" +
                "                    \"title\": \"Transfer to manual pre issue configuration\",\n" +
                "                    \"url\": \"~/RobotService/RobPreQuestion\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 121673,\n" +
                "                    \"name\": \"RobotFirstReplyManagement\",\n" +
                "                    \"title\": \"机器人首回配置\",\n" +
                "                    \"url\": \"~/RobotService/RobotFirstReplyManagement\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 123564,\n" +
                "                    \"name\": \"RobotServiceQualityNew\",\n" +
                "                    \"title\": \"NEW-机器人服务质量报表\",\n" +
                "                    \"url\": \"~/RobotService/RobotServiceQualityNew\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 123921,\n" +
                "                    \"name\": \"AssitRobot\",\n" +
                "                    \"title\": \"静默坐席问答\",\n" +
                "                    \"url\": \"~/RobotService/AssisRobot\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 124110,\n" +
                "                    \"name\": \"HotspotConsultMonitor\",\n" +
                "                    \"title\": \"热点咨询监控\",\n" +
                "                    \"url\": \"~/RobotService/HotspotConsultMonitor\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 124653,\n" +
                "                    \"name\": \"QuestionMapping\",\n" +
                "                    \"title\": \"Consultation Type Mapping Relationship\",\n" +
                "                    \"url\": \"~/RobotService/QuestionMapping\",\n" +
                "                    \"orderNo\": null,\n" +
                "                    \"mtype\": 10,\n" +
                "                    \"hasPermisson\": null,\n" +
                "                    \"subMenuList\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"needLog\": true,\n" +
                "    \"describe\": [\n" +
                "        \"function_ab.authMenu --> 1\"\n" +
                "    ]\n" +
                "}";

        JSONObject parse = JSON.parseObject(s);
        List<String> list = new ArrayList<>();
        fun(parse, list);

        System.out.println();
        System.out.println(String.join("\n", list));
    }

    private static void fun(Object obj, List<String> list) {
        if (obj instanceof JSONObject) {
            JSONObject jsonObject = (JSONObject) obj;
            Object title = (jsonObject).get("title");
            Object name = (jsonObject).get("name");
            if (title instanceof String && containChinese(String.valueOf(title))) {
//                System.out.println(title + "=" + name);
                list.add(title + "\t" + name);
            }

            for (Object value : jsonObject.values()) {
                fun(value, list);
            }
        }

        if (obj instanceof JSONArray) {
            JSONArray array = (JSONArray)obj;
            for (Object o : array) {
                fun(o, list);
            }
        }
    }

    public static boolean containChinese(String text) {
        if (StringUtils.isBlank(text)) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (isChinese(c)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static boolean isChinese(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        return (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
                || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION);
    }
}
