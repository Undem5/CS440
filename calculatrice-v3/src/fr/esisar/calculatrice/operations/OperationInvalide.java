package fr.esisar.calculatrice.operations;

public class OperationInvalide extends Exception {
	private String message ="Operation Invalide";
	
	public String toString(){
		return message.toString();
	}
}
