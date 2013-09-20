package com.sayantan.actionConfig.actionSkel;

/**
 * @author zayantan
 * To be used for About Us page.
 * To enforce all the legal requirements and disclaimers
 * To be displayed during registration and at every login as pop-up or landing page or something else
 */
public interface AboutUsImpl {
	/**
	 * Our names and other primary contributors.
	 */
	void whoWeAre();
	/**
	 * The license that we enforce on users
	 */
	void license();
	/**
	 * The third party licensing agreements
	 */
	void thirdPartyLicense();
	/**
	 * The encapsulating method for license() thirdPartyLicense() discalimer() legalAction()
	 */
	void agreement();
	/**
	 * We are not reponsible for any loss physical/meta-physical/imaginary direct/implied to anybody/anything whatsoever.
	 */
	void disclaimer();
	/**
	 * We are to be governed by Laws of Indian Courts only.
	 */
	void legalAction();
	/**
	 * The aim of the project
	 */
	void aim();
	/**
	 * Work recognition
	 */
	void honours();
	/**
	 * The teers that we have maarofied.
	 */
	void achievements();
}
