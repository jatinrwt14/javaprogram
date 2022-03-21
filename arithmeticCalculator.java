package javaProgram;

import java.util.Scanner;

public class arithmeticCalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num1, num2, choice, result;
		System.out.println("Enter The First Number: ");
		num1=sc.nextInt();
		System.out.println("Enter The Second Number: ");
		num2=sc.nextInt();
		System.out.println("MAIN MENU");
		System.out.println("1. Addition(+)");
		System.out.println("2. Subtraction(-)");
		System.out.println("3. Multiplication(*)");
		System.out.println("4. Division(/)");
		System.out.println("Enter Your Option(1-4): ");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:	result=num1+num2;
					System.out.println("Result is: "+result);
					break;
					
			case 2: result=num1-num2;
					System.out.println("Result is: "+result);
					break;
			
			case 3: result=num1*num2;
					System.out.println("Result is: "+result);
					break;
			
			case 4: result=num1/num2;
					System.out.println("Result is: "+result);
					break;
			
			default: System.out.println("Enter Valid Option");
		}
		
	}

}
