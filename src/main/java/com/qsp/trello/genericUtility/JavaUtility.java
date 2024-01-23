package com.qsp.trello.genericUtility;

import java.time.LocalDateTime;

public class JavaUtility {
	/**
	 * To take the screenshot of the defect 
	 * return - String 
	 * 
	 * @return
	 */
	public String timeStamp() {
		String timeStamp=LocalDateTime.now().toString().replace(':', '-');
		return timeStamp;
	}
}
