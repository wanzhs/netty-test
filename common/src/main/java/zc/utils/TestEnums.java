package zc.utils;

public class TestEnums {

	public static void main(String[] args) {
		StringBuffer buffear=new StringBuffer();
		for(int i=1;i<1505;i++)
		{
		  String cmd=CmdType.getName(i);
		  if(cmd!=null) 
		  {
			  buffear.append(cmd+",");
			  
			  System.out.println(cmd); 
		  }
	    }
		
		System.out.println(buffear); 
	}

}
