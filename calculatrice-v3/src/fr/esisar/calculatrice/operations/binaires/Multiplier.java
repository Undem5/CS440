package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.operations.OperationBinaire;

public class Multiplier extends OperationBinaire {


	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "*";
	}


	@Override
	protected double doCalculer(double operande1, double operande2) {
		// TODO Auto-generated method stub
		return operande1*operande2;
	}
	

}
