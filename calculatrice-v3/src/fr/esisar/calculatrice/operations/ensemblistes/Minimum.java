package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Minimum extends OperationEnsembliste {

	public Minimum(){}
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "min";
	}



	@Override
	protected double doCalculer(double... operandes) {
		// TODO Auto-generated method stub


			
		double min = operandes[0];
		for( double op : operandes){
			if (min > op){
				min = op;
			}
		}
		return min;
	}


}
