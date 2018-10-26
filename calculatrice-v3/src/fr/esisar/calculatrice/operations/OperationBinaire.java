package fr.esisar.calculatrice.operations;

public abstract class OperationBinaire implements Operation {

	protected double doCalculer(double operande1, double operande2){
		return 0;
		
	}
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculer(double... operandes) throws OperationInvalide {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
