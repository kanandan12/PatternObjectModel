package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_LoginForFailure extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC002_LoginforNegative";
		testDescription="Login for failure(Negative)";
		testNodes="Leads";
		category="Smoke";
		authors="Kamalakannan";
		browserName="chrome";
		dataSheetName="TC002";
	}	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String errMsg) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogInForFailer()
		.verifyErrorMsg(errMsg);				
	}
}
