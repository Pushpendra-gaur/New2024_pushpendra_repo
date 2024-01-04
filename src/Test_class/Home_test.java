package Test_class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_class.Base_liebrary;
import Page_class.Home_page;

public class Home_test extends Base_liebrary {

	Home_page ob;

	@BeforeTest
	public void Home_broswer() {

		Baba();
		ob = new Home_page();

	}

	@Test(priority = 1)

	public void Home_new() throws InterruptedException {

		ob.testing_baba();

	}
}