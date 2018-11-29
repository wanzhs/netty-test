package zc.utils;

/**
 * 定义枚举类型CMD信息
 * @author 63136
 *
 */
public enum CmdType  implements Behaviour{
	
	/**服务器向充电桩设置/查询工作参数和命令**/
	//后台服务器下发充电桩工作参数
	CMD1("CMD=1", 1), 
	//充电桩应答服务器设置工作参数
	CMD2("CMD=2", 2),
	//后台服务器下发充电桩开启充电控制命令
	CMD7("CMD=7", 7), 
	//充电桩对后台下发的充电桩开启充电控制应答
	CMD8("CMD=8", 8),
	//后台服务器对充电桩流水单号请求应答
	CMD9("CMD=9", 9),	
	//充电桩向后台服务器申请流水单号
	CMD10("CMD=10", 10), 
	//后台服务器应答充电桩用户扫码状态
	CMD11("CMD=11",11),
	//充电桩对服务器扫码状态的应答
	CMD12("CMD=12", 12),
	
	/**服务器应答心跳包信息**/
	//服务器应答心跳包信息
	CMD101("CMD=101", 101),
	//充电桩上传心跳包信息
	CMD102("CMD=102", 102),
	//服务器应答充电桩状态信息包
	CMD103("CMD=103", 103),
	//充电桩状态信息包上报
	CMD104("CMD=104", 104),
	//服务器应答充电桩签到命令
	CMD105("CMD=105", 105),
	//充电桩签到信息上报
	CMD106("CMD=106", 106),
	//服务器应答充电桩开始充电命令
	CMD107("CMD=107", 107),
	//充电桩开始充电命令
	CMD108("CMD=108", 108),
	//服务器应答充电中状态信息包
	CMD109("CMD=109", 109),
	//充电桩正在充电中状态信息包
	CMD110("CMD=110", 110),
	
	/**充电信息数据**/
	//服务器应答充电桩充电上报最新一次充电信息报文
	CMD201("CMD=201", 201),
	//充电桩上报最新一次充电信息
	CMD202("CMD=202", 202),
	//服务器应答帐户查询信息
	CMD203("CMD=203", 203),
	//充电桩充电上传用户帐户查询报文
	CMD204("CMD=204", 204),
	
	/**BMS信息数据(直流充电桩)**/
	//服务器应答充电桩上报BMS信息
	CMD301("CMD=301", 301),
	//充电桩上报BMS信息
	CMD302("CMD=302", 302),
	
	/**历史记录**/
	//服务器应答充电桩未上传历史充电记录
	CMD401("CMD=401", 401),
	//充电桩上报未上传的充电记录
	CMD402("CMD=402", 402),
	//充电桩上报历史的充电记录
	CMD404("CMD=404", 404),
	
	
	/**下载命令**/
	//服务器下发下载命令
	CMD1001("CMD=1001", 1001),
	//充电桩应答服务器下载命令
	CMD1002("CMD=1002", 1002),
	//服务器应答充电桩状态
	CMD1003("CMD=1003", 1003),
	//充电桩上报下载进度
	CMD1004("CMD=1004", 1004),
	
	
	/**与计费策略相关的指令**/
	//后台下发固定电费计价策略信息
	CMD1301("CMD=1301", 1301),
	//充电桩回应后台下发的固定电费计价测率信息
	CMD1302("CMD=1302", 1302),
	//后台下发峰平谷电费计价策略信息
	CMD1303("CMD=1303", 1303),
	//充电桩响应后台下发峰平谷电费计价策略信息
	CMD1304("CMD=1304", 1304),
	
	/**充电桩在线控制广告灯开关指令（适用于广告桩）**/
	//后台服务器向充电桩下发广告灯控制指令
	CMD1201("CMD=1201", 1201),
	//充电桩对服务器下发广告灯控制指令的应答
	CMD1202("CMD=1202", 1202),
	
	
	/**充电桩对地锁控制的指令**/
	//后台服务器向充电桩下发地锁控制指令
	CMD1501("CMD=1501", 1501),
	//充电桩对服务器下发地锁控制指令的应答
	CMD1502("CMD=1502", 1502),
	//后台服务器应答充电桩地锁状态
	CMD1503("CMD=1503", 1503),
	//充电桩上报地锁状态
	CMD1504("CMD=1504", 1504);
	
	// 成员变量  
    private String name;  
    private int index;  
    // 构造方法  
    private CmdType(String name, int index) {  
        this.name = name;  
        this.index = index;  
    }  
    // 普通方法  
    public static String getName(int index) {  
        for (CmdType c : CmdType.values()) {  
            if (c.getIndex() == index) {  
                return c.name;  
            }  
        }  
        return null;  
    }  
    // get set 方法  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public int getIndex() {  
        return index;  
    }  
    public void setIndex(int index) {  
        this.index = index;  
    }
//	@Override
	public void print() {
		System.out.println(this.index+":"+this.name); 
		
	}
//	@Override
	public String getInfo() {
		 
		return this.name; 
	}  
    
    
    
     

}
