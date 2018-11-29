package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 告警状态与结束原因编码定义
 * @author 63136
 *
 */

public class AlarmStatusConstants {
	
	//状态正常
	public static final Integer states0=0;
	//计费控制单元停止充电
	public static final Integer states1=1;
	//充电控制单元终止充电
	public static final Integer states2=2;
	//车载BMS正常终止充电
	public static final Integer states3=3;
	//用户刷卡停止
	public static final Integer states4=4;
	//超出最大充电时间
	public static final Integer states5=5;
	//超出充电1%最大时间
	public static final Integer states6=6;
	//自动充满
	public static final Integer states7=7;
	//设定金额到达
	public static final Integer states8=8;
	//设定时间到达
	public static final Integer states9=9;
	//设定电量到达
	public static final Integer states10=10;
	//金额扣完
	public static final Integer states11=11;
	//SOC电量满
	public static final Integer states12=12;
	//服务器后台停止充电
	public static final Integer states20=20;
	
	
	
	//充电单元通信故障
	public static final Integer states100=100;
	//总电表通信故障
	public static final Integer states101=101;
	//计费电表通信故障
	public static final Integer states102=102;
	//充电单元故障
	public static final Integer states103=103;
	//系统过温故障
	public static final Integer states104=104;
	//系统欠压故障
	public static final Integer states105=105;
	//系统过压故障
	public static final Integer states106=106;
	//枪未与车连接
	public static final Integer states107=107;
	//启动充电失败
	public static final Integer states108=108;
	//充电枪正在忙
	public static final Integer states109=109;
	//充电枪正在充电中
	public static final Integer states110=110;
	//操作无效
	public static final Integer states111=111;
	
	
	//BMS辅助电源设置失败
	public static final Integer states120=120;
	
	
	
	//烟感1报警
	public static final Integer states200=200;
	//烟感2报警
	public static final Integer states201=201;
	//门1报警
	public static final Integer states202=202;
	//门2报警
	public static final Integer states203=203;
	//塑壳常闭报警
	public static final Integer states204=204;
	//塑壳常开报警
	public static final Integer states205=205;
	//防雷报警
	public static final Integer states206=206;
	//急停报警
	public static final Integer states207=207;
	//漏电报警
	public static final Integer states208=208;
	//枪1未归位报警
	public static final Integer states209=209;
	//枪2未归位报警
	public static final Integer states210=210;
	//枪3未归位报警
	public static final Integer states211=211;
	//枪4未归位报警
	public static final Integer states212=212;
	//枪1负温感报警
	public static final Integer states213=213;
	//枪1正温感报警
	public static final Integer states214=214;
	//枪2负温感报警
	public static final Integer states215=215;
	//枪2正温感报警
	public static final Integer states216=216;
	//枪3负温感报警
	public static final Integer states217=217;
	//枪3正温感报警
	public static final Integer states218=218;
	//枪4负温感报警
	public static final Integer states219=219;
	//枪4正温感报警
	public static final Integer states220=220;
	//枪1电子锁报警
	public static final Integer states221=221;
	//枪2电子锁报警
	public static final Integer states222=222;
	//枪3电子锁报警
	public static final Integer states223=223;
	//枪4电子锁报警
	public static final Integer states224=224;
	//枪1高压继电器1报警
	public static final Integer states225=225;
	//枪1高压继电器2报警
	public static final Integer states226=226;
	//枪2高压继电器1报警
	public static final Integer states227=227;
	//枪2高压继电器2报警
	public static final Integer states228=228;
	//枪3高压继电器2报警
	public static final Integer states229=229;
	//枪3高压继电器1报警
	public static final Integer states230=230;
	//枪4高压继电器1报警
	public static final Integer states231=231;
	//枪4高压继电器2报警
	public static final Integer states232=232;
	//电表1故障报警
	public static final Integer states233=233;
	//电表2故障报警
	public static final Integer states234=234;
	//电表3故障报警
	public static final Integer states235=235;
	//电表4故障报警
	public static final Integer states236=236;
	
	
	
