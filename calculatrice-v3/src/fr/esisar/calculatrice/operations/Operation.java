package fr.esisar.calculatrice.operations;

public interface Operation {


	public String getNom();
	
	public double calculer(double...operandes) throws OperationInvalide;
}
