package com.example.maven.Finalproject_KimYiayong_AidinParsiani;
import Interfaces.CalculatorAdvancedOperationsInterface;

/**
* Class for ScientificClaculator, the methods for advanced arithmetic operations/claculations.
*
**/

public class ScientificCalculator implements CalculatorAdvancedOperationsInterface   {

	/**
	 * Method for calculating the square of a number.
	 */
	
	public double sqrt(double firstNumber) {
		return Math.sqrt(firstNumber);
	}

	/**
	 * A method for calculating ....
	 */
	public double pow2(double firstNumber) {
		return Math.pow(firstNumber, 2);
	}

	/**
	 * A method for calculating ....
	 */
	public double pow3(double firstNumber) {
		// TODO Auto-generated method stub
		return Math.pow(firstNumber, 3);
	}

	/**
	 * A method for calculating TAN.
	 */
	public double TAN(double firstNumber) {
		// TODO Auto-generated method stub
		return Math.tan(firstNumber);
	}

	/**
	 * A method for calculating COS.
	 */
	
	public double COS(double firstNumber) {
		// TODO Auto-generated method stub
		return Math.cos(firstNumber);
	}

	/**
	 * A method for calculating SIN.
	 */
	public double SIN(double firstNumber) {
		// TODO Auto-generated method stub
		return Math.sin(firstNumber);
	}
	
}
