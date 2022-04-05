package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {
		PageFactory.initElements(driver,this);
	}
			
	@FindBy(how=How.ID, using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public CreateLead enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;		
	}
	
	@FindBy(how=How.ID, using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLead enterFirstName(String data) {
		type(eleFirstName, data);
		return this;		
	}
	
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	public CreateLead enterLastName(String data) {
		type(eleLastName, data);
		return this;		
	}
	
	@FindBy(how=How.ID, using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhoneNo;
	
	public CreateLead enterPhoneNo(String data) {
		type(elePhoneNo, data);
		return this;		
	}
	
	@FindBy(how=How.ID, using="createLeadForm_primaryEmail")
	private WebElement eleEmailID;
	
	public CreateLead enterEmailID(String data) {
		type(eleEmailID, data);
		return this;		
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadButton;
	
	public ViewLead clickLeadButton() {
		click(eleCreateLeadButton);
		return new ViewLead();		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
