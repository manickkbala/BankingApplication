package Banking_Application;

import java.util.Scanner;

public class MyCodeBA {
	char option = '\0';
	int balance;

	static Scanner scanner;

	public static void main(String[] args) {

		System.out.println("Welcome to Axis Bank !!!");
		System.out.println();
		System.out.println("Please Enter your Registered Account Number : ");
		//int AccountNumber = scanner.nextInt();		
			System.out.println();
			System.out.println("Welcome <Customer Name>");
			System.out.println();
			System.out.println("Please select an option to proceed");
			System.out.println("A. CheckBalance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdrawn");
			System.out.println("D. Previous transaction");
			System.out.println("E. Exit");		
	}
	
	void Deposit(int amount)
	{
		
		if (amount !=0)
		{
			balance = balance +amount;
		}
		
		do
		{
			
		char option = scanner.next().charAt(0);
		System.out.println();

		switch (option)
		{
		case 'A':
			System.out.println("---------------------------");
			System.out.println("Balance = "+balance);
			System.out.println("---------------------------");
			System.out.println();
		
		}
		
	}
		while(option !='E');
		System.out.println("Thank You for using our service");
	}
	
	

}
