package fr.esisar.calculatrice;

import java.util.ArrayList;
import java.util.List;

import fr.esisar.calculatrice.operations.*;

public class Calculatrice {
	
	private List <Operation>liste;
	
	
	public Calculatrice( List <Operation>liste){
		this.liste = liste;
	}
	
	
	public Operation chercherOperation(String nom){
		Operation nomOp = null;
		
		for( Operation a: liste){
			if(nom.equals(a.getNom())){
				nomOp = a;
			}
		}
		
		if( nomOp.equals(null)){
			System.out.println("Operation inconnu");
			System.exit(-1);
		}
		
		return nomOp;
	}
	
	public double calculer(String nom, double operande1, double operande2) throws OperationInvalide{
		
		double res = 0;
		Operation op = chercherOperation(nom);
		res = op.calculer(operande1, operande2);
		
		
		return res;
	}

}
