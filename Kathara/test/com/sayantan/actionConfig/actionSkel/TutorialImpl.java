package com.sayantan.actionConfig.actionSkel;

/**
 * @author zayantan
 * To be used by Tutorial Pages Controller
 * Should be divided into three sub modules
 * to be Enhanced for I18N and L10N
 */
public interface TutorialImpl extends ChatTutorial, MedFormTutorial {
	/**
	 * basics usage of different parts of the app
	 */
	void basicTutorial();
	/**
	 * usage of the app for an experienced user.
	 */
	void intermediateTutorial();
	/**
	 * opened backports for technical interaction with the app
	 * May be to be used for chat debugging or specialized usage.
	 */
	void advancedTutorial();
}
