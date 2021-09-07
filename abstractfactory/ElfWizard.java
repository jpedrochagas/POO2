package com.iluwatar.abstractfactory;

public class ElfWizard implements Wizard {

	static final String DESCRIPTION = "This is the Elf Wizard!";

	  @Override
	  public String getDescription() {
	    return DESCRIPTION;
	  }

}
