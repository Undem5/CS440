package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.OperationUnaire;

public class Cosinus extends OperationUnaire {

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "cosinus";
	}

	@Override
	protected double doCalculer(double operande1) {
		// TODO Auto-generated method stub
		return Math.cos(operande1);
	}



}
