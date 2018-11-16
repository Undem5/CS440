package fr.esisar.calculatrice.operations;

public abstract class OperationBinaire implements Operation {

	
	protected  abstract double doCalculer(double operande1, double operande2);
	
	public double calculer(double... operandes) throws OperationInvalide {
		return doCalculer(operandes[0], operandes[1]);
	}
}
