// Name: Akshaya Sivakumar
// Class ID: 550
// Assignment #: 2
// Description: This file will be used to calculate the total of a series of inputs given
//				by the user. This file will also print the history of operations and
//				values that the user inputs. 

package cse360assign2;

/**
 *  This is the class that will be used to do the operations and print the message. It
 *  has a private variable total and methods that include a constructor, an add method, 
 *  a subtract method, a multiplication method, a division method, and a getHistory 
 *  method.
 */
public class Calculator {

	private int total;
	
	/**
	 * Sole constructor.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This method should return the current total value.
	 * 
	 * @return			returns current total value that is stored in variable, total.
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * This method adds the value to the total variable.
	 * 
	 * @param value		the value to be added to the total variable.
	 */
	public void add (int value) {
		
	}
	
	/**
	 * This method subtracts the value from the total variable.
	 * 
	 * @param value		the value to be subtracted from the total variable.
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * This method multiplies the value and the total variable together.
	 * 
	 * @param value		the value to be multiplied with the total variable.
	 */
	public void multiply (int value) {
		
	}
	
	/**
	 * This method divides the total variable by the value. It uses integer division. If
	 * the parameter is 0 then the total will be equal to 0. It will not print a message
	 * in this case and will neither raise an exception.
	 * 
	 * @param value		the value to be used as a divisor.
	 */
	public void divide (int value) {
		
	}
	
	/**
	 * This method will return a history of all actions as a String. The history will 
	 * start from 0 and normal operators for the operations will be used, like +,-,*, and
	 * /. There is no limit on the String and the returned string should separate all 
	 * operations and values with a space.
	 * 
	 * @return			returns a String of the history of operations and values	
	 */
	public String getHistory () {
		return "";
	}
}
