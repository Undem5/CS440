package fr.esisar.calculatrice.operations;

public abstract class OperationUnaire implements Operation {


	protected abstract double doCalculer(double operande1);

	public double calculer(double... operandes) throws OperationInvalide {
		return doCalculer(operandes[0]);
	}
}
