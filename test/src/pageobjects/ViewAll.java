package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title=""                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class ViewAll {

	@TextType()
	@FindBy(xpath = "//*[@id=\"bodyCell\"]/div[1]/div[1]/div[1]/h1")
	public WebElement ViewAll;
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement cancel;
			
}
