package fr.esisar.calculatrice.operations;

public abstract class OperationUnaire implements Operation {

		protected double doCalculer(double operande1) {
			return operande1;
		}
		
		@Override
		public String getNom() {
			// TODO Auto-generated method stub
			return "unaire";
		}

		@Override
		public double calculer(double... operandes) throws OperationInvalide {
			// TODO Auto-generated method stub
			
			return 0;
		}
}
