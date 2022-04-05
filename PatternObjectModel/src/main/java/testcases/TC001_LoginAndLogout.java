package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginAndLogout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout";
		testDescription="login and logout in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Kamalakannan";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName,String szCmpName,String szFName,String szLName,String szPhoneNo,String szEmailId) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCRMSFALink()
		.clickLeadLink()
		.clickCreteLeadLink()
		.enterCompanyName(szCmpName)
		.enterFirstName(szFName)
		.enterLastName(szLName)
		.enterPhoneNo(szPhoneNo)
		.enterEmailID(szEmailId)
		.clickLeadButton();

	}

}
