package fr.esisar.calculatrice.operations;

public interface Operation {

	public String getNom();
	
	public double calculer(double operande1, double operande2) throws OperationInvalide;
}
