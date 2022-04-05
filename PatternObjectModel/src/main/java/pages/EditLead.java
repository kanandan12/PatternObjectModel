package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	public EditLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.CLASS_NAME, using="x-form-text x-form-field")
	private WebElement eleFindFirstName;
	
	public EditLead findFirstName(String data) {
		type(eleFindFirstName, data);
		return this;		
	}
	
	

}
