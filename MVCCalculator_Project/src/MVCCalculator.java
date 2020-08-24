/*
 * Class containing the main method.
 * Creates the necessary Model View and Controller 
 * objects
 */
public class MVCCalculator {
	
	public static void main(String[]args) {
		
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorController theController = new CalculatorController(theView,theModel);
		theView.setVisible(true);

	}
	
}
