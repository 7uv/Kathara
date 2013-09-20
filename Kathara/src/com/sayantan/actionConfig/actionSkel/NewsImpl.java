package com.sayantan.actionConfig.actionSkel;

/**
 * @author zayantan
 * To contain recent news items.
 * To be Enhanced to use JMX and Broadcast as Feed
 * Part of Home Page
 * Can be spammed/hoaxed/flamed/trolled. Something needs to be done to avoid manual moderation.
 */
public interface NewsImpl {
	/**
	 * Important news items not part of other items
	 */
	void impNews();
	/**
	 * Camps set up for current/incumbent doctor visits
	 */
	void drCamps();
	/**
	 * Camps set up for current/incumbent health/vaccination/blood donation camps or related
	 */
	void healthCamps();
	/**
	 * Camps set up for knowledge drive or mass drug or ancilleries distribution
	 */
	void helpCamps();
	/**
	 * Any alerts for the area.
	 * Sensitive. Moderation needed.
	 * One way is to require 5 (random) Doctors to vote for a news item. and only then should be visible to general public.
	 * Can be made visible to everybody OR Area Specific.
	 */
	void outbreakAlerts();
}
