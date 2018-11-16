package fr.esisar.calculatrice.operations;

public class OperationInvalide extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message ="Operation Invalide";
	
	public String toString(){
		return message.toString();
	}
}
