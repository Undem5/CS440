package fr.esisar.calculatrice.operations;

public abstract class OperationEnsembliste implements Operation {

	
	protected abstract double doCalculer(double...operandes);

	public double calculer(double... operandes) throws OperationInvalide {
		return doCalculer(operandes);
	}

	

}
