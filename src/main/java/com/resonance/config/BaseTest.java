package com.resonance.config;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.resonance.keywords.UIkeywords;
import com.resonance.util.PropertyFile;

public class BaseTest {
	PropertyFile pfile=new PropertyFile();
 @BeforeMethod
public void setUp() throws Exception {
	UIkeywords.openBrowser("chrome");
	UIkeywords.launchURL(pfile.getAppUrl("Testing_Shastra_Url"));
}
 @AfterMethod
public void tearDown() throws Exception {
	
}
}
