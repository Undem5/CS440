package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.OperationUnaire;

public class Tangente extends OperationUnaire {

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "tangente";
	}

	@Override
	protected double doCalculer(double operande1) {
		// TODO Auto-generated method stub
		return Math.tan(operande1);
	}
 

}
