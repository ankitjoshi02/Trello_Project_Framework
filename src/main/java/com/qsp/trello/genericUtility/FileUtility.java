package com.qsp.trello.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	/**
	 * this method is used to fetch the data from property file
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	public String readTheDataFromPropertyFIle(String key) throws IOException {
	FileInputStream file=new FileInputStream("./src/test/resource/TrelloCommondata.properties");
	Properties pobj=new Properties();
	pobj.load(file);
	String value=pobj.getProperty(key);
	return value;
	}
}
