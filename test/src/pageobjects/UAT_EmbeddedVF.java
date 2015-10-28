package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="UAT_EmbeddedVF"
               , namespacePrefix=""
               , object="Account"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_EmbeddedVF {

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search;
	@PageTable(firstRowContainsHeaders = false, row = Acc.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!acc}\"]")
	public List<Acc> Acc;

	@PageRow(byColumn = true)
	public static class Acc {

		@TextType()
		@VisualforceBy(componentXPath = "apex:column")
		public WebElement name;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.name}\"]")
		public WebElement Name1;
	}

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search1;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search2;
	
}
