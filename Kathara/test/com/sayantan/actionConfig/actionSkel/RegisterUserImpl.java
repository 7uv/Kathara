package com.sayantan.actionConfig.actionSkel;

/**
 * @author zayantan
 * To be used by Register New User Module
 * Dependent on email authentication mechanism for now
 * To be Enhanced to use Aadhar Uid and directly fetch all the info
 */
public interface RegisterUserImpl extends AboutUsImpl{
	/**
	 * authentication sent to a Valid email id.
	 * @param uid
	 * @param randVar
	 * @param pwd
	 * @return SUCCESS FAIL
	 */
	String emailAuth(String uid, String randVar, String pwd);
	/**
	 * email click information
	 * should not invade privacy
	 * disclaimer license etc. should be provided
	 * @param sessionId
	 * @return
	 */
	String emailClick(String sessionId);
	/**
	 * register teh user and make the secure db changes
	 */
	void registerUser();
	/**
	 * purge temporary data
	 */
	void cleanUpRegistration();
}
