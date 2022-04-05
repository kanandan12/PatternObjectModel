package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
	public ViewLead() {
		PageFactory.initElements(driver,this);
	}
		
	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	private WebElement eleViewCompanyName;
	
	public ViewLead viewCompanyName(String data) {
		type(eleViewCompanyName, data);
		return this;		
	}
		
	@FindBy(how=How.ID, using="viewLead_firstName_sp")
	private WebElement eleViewFirstName;
	
	public ViewLead viewFirstName(String data) {
		type(eleViewFirstName, data);
		return this;		
	}
		
	@FindBy(how=How.ID, using="viewLead_lastName_sp")
	private WebElement eleViewLastName;
	
	public ViewLead viewLastName(String data) {
		type(eleViewLastName, data);
		return this;		
	}
	
	
	
	
	
	
	/*
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadButton;
	
	public ViewLead clickLeadButton() {
		click(eleCreateLeadButton);
		return new ViewLead();		
	}
	*/
	

}
