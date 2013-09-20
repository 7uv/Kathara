package com.sayantan.actionConfig.actionSkel;

/**
 * @author zayantan
 * To be used for Logout Implementation 
 */
public interface LogoutImpl {
	/**
	 * To be used for cleaning up resources before logout. May/may not call gc.
	 * Both cleanup() and logout() should be synchronized
	 * @return SUCCESS FAIL
	 */
	String cleanup();
	/**
	 * To be used for logging out of the application after cleanup()
	 * Both cleanup() and logout() should be synchronized
	 * @param uname
	 * @param pwd
	 */
	void logout(String uname, String pwd);
}
