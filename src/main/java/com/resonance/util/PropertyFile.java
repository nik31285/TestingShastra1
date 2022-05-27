package com.resonance.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	public String getAppUrl() throws IOException {
		String baseDir= System.getProperty("user.dir");
		FileInputStream fis= new FileInputStream(baseDir+"/src/main/resources/Envoirnment.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty("app_url");
		return value;
	}
	public String getAppUrl(String key) throws IOException {
		String baseDir= System.getProperty("user.dir");
		FileInputStream fis= new FileInputStream(baseDir+"/src/main/resources/Envoirnment.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
	public String getValue(String filePath,String Key) throws IOException {
		String baseDir=System.getProperty("user.dir");
		FileInputStream fis=new FileInputStream(baseDir+filePath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(Key);
		return value;
	}
	public static void main(String[] args) throws IOException {
	//	new PropertyFile().getValue("sdf","dff");
	}

}
