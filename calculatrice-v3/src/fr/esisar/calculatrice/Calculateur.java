package fr.esisar.calculatrice;

import java.util.ArrayList;
import java.util.List;

import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationInvalide;
import fr.esisar.calculatrice.operations.binaires.*;
import fr.esisar.calculatrice.operations.ensemblistes.*;
import fr.esisar.calculatrice.operations.unaires.*;

public class Calculateur {

	public static void main(String[] args) throws OperationInvalide {
		// TODO Auto-generated method stub
	
		

	 
		//On ne peut pas instantier classe abstraite
		List<Operation> operations = new ArrayList<Operation>();

		Calculatrice cal = new Calculatrice(operations);
		cal.ajouterOperation(new Ajouter());
		cal.ajouterOperation(new Multiplier());
		cal.ajouterOperation(new Soustraire());
		cal.ajouterOperation(new Diviser());
		
		cal.ajouterOperation(new Maximum());
		cal.ajouterOperation(new Minimum());
		
		cal.ajouterOperation(new Cosinus());
		cal.ajouterOperation(new Sinus());
		cal.ajouterOperation(new Tangente());
		cal.ajouterOperation(new ValeurAbsolue());

		
		double op1 = 5;
		double op2 = 2;
		double op3 = 55;
		double op4 = -1;
		double op5 = 4;
				
		System.out.println(" Addition: " + cal.calculer(cal.chercherOperation("+").getNom(),op1,op2));
		System.out.println(" Soustraire: " + cal.calculer(cal.chercherOperation("-").getNom(),op1,op2));
		System.out.println(" Diviser: " + cal.calculer(cal.chercherOperation("/").getNom(),op1,op2));
		System.out.println(" Multiplier: " + cal.calculer(cal.chercherOperation("*").getNom(),op1,op2));

		System.out.println(" Maximum: " + cal.calculer(cal.chercherOperation("max").getNom(),op1,op2,op3,op4,op5));
		System.out.println(" Minimum: " + cal.calculer(cal.chercherOperation("min").getNom(),op1,op2,op3,op4,op5));
		System.out.println(" Cosinus: " + cal.calculer(cal.chercherOperation("cosinus").getNom(),op1));
		System.out.println(" Sinus: " + cal.calculer(cal.chercherOperation("sinus").getNom(),op1));
		System.out.println(" Tangente: " + cal.calculer(cal.chercherOperation("tangente").getNom(),op1));
		System.out.println(" Valeur Absolue: " + cal.calculer(cal.chercherOperation("abs").getNom(),op1));

	
		
		
	}

}
