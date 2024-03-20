// jp = Java Practice

package javaGithub;

import java.util.Scanner;

public class jp_OneFunctionCalculator {
	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			float num1, num2, result;
			
			System.out.println("============================");
			System.out.println("||      Java Practice     ||");
			System.out.println("|| One-Function Calculator||");
			System.out.println("============================");
			
			System.out.println("\nWelcome to One-Function Calculator!");
			
			System.out.println("Please, enter 1st number: ");
			num1 = s.nextFloat();	
			
			System.out.println("Please, enter 2nd number: ");
			num2 = s.nextFloat();
			
			result = num1 + num2;
			System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);
		
			result = num1 - num2;
			System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);
			
			result = num1 * num2;
			System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);
			
			result = num1 / num2;
			System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
			
			result = num1 % num2;
			System.out.println("Modulus (Remainder): " + num1 + " % " + num2 + " = " + result);
			
	}

}
