package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.operations.OperationBinaire;

public class Ajouter extends OperationBinaire {
	
	public Ajouter(){}
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "+";
	}

	@Override
	public double doCalculer(double operande1, double operande2) {
		// TODO Auto-generated method stub
		return operande1 + operande2;
	}


	

}
