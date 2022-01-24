package driverEngine;

public class LoginFB extends CompositeConfiguartion{
	
	private static String propFilepath ="C:\\Users\\vkarthikeyan\\workspace\\keyword-driven\\src\\main\\resources\\TestInputFiles\\PropFiles\\facebooklogin.properties";
	
	public static void propFile() throws Exception{
		
		loadProperty(propFilepath);
		
		LoginFB.get("b.email_id");
	}
	
	
	
	

}
