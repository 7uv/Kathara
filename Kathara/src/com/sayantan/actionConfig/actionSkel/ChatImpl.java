package com.sayantan.actionConfig.actionSkel;

/**
 * @author zayantan
 * To be used by Chat Applications 
 * To be Enhaced for group chats
 */
public interface ChatImpl extends ChatTutorial {
	/**
	 * start a new session and request for a new Connection
	 */
	void requestSession();
	/**
	 * accept a new session
	 * @param uid1
	 * @param uid2
	 */
	void acceptSession(String uid1, String uid2);
	/**
	 * initialize the session and connection and open the pipes.
	 * @param uid1
	 * @param uid2
	 */
	void openSession(String uid1, String uid2);
	/**
	 * close the session and logout users if applicable
	 * closeSession() and cleanChatSession() to be synchronized
	 */
	void closeSession();
	/**
	 * clean up the opened ports
	 * closeSession() and cleanChatSession() to be synchronized
	 */
	void cleanChatSession();
}
