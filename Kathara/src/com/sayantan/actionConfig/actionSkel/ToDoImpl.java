package com.sayantan.actionConfig.actionSkel;

/**
 * @author zayantan
 * To be implemented by the ToDo Page. 
 * To be displayed in Bring the milk fashion
 */
public interface ToDoImpl {
	/**
	 * To set/rest/view reminders set by doctor
	 */
	void drReminder();
	/**
	 * To set/rest/view reminders set by helper
	 */
	void helpReminder();
	/**
	 * To set/rest/view reminders set by self
	 */
	void selfReminder();
	/**
	 * To be used to reiterate recents visits to the Doctor for any reminders
	 * To be overloaded from com.sayantan.actionConfig.HistoryImpl
	 */
	void recentVisits();
}
