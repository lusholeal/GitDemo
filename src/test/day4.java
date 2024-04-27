package test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class day4 {

	@Parameters({ "URL" })
	@Test
	public void WebloginHomeLoan(String uname)
	{
		//selenium
		System.out.println("webloginhomePersonalLoan");
		System.out.println(uname);
		
	}
	
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileloginHome");
		System.out.println("New changes arriving");
		System.out.println("Downloading");
		//To continue with the new uptade
		System.out.println("New change here");
		System.out.println("creating this code");
		System.out.println("New changes freezed");
		System.out.println("Downloading");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("APIloginHome");
	}
}
