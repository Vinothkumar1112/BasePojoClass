package org.junitTasks;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.PojoClass;

public class Task1 extends BaseClass{
	@BeforeClass
	
	public static void facebook() {
launchChrome();
loadUrl( "https://www.facebook.com/");
maximize();
	}
	@Test
	public void gettingData() {
		PojoClass p= new PojoClass();
fill(p.getUsername(), "vino241@gmail.com");
fill(p.getPassword(), "9841314562");
buttonClick(p.getLogin());

	}
	
	
	

}
