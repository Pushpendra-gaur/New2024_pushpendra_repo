package Page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page extends Base_liebrary {

	
	
	@FindBy(xpath = "//button[@aria-label='Dismiss sign-in info.']")
	private WebElement Cross_icon;
	
	@FindBy(xpath = "//span[text()='Flights']")
	private WebElement flights;
	
	public Home_page()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void booking_flith() throws InterruptedException
	{
		
		System.out.println("pushpendra gaur");
		//try {	
		
		Thread.sleep(2000);
		
		System.out.println("ruby");
		Cross_icon.click();
		
		System.out.println("ankit gaur");
		
		Thread.sleep(2000);
		flights.click();
		
		
		System.out.println("ankit gaur");
		}
		
		//catch (Exception e) {
			
			//e.printStackTrace();
			
			//System.out.println("pushpendra");
			
		//}
		
 
	}
	
	
	

