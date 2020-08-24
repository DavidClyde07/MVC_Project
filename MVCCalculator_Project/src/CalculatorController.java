
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * //The Controller coordinates interactions between the
 *  View and Model.
 */


public class CalculatorController {
	
	
	/*
	 * Create necessary view and model object so that the controller can have access
	 */
	private CalculatorView theView;
    private CalculatorModel theModel;
  
    
    /*
     * Controller constructor that takes in a view object and a
     * model object as parameters 
     */
    
    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {

        this.theView = theView;
        this.theModel = theModel;
      
        /* Tell the View that when ever the calculate button
         *  is clicked to execute the actionPerformed method
         *  in the CalculateListener inner class
         */

        this.theView.addCalculateListener(new CalculateListener());
    }

    /*
     * Create inner class to implement action listeners
     */
    
    class CalculateListener implements ActionListener{

    	/*
    	 * Method to define the actions to be performed 
    	 * when the listener is triggered. In this case
    	 * it specifies what to do when the calculate button
    	 * is pressed.
    	 */
    	
        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;
          
            /*
             * Use a try catch block to catch input errors ie. if
             * the numbers weren't entered correctly, nothing entered
             *  or incompatible data types entered.
             */
            try{

                firstNumber = theView.getFirstNumber();//get first number from the view
                secondNumber = theView.getSecondNumber();//get the second number form the view
                
                //The the model to execute the appropriate method. 
                theModel.addTwoNumbers(firstNumber, secondNumber);
                /*
                 * Set the calcSolution in the view but first get it from the model
                 */
                theView.setCalcSolution(theModel.getCalculationValue());

            }
            
            //Define the error to be caught and appropriate error message
            catch(NumberFormatException ex){

                System.out.println(ex);
                theView.displayErrorMessage("Please Enter 2 Integers");

            }
        }
    }

}
