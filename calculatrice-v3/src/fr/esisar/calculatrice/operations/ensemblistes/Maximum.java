package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Maximum extends OperationEnsembliste {

	public Maximum(){}
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "max";
	}


	@Override
	protected double doCalculer(double... operandes) {
		// TODO Auto-generated method stub
		

			
		double max = operandes[0];
		for( double op : operandes){
			if (max < op){
				max = op;
			}
		}
		return max;

		
	}

}
