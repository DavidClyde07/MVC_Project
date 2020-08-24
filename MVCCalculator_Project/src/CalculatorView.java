/*
 * This is the view class. All that its concerned with is 
 * how the data is represented. This is useful because it 
 * can easily be changed without affecting the rest of the program.
 */

import java.awt.event.ActionListener;
import javax.swing.*;


public class CalculatorView extends JFrame{
	
	/*
	 * Declare all the variable to be used to 
	 * create the graphical user interface. Variables
	 * are set to private because this is the only 
	 * class that needs to use them. 
	 */
    private JTextField firstNumber  = new JTextField(10); //parameter is the length of the text field 
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);
  
    //Constructor to build the GUI 
    CalculatorView(){

        // Sets up the view and adds the components
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        this.add(calcPanel);
        
     
    }
    
    /*
     * Create the necessary getter and setter methods to
     * access the data inputed by the user.
     */
    
    
    public int getFirstNumber(){
        //parse to integer because getText() returns a string (user inputs a string into JTextField)
    	return Integer.parseInt(firstNumber.getText());
     
    }
     
    public int getSecondNumber(){
    	//parse to integer because getText() returns a string (user inputs a string into JTextField)
        return Integer.parseInt(secondNumber.getText());
    }
    
    public int getCalcSolution(){
    	//parse to integer because getText() returns a string
        return Integer.parseInt(calcSolution.getText());

    }
     
    /*
     * The model is the one actually doing the calculation but its doesn't
     * interact with the view. So these interactions are handled by the controller
     *
     */
    
    //method to set the value of calcSolution
    public void setCalcSolution(int solution){
    	//setText() requires a string but solution is an int so parse it to a string using toString()
        calcSolution.setText(Integer.toString(solution));
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    /*
     * Listens for when the calcButton is clicked. Then execute a the appropriate
     * method in the Controller ie. actionPerformed
     */

    void addCalculateListener(ActionListener listenForCalcButton){
        calculateButton.addActionListener(listenForCalcButton);
    }

    /*
     * Method to detect error. Then informs the controller to handle the error
     * by displaying error message that was passed.
     */

    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);

    }

}
