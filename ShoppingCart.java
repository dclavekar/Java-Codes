/*
Assignment 11 strategy design pattern

Implement and apply Strategy Design pattern for simple Shopping Cart where three payment strategies 
are used such as Credit Card, PayPal, Bit Coin. 
Create an interface for strategy pattern and give concrete implementation for payment.
*/
import java.util.*;
//class for shopping 
class Shopping
{
	int paymentmethod;
	//constructor to show shopping over
	Shopping()
	{
		System.out.println("Items added to cart. Proceed to Payment.");
	}
	//method to select the payment mode and carry out transaction
	public void paymentmode()
	{
		switch(this.paymentmethod)
		{
		case 1:
		{
			//Credit Card
			CreditCard c=new CreditCard();
			c.getdetails();
			c.pay();
			break;
		}
		case 2:
		{
			//PayPal
			PayPal p=new PayPal();
			p.getdetails();
			p.pay();
			break;
		}

		case 3:
		{
			//Bitcoins
			BitCoin b=new BitCoin();
			b.getdetails();
			b.pay();
			break;
		}
		default:
		{
			System.out.println("Thank You");
			return;
		}

		}
	}
}

//interface for common operation pay
interface PaymentGateway
{
	abstract public void getdetails();
	abstract public void pay();
}
//class that implements transaction through credit card 
class CreditCard implements PaymentGateway
{
	private long cardno;
	private String cardholdername;
	private String dateofexpiry;
	private int cvv;
	
	//method to get details of credit card from the user
	public void getdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter card no.:");
		cardno=sc.nextLong();
		System.out.print("Enter card holder name");
		cardholdername=sc.next();
		System.out.print("Enter date of expiry");
		dateofexpiry=sc.next();
		System.out.print("Enter CVV");
		cvv=sc.nextInt();
	}
	//method to pay the amount
	public void pay()
	{
		System.out.println("Transaction Successful using Credit Card!");
	}
}
class PayPal implements PaymentGateway
{
	private String username;
	private String pw;
	
	//method to get details of PayPal from the user
	public void getdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		username=sc.next();
		System.out.println("Enter Password");
		pw=sc.next();
//		System.out.println("Confirm Password");
//		String temp=sc.next();
//		if(!(temp==pw))
//		{
//			System.out.println("Confirm password should be same as Password");
//			getdetails();
//		}
			
	}
	//method to pay the amount
	public void pay()
	{
		System.out.println("Transaction Successful using PayPal!");
	}
}

class BitCoin implements PaymentGateway
{
	private String username;
	private String pw;
	//method to get details of Bitcoins from the user
	public void getdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		username=sc.next();
		System.out.println("Enter Password");
		pw=sc.next();
//		System.out.println("Confirm Password");
//		String temp=sc.next();
//		if(!(temp==pw))
//		{
//			System.out.println("Confirm password should be same as Password");
//			getdetails();
//		}
			
	}
	//method to pay the amount
	public void pay()
	{
		System.out.println("Transaction Successful using Bitcoin!");
	}
}
//main class
public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to shopping website.");
		Shopping s=new Shopping(); 
		System.out.println("Pay using:\n1. Credit card\n2. PayPal\n3. Bit coin ");
		int choice=sc.nextInt();
		s.paymentmethod=choice;
		s.paymentmode();
		
	}

}
//OUTPUT
/*
 Welcome to shopping website.
Items added to cart. Proceed to Payment.
Pay using:
1. Credit card
2. PayPal
3. Bit coin 
1
Enter card no.:741258963
Enter card holder nameXYZ
Enter date of expiry02/2020
Enter CVV123
Transaction Successful using Credit Card!

Welcome to shopping website.
Items added to cart. Proceed to Payment.
Pay using:
1. Credit card
2. PayPal
3. Bit coin 
2
Enter Username
abcd
Enter Password

xyz
Transaction Successful using PayPal!

Welcome to shopping website.
Items added to cart. Proceed to Payment.
Pay using:
1. Credit card
2. PayPal
3. Bit coin 
3
Enter Username
xyz
Enter Password
abcd
Transaction Successful using Bitcoin!
 */



