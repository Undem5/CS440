package fr.esisar.calculatrice;

import java.util.List;

import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationInvalide;


public class Calculatrice {

	private List <Operation>liste;

	public Calculatrice( List <Operation>liste){
		this.liste = liste;
	}
	
	public Operation chercherOperation(String nom) {
		Operation nomOp = null;
		
		for( Operation a: liste){
			if(nom.equals(a.getNom())){
				nomOp = a;
			}
		}
		
		
	
		return nomOp;
	}
	
	public void ajouterOperation(Operation operation){
			if( !liste.contains(operation)){
				liste.add(operation);
			}
			else{
				System.out.println("Operation déjà existante");
			}
	}
	
	public void retirerOperation(Operation operation){
		if( liste.contains(operation)){
			liste.remove(operation);
			}
		else{
			System.out.println("Operation non existante");
		}
		
	}
	
	public double calculer(String nom, double...operandes ) throws OperationInvalide{
		double res = 0;
		Operation op = chercherOperation(nom);
		res = op.calculer(operandes);
		return res;
		
	}
}
