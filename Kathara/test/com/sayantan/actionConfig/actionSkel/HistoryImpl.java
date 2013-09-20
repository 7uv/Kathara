package com.sayantan.actionConfig.actionSkel;

/**
 * @author zayantan
 * To be used by patient's medical History page
 */
public interface HistoryImpl {
	/**
	 * The complete paginated visit history list
	 */
	void visitHistory();
	/**
	 * The complete history of relatives group by relatives
	 */
	void relativeHistory();
	/**
	 * The first 5 history items
	 */
	void recentHistory();
	/**
	 * Important history events as marked by Dr/Self/Helper
	 */
	void impEvents();
	/**
	 * Single history item
	 */
	void historyItem();
}
