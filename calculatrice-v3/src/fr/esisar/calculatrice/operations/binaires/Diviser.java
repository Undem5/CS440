package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.operations.OperationBinaire;

public class Diviser extends OperationBinaire {

	
	public Diviser(){}
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "/";
	}

	@Override
	public double doCalculer(double operande1, double operande2) {
		// TODO Auto-generated method stub
		return operande1/operande2;
	}

	

}
