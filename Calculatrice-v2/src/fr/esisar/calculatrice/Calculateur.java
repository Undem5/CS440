package fr.esisar.calculatrice;

import java.util.ArrayList;
import java.util.List;

import fr.esisar.calculatrice.operations.*;

public class Calculateur {

	public static void main(String[] args) throws OperationInvalide {
		// TODO Auto-generated method stub
	
		
		List<Operation> operations = new ArrayList<Operation>();
		operations.add(new Ajouter());
		operations.add(new Soustraire());
		operations.add(new Diviser());
		operations.add(new Multiplier());
		Calculatrice cal = new Calculatrice(operations);
		
		double op1 = 5;
		double op2 = 2;
		
		System.out.println(" Addition: " + cal.calculer(cal.chercherOperation("+").getNom(),op1,op2));
		System.out.println(" Soustraction: " + cal.calculer(cal.chercherOperation("-").getNom(),op1,op2));
		System.out.println(" Multiplication: " + cal.calculer(cal.chercherOperation("*").getNom(),op1,op2));
		System.out.println(" Division: " + cal.calculer(cal.chercherOperation("/").getNom(),op1,op2));
		//System.out.println("Exception: " + cal.calculer(excep.getNom(), op1, op2));
		
		
	}

}
