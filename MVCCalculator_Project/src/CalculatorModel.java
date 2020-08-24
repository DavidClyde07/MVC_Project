/*
 * This is the model. It contain the data for the program
 * in this case the calculationValue. It contains and performs
 * the methods needed to be implemented on the data ie the  
 * method addTwoNumbers. Lastly it provides access to the data via
 * getter method.
 * ******** Note****** The model knows nothing about the view!
 */



public class CalculatorModel {
	
	// Holds the value of the sum of the numbers
    // entered in the view
    private int calculationValue;

    //Method to add to numbers
    public void addTwoNumbers(int firstNumber, int secondNumber){     
        calculationValue = firstNumber + secondNumber;
    }
    
    //Access method to get the calculation value
    public int getCalculationValue(){
        return calculationValue;
    }
	
}
