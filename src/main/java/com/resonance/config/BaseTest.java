package com.resonance.config;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.resonance.keywords.UIkeywords;
import com.resonance.util.PropertyFile;

public class BaseTest {
	PropertyFile pfile=new PropertyFile();
	String basePath="/src/main/resources/Envoirnment.properties";
 @BeforeMethod
public void setUp() throws Exception {
	UIkeywords.openBrowser("chrome");
	UIkeywords.launchURL(pfile.getAppUrl("Testing_Shastra_Url"));
	
	String title=UIkeywords.getTitle();
	System.out.println(title);
	if(title.contains("Privacy error")) {
		UIkeywords.click(pfile.getValue(basePath, "Advance_button"));
		UIkeywords.click(pfile.getValue(basePath, "Proceed_Link"));
	}
}
 @AfterMethod
public void tearDown() throws Exception {
	
}
}
