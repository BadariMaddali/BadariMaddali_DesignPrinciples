package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("---- Calculator ----");
		Scanner scan = new Scanner(System.in);
		ExceptionHandler eHandler = new ExceptionHandler();
		
		char choice = 'n';
		while(choice == 'n') {
			float number1 = 0,number2 = 0,result = 0;
			try {
				System.out.print("\nEnter Number 1 : ");
				number1 = scan.nextFloat();
				System.out.print("\nEnter Number 2 : ");
				number2 = scan.nextFloat();
			}
			catch(InputMismatchException e) {
				eHandler.writeLog( "Mismatch in input, Float is expected but string is given");
				return;
			}

			System.out.print("\nChoose operation to be performed : \n'+' for Addition\n'-' for Subraction\n'*' for Multiplication\n'/' for Division\n");
			char operator = scan.next().charAt(0);
			
			Operations obj = new Operations(number1,number2);

			
			switch(operator) {
			case '+' : result = obj.add();
						break;
			case '-' : result = obj.subtract();
						break;
			case '*' : result = obj.multiply();
						break;
			case '/' : result = obj.divide();
						break;
			default : System.out.println("Invalid operator!");
						continue;
						
			}
			
			
			System.out.println("\nResult (" + number1 + operator + number2 +") is : " + result);

			System.out.println("\n\nExit the application ( y/n ) : ");
			choice = scan.next().charAt(0);
		}
				
	}
}

