package Banking_Application;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj1 = new BankAccount("Bala","80558055");
		obj1.showMenu();		
	}

}

class BankAccount
{
	int balance;
	int previousTransaction;
	String customername;
	String customerid;
	
	BankAccount(String cname, String cid)
	{
		customername = cname;
		customerid = cid;
	}
	
	void deposit(int amount)
	{
		if (amount !=0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdrawn(int amount)
	{
		if (amount !=0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction()
	{
		if (previousTransaction > 0)
		{
			System.out.println("Deposited: " +previousTransaction);
		}
		else if (previousTransaction < 0)
		{
			System.out.println("withdrawn: " +Math.abs(previousTransaction));

		}
		else
		{
			System.out.println("No transaction Occured");

		}
	}
	
	void showMenu()
	{
		int Accountnumber;
		
		System.out.println("Enter your Account number : ");
		Scanner scanner = new Scanner (System.in);
		Accountnumber = scanner.nextInt();
		
		if (Accountnumber != 0)
		{
			char option = '\0';
			
			System.out.println();
			System.out.println("Welcome : "+ customername);
			System.out.println("Your Id : "+ customerid);
			System.out.println();
			System.out.println("A. CheckBalance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdrawn");
			System.out.println("D. Previous transaction");
			System.out.println("E. Exit");
			
			do
			{
				System.out.println("==============================");
				System.out.println("Enter an Option");
				System.out.println("==============================");
				option = scanner.next().charAt(0);
				System.out.println();
				
				switch(option)
				{
				
				case 'A':
					System.out.println("---------------------------");
					System.out.println("Balance = "+balance);
					System.out.println("---------------------------");
					System.out.println();
					break;
					
				case 'B':
					System.out.println("---------------------------");
					System.out.println("Enter an amount to deposit");
					System.out.println("---------------------------");
					int amount = scanner.nextInt();
					deposit(amount);
					System.out.println();
					break;
					
				case 'C':
					System.out.println("---------------------------");
					System.out.println("Enter an amount to withdrawn");
					System.out.println("---------------------------");
					int amount2 = scanner.nextInt();
					withdrawn(amount2);
					System.out.println();
					break;
					
				case 'D':
					System.out.println("---------------------------");
					getPreviousTransaction();
					System.out.println("---------------------------");
					System.out.println();
					break;
				
				case 'E':
					System.out.println("************** EXIT **************");
					break;
					
				default:
					System.out.println("Invalid Option!! Please Try again");
					break;
				}
			}
			while(option !='E');
			System.out.println("Thank You for using our service");

		
		}
		else
		{
			System.out.println("Invalid Account Number");
		}
		}
	
	
	
}