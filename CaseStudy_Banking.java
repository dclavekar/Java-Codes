//Assignment 9 case study
/*
Using concepts of Object-Oriented programming develop solution for any one application
1) Banking system having following operations :
1. Create an account 2. Deposit money 3. Withdraw money 4. Honor daily withdrawal limit
5. Check the balance 6. Display Account information.
2) Inventory management system having following operations :
1. List of all products 2. Display individual product information 3. Purchase 4. Shipping
5. Balance stock6. Loss and Profit calculation.

//glitch with the problem statement: cannot consider sum of multiple withdraws to check if min withdrawl is already achieved


*/
import java.util.*;
//class declaration for account operations
class Account
{
	//declaration of data members
	private String name, type;
	private long accno;
	private double bal,minbal,minwd;
		
	//constructor
	Account()
	{
		this.bal=0;
		this.minbal=1000;		
	}
	//parametrized constructor
	Account(int bal)
	{
		this.bal=bal;
		this.minbal=1000;
	}
	//method to get details for account from the user
	public void getdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter details:\nCustomer Name: ");
		this.name=sc.next();
		System.out.print("Type of Account you want to create: Personal/Current");
		this.type=sc.next();
		System.out.print("Account number: ");
		this.accno=sc.nextLong();
		System.out.print("Minimum Daily Withdraw limit (cannot exceed rs. 1,00,000): ");
		//validation of minimum daily withdraw limit
		this.minwd=sc.nextDouble();
		if(minwd>100000)
		{
			System.out.println("Sorry minimum daily withdraw limit cannot exceed Rs. 1,00,000. Enter again. ");
			this.minwd=sc.nextDouble();
		}
		//warning for maintaining minimum balance
		System.out.println("The balance is currently 0. You need a minimum balance of Rs. 1000 for account existence. Please deposit to avoid inconvenience.");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	//method to check if available balance is less than minimum balance required
	public void checkbal()
	{
		if(bal<minbal)
		{
			System.out.println("Your balance is less than the minimum balance required. Please deposit money within next 5 working days to avoid inconvinience");

		}
	}
	//method to deposit money
	public void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount you want to deposit: ");
		double depamt=sc.nextDouble();
		bal+=depamt;	
		System.out.println("Amount deposited successfully!");
		checkbal();
	}
	//method to withdrw money
	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount you want to withdraw: ");
		double wdamt=sc.nextDouble();
		
		if(wdamt>bal) //checking if there is enough balance
		{
			System.out.println("Sorry there is not enough balance");
		}
		else if(wdamt>minwd) //checking if amount exceeds withdraw limit
		{
			System.out.println("Sorry, daily withdrawl limit exceeded. You can remove only Rs. "+minwd+" per day");
		}
		else //successful withdrawl
		{
			bal-=wdamt;
			System.out.println("Amount withdrawed successfully!");
			checkbal();
		}
	}
	//method to display available balance
	public void displaybal()
	{
		System.out.println("The current balance is: "+bal);
	}
	//method to display the account information
	public void displaydetails()
	{
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Name\t\tAccount No.\t\tType of Account\t\tBalance");
		System.out.println(name+"\t\t"+accno+"\t\t"+type+"\t\t\t"+bal);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	}
	
}
public class CaseStudy_Banking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome");
		int choice;
		Account a=new Account();
		while(true)
		{
			System.out.println("\nEnter for following operations\n1. Create an account\n2. Deposit money\n3. Withdraw money\n4. Check the balance \r\n" + 
					"5. Display Account information\nAnything else to quit");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				a.getdetails();
				System.out.println("New Account created successfully");
				break;
			}
			case 2:
			{
				a.deposit();
				break;
			}

			case 3:
			{
				a.withdraw();
				break;
			}

			case 4:
			{
				a.displaybal();
				break;
			}

			case 5:
			{
				a.displaydetails();
				break;
			}
			
			default:
			{
				System.out.println("Thank you");
				return;
			}

			}
		}
		
		

	}

}
//OUTPUT
/*
Welcome

Enter for following operations
1. Create an account
2. Deposit money
3. Withdraw money
4. Check the balance 
5. Display Account information
Anything else to quit
1
Enter details:
Customer Name: John
Type of Account you want to create: Personal/CurrentPersonal
Account number: 11745612844
Minimum Daily Withdraw limit (cannot exceed rs. 1,00,000): 10000
The balance is currently 0. You need a minimum balance of Rs. 1000 for account existence. Please deposit to avoid inconvenience.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
New Account created successfully

Enter for following operations
1. Create an account
2. Deposit money
3. Withdraw money
4. Check the balance 
5. Display Account information
Anything else to quit
2
Enter the amount you want to deposit: 400
Amount deposited successfully!
Your balance is less than the minimum balance required. Please deposit money within next 5 working days to avoid inconvinience

Enter for following operations
1. Create an account
2. Deposit money
3. Withdraw money
4. Check the balance 
5. Display Account information
Anything else to quit
4
The current balance is: 400.0

Enter for following operations
1. Create an account
2. Deposit money
3. Withdraw money
4. Check the balance 
5. Display Account information
Anything else to quit
3
Enter the amount you want to withdraw: 900
Sorry there is not enough balance

Enter for following operations
1. Create an account
2. Deposit money
3. Withdraw money
4. Check the balance 
5. Display Account information
Anything else to quit
3
Enter the amount you want to withdraw: 50
Amount withdrawed successfully!
Your balance is less than the minimum balance required. Please deposit money within next 5 working days to avoid inconvinience

Enter for following operations
1. Create an account
2. Deposit money
3. Withdraw money
4. Check the balance 
5. Display Account information
Anything else to quit
2
Enter the amount you want to deposit: 700
Amount deposited successfully!

Enter for following operations
1. Create an account
2. Deposit money
3. Withdraw money
4. Check the balance 
5. Display Account information
Anything else to quit
4
The current balance is: 1050.0

Enter for following operations
1. Create an account
2. Deposit money
3. Withdraw money
4. Check the balance 
5. Display Account information
Anything else to quit
5
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Name		Account No.		Type of Account		Balance
John		11745612844		Personal			1050.0
----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Enter for following operations
1. Create an account
2. Deposit money
3. Withdraw money
4. Check the balance 
5. Display Account information
Anything else to quit
7
Thank you




*/