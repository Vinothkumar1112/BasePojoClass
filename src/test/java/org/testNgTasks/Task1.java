package org.testNgTasks;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.PojoClass;

public class Task1 extends BaseClass {
	@BeforeClass
	private void browserLaunch() {
		launchChrome();
		maximize();
	loadUrl("https:facebook.com");
}
	@Test
	private void getData() {
PojoClass p= new PojoClass();
fill(p.getUsername(), "vino241");
fill(p.getPassword(),"1234567");
buttonClick(p.getLogin());
}

}
