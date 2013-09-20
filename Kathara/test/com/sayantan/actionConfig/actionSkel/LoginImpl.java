package com.sayantan.actionConfig.actionSkel;

/**
 * @author zayantan
 * To be used for Login Implementation 
 */
public interface LoginImpl {
	/**
	 * This method is to be used for login implmentation
	 * The overriding method should generate a timestamp and store in db to record each login time.
	 * Very important in event of litigation
	 * @param uname
	 * @param pwd
	 * @return SUCCESS FAIL
	 */
	String login(String uname,String pwd);
}
