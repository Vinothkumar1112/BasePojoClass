import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.PojoClass;

public class BrowserLaunch extends BaseClass{
	public static void main(String[] args) {
		launchChrome();
		loadUrl("https://www.facebook.com/");
		maximize();
		printTitle();
		currentUrl();
		PojoClass p= new PojoClass();
		p.getUsername().sendKeys("9841314562");
		p.getPassword().sendKeys("9841314562");
		p.getLogin().click();
		
	}

}
