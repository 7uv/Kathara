package com.sayantan.actionConfig.actionSkel;

/**
 * @author zayantan
 * To be used for database credential information. 
 * Password in plain text.
 * Should be replaced by Hashing later.
 */
public interface DBCredImpl {
	/**
	 * To be used for connecting to a new database instance
	 * The uname and pass values should be taken from DBCreds
	 * @param dbUname
	 * @param dbPass
	 * @return SUCCESS FAIL
	 */
	public abstract String dbConnect(final String dbUname, final String dbPass);
	/**
	 * To be used for cleanup operation before logout 
	 * Both dbCleanUp() and dbDisconnect() should be synchronized
	 * @return SUCCESS FAIL
	 */
	public abstract String dbCleanUp();
	/**
	 * To be used for database logout 
	 * Both dbCleanUp() and dbDisconnect() should be synchronized
	 */
	public abstract void dbDisconnect();
}
