package pagecontrols;

import java.util.logging.Logger;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import com.provar.core.testapi.annotations.*;

@PageControl( title="Test"                                
     , summary=""
     , remarks=""
     )             
public class Test {

	private WebDriver driver;
	private WebElement element;
	
	@TestLogger
	private Logger logger;
	
	public Test(WebDriver driver, WebElement element) {
		this.driver = driver;
		this.element = element;
	}
	
	@PageOperation
	public String testMethodForControl(String param1) {
		
		return "";
	}
	
	public List<WebElement> choice(){
		List<WebElement> LeadSource = driver.findElements(By.xpath("//select[@id='con9']/option"));
		return LeadSource;
		
	}
}
