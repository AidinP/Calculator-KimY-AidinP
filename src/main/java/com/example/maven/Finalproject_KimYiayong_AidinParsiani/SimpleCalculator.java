package com.example.maven.Finalproject_KimYiayong_AidinParsiani;
import Interfaces.CalculatorBasicOperationInterface;

public class SimpleCalculator implements CalculatorBasicOperationInterface {

	/**
	 * A method that adds two numbers.
	 */
	
	public double addition(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber + secondNumber;
	}

	/**
	 * Method for subtracting.
	 */
	public double substraction(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber - secondNumber;
	}

	/**
	 * Method for multiplying two numbers.
	 */
	public double multiplication(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber * secondNumber;
	}

	/**
	 * Method for dividing the first number with the second number.
	 */
	public double division(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber / secondNumber;
	}

	}
