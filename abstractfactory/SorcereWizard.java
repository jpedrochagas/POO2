package com.iluwatar.abstractfactory;

public class SorcereWizard implements Wizard {

	static final String DESCRIPTION = "This is the Sorcere Wizard!";

	  @Override
	  public String getDescription() {
	    return DESCRIPTION;
	  }

}
