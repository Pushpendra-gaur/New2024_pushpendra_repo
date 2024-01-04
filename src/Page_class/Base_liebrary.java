package Page_class;

import org.openqa.selenium.chrome.ChromeDriver;

public class Base_liebrary {

	public ChromeDriver driver;

	public void Baba() {

		String path = "C:\\Users\\DELL\\eclipse-workspace\\Ankit_program\\Webdriver\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		driver = new ChromeDriver();
		driver.get("https://www.testingbaba.com/old/");
		driver.manage().window().maximize();

	}

}
