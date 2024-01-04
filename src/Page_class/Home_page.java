package Page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page extends Base_liebrary {

	
	
	
	
	public Home_page()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement cross_icon;
	
	
	public void testing_baba() throws InterruptedException
	{
	
		
		cross_icon.click();
		
		
	}
	}
	
	
	

