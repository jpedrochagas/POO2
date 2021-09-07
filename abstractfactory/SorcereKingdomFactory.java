package com.iluwatar.abstractfactory;

public class SorcereKingdomFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		// TODO Auto-generated method stub
		return new SorcereCastle();
	}

	@Override
	public King createKing() {
		// TODO Auto-generated method stub
		return new SorcereKing();
	}

	@Override
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new SorcereArmy();
	}

	@Override
	public Wizard createWizard() {
		// TODO Auto-generated method stub
		return new SorcereWizard();
	}

}
