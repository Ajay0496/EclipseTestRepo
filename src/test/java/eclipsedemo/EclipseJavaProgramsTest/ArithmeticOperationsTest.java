package eclipsedemo.EclipseJavaProgramsTest;

import java.util.Scanner;

public class ArithmeticOperationsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();  

        double sum = add(num1, num2);

        System.out.println("Sum:  " + sum);
        System.out.println("Sum:  " + sum);

        double difference = subtract(num1, num2);
        System.out.println("Difference: " + difference);

        
        double product = multiply(num1, num2);
        System.out.println("Product: " + product);
        
        double quotient = divide(num1, num2);
        System.out.println("Quotient: " + quotient);

        scanner.close();
       
        
	}
	public static double subtract(double num1, double  
			 num2) {
			        return num1 - num2;
			    }
	public static double add(double num1, double num2) {
        return num1 + num2;
    }
	
	public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
	
	public static double divide(double num1, double num2)  
	 {
	        if (num2 == 0) {
	            System.out.println("Error:  Division by zero is not allowed.");
	            return 0.0; // Or throw an exception
	        } else {
	            return num1 / num2;
	        }
	    }

}
