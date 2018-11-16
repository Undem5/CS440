package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.OperationUnaire;

public class Sinus extends OperationUnaire {

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "sinus";
	}


	@Override
	protected double doCalculer(double operande1) {
		// TODO Auto-generated method stub
		return Math.sin(operande1);
	}


}
