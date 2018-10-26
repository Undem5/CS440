package fr.esisar.calculatrice.operations;

public class Soustraire implements Operation {

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "-";
	}

	@Override
	public double calculer(double operande1, double operande2) throws OperationInvalide {
		// TODO Auto-generated method stub
		return operande1-operande2;
	}

}