	//BMS充满
	public static final Integer states400=400;
	//BMS告警
	public static final Integer states401=401;
	//BMS故障
	public static final Integer states402=402;
	//BMS 通信异常
	public static final Integer states403=403;
	//直流母线输出过压告警
	public static final Integer states404=404;
	//直流母线输出欠压告警
	public static final Integer states405=405;
	//蓄电池充电过流告警
	public static final Integer states406=406;
	//蓄电池模块采样点过温告警
	public static final Integer states407=407;
	//电池未连接
	public static final Integer states408=408;
	//急停按钮动作故障
	public static final Integer states409=409;
	//绝缘监测故障
	public static final Integer states410=410;
	//电池反接故障
	public static final Integer states411=411;
	//避雷器故障
	public static final Integer states412=412;
	//充电桩过温故障
	public static final Integer states413=413;
	//烟雾报警告警
	public static final Integer states414=414;
	//输入电压过压
	public static final Integer states415=415;
	//输入电压欠压
	public static final Integer states416=416;
	//充电模块故障
	public static final Integer states417=417;
	//输出接触器状态错误
	public static final Integer states418=418;
	//充电模块风扇故障
	public static final Integer states419=419;
	//充电模块过温告警
	public static final Integer states420=420;
	//充电模块交流输入告警
	public static final Integer states421=421;
	//充电模块输出短路故障
	public static final Integer states422=422;
	//充电模块输出过流告警
	public static final Integer states423=423;
	//充电模块输出过压告警
	public static final Integer states424=424;
	//充电模块输出欠压告警
	public static final Integer states425=425;
	//充电模块输入过压告警
	public static final Integer states426=426;
	//充电模块输入过压告警
	public static final Integer states427=427;
	//充电模块输入缺相告警
	public static final Integer states428=428;
	//充电模块通信告警
	public static final Integer states429=429;
	//充电中车辆控制导引告警
	public static final Integer states430=430;
	//交流断路器故障
	public static final Integer states431=431;
	//直流母线输出过流告警
	public static final Integer states432=432;
	//直流母线输出熔断器故障
	public static final Integer states433=433;
	//直流母线输出接触器故障
	public static final Integer states434=434;
	//充电接口电子锁故障
	public static final Integer states435=435;
	//充电机风扇故障
	public static final Integer states436=436;
	//充电枪过温告警
	public static final Integer states437=437;
	//充电枪未归位
	public static final Integer states438=438;
	//是否连接车辆
	public static final Integer states439=439;
	//充电桩充电枪座状态
	public static final Integer states440=440;
	//充电接口电子锁状态
	public static final Integer states441=441;
	//输出接触器状态
	public static final Integer states442=442;
	
	
	
	//交流充满
	public static final Integer states500=500;
	//交流告警
	public static final Integer states501=501;
	//交流故障
	public static final Integer states502=502;
	//交流确认开关未连接
	public static final Integer states503=503;
	//交流急停动作告警
	public static final Integer states504=504;
	//交流避雷器故障
	public static final Integer states505=505;
	//交流桩过温故障故障
	public static final Integer states506=506;
	//交流输入电压过压
	public static final Integer states507=507;
	//交流输入电压欠压
	public static final Integer states508=508;
	//输出接触器状态出错
	public static final Integer states509=509;
	//充电中车辆控制导引告警
	public static final Integer states510=510;
	//交流接触器故障
	public static final Integer states511=511;
	//交流输出过流告警
	public static final Integer states512=512;
	//输出过流保护动作
	public static final Integer states513=513;
	//充电枪未归位
	public static final Integer states514=514;
	//输出接触器状态
	public static final Integer states515=515;
	//交流断路器故障
	public static final Integer states516=516;
	//充电接口电子锁状态
	public static final Integer states517=517;
	//充电接口电子锁故障
	public static final Integer states518=518;
	//充电接口过温故障
	public static final Integer states519=519;
	//充电连接状态
	public static final Integer states520=520;
	//充电控制状态
	public static final Integer states521=521;
	//断线故障
	public static final Integer states522=522;
	//通用告警和故障
	public static final Integer states523=523;
	
	
	//停止原因
	public static final Integer states601=601;
	//中止荷电状态SOC（%）
	public static final Integer states651=651;
	//动力蓄电池单体最低电压告警
	public static final Integer states652=652;
	//动力蓄电池单体最高电压告警
	public static final Integer states653=653;
	//动力蓄电池最低温度告警
	public static final Integer states654=654;
	//动力蓄电池最高温度告警
	public static final Integer states655=655;
	//接收SPN2560=0x00的充电机辨识报文超时
	public static final Integer states656=656;
	//接收 SPN2560=0xAA 的充电机辨识报文超时
	public static final Integer states657=657;
	//接收充电机完成充电准备报文超时
	public static final Integer states658=658;
	//接收充电机完成充电准备报文超时
	public static final Integer states659=659;
	//接收充电机充电状态报文超时
	public static final Integer states660=660;
	//接收充电机中止充电报文超时
	public static final Integer states661=661;
	//接收充电机充电统计报文超时
	public static final Integer states662=662;
	//Bms 其他错误
	public static final Integer states663=663;
	//接收 BMS 和车辆的辨识报文超时
	public static final Integer states664=664;
	//接收电池充电参数报文超时
	public static final Integer states665=665;
	//接收 BMS 完成充电准备报文超时
	public static final Integer states666=666;
	//接收电池充电总状态报文超时
	public static final Integer states667=667;
	//接收电充电要求报文超时
	public static final Integer states668=668;
	//接收 BMS 中止充电报文超时
	public static final Integer states669=669;
	//接收 BMS 充电统计报文超时
	public static final Integer states670=670;
	//充电机其他错误
	public static final Integer states671=671;
	
	//车载BMS异常终止充电
	public static final Integer states700=700;
	//车载BMS故障终止充电
	public static final Integer states701=701;
	
	
	//版本校验超时
	public static final Integer states800=800;
	//参数设置超时
	public static final Integer states801=801;
	//启动充电命令
	public static final Integer states802=802;
	//等待启动充电完成状态超时
	public static final Integer states803=803;
	//停止充电命令确认超时
	public static final Integer states804=804;
	//等待停止充电完成状态超时
	public static final Integer states805=805;
	//启动充电命令确认超时
	public static final Integer states806=806;
	//等待启动充电完成状态超时
	public static final Integer states807=807;
	//停止充电命令确认超时
	public static final Integer states808=808;
	//等待停止充电完成状态超时
	public static final Integer states809=809;
	
	//未知异常
	public static final Integer states1000=1000;



}
