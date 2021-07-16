package example;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Pinky\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		String url1 = "https://www.myntra.com/dresses/sangria/sangria-mustard-yellow--maroon-striped-shirt-midi-dress/13290518/buy";
		String url2 = "https://www.flipkart.com/camera-clp-store?otracker=nmenu_sub_Electronics_0_Camera&fm=neo%2Fmerchandising&iid=M_321aec60-ff19-4855-8248-0cd197a296e1_1_372UD5BXDFYS_MC.JR4C1KAN1IAQ&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Electronics~Cameras%2B%2526%2BAccessories_JR4C1KAN1IAQ&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L1_view-all&cid=JR4C1KAN1IAQ";
		String url3 = "https://www.amazon.in/dp/B081NZXYXW/ref=s9_acsd_hps_bw_c2_x_0_i?pf_rd_m=A1K21FY43GMZF8&pf_rd_s=merchandised-search-3&pf_rd_r=J66CQ9DZY99HCM99H3H2&pf_rd_t=101&pf_rd_p=945d1576-d29c-4a80-8a61-2d95793f25c0&pf_rd_i=16368877031";
		String url4 = "https://www.ajio.com/anna-claire-handbag-with-detachable-sling-strap/p/460600862_black";
		
		WebDriver driver= new ChromeDriver();
	
		driver.get(url1);  
	    ((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String> tab1 = new ArrayList<String>(driver.getWindowHandles());
	    Thread.sleep(2);
	    
	    driver.switchTo().window(tab1.get(1));
	    driver.get(url2);
	    Thread.sleep(2);
	    driver.manage().window().maximize();
	    
	    
	    WebDriver driver2= new ChromeDriver();
		
	    driver2.get(url3);  
	    ((JavascriptExecutor)driver2).executeScript("window.open()");
	    ArrayList<String> tab2 = new ArrayList<String>(driver2.getWindowHandles());
	    Thread.sleep(2);
	    
	    driver2.switchTo().window(tab2.get(1));
	    driver2.get(url4);
	    Thread.sleep(2);
	    driver2.manage().window().maximize();
	    
	  
	}

}
