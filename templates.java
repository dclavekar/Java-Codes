//Assignment no 7
//Implement a generic program using any collection class to count the number of elements in a 
//collection that have a specific property such as even numbers, odd number, prime number and 
//palindromes.

import java.util.*;
import java.util.ArrayList;

//class for operations on integer ArrayLists
class IntArrayLists
{
	private ArrayList <Integer> a;
	//constructor
	public IntArrayLists(ArrayList a)
	{
		this.a=a;
	}
	//function to check if numbers in arraylist are even or odd and counting them respectively
	public void even_odd_nos()
	{
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println("Total count of even nos in the arraylist is: "+evencount);
		System.out.println("Total count of odd nos in the arraylist is: "+oddcount);
	}
	//function to check if numbers in arraylist are prime or not and counting them 
	public void primenos()
	{
		
		int primecount=0;
		for(int i=0;i<a.size();i++)
		{
			boolean isprime=true;			
			for(int j=2;j<=a.get(i)/2;j++)
			{
				if((a.get(i)%j==0))
				{
					isprime=false;					
					break;
				}					
			}
			if(isprime==true){primecount++;}	
		}
		System.out.println("Total count of Prime Numbers in the arraylist is: "+primecount);
	}
	//function to check if numbers in arraylist are pallindromes and counting them 
	public void pallindrome()
	{
		int palcount=0;
		for(int i=0;i<a.size();i++)
		{
			int x=a.get(i);
			int sum=0;
			int rem=0;
			while(x>0)
			{
				rem=x%10;
				sum=sum*10+rem;
				//System.out.println("sum: "+sum);
				x=x/10;
			}
			if(sum==a.get(i))
			{
				palcount++;
			}
		}
		System.out.println("Total count of nos that are pallindromes is: "+palcount);
	}


}
//class for operations on String ArrayLists
class StringArrayLists
{
	private ArrayList <String> s;
	//constructor
	public StringArrayLists(ArrayList<String> s)
	{
		this.s=s;
	}
	//function to check if elements in arraylist are pallindromes and counting them 
	public void pallindrome() 
	{
		int palcount=0;
		StringBuilder str=new StringBuilder();
		for(int i=0;i<s.size();i++)
		{
			str.append(s.get(i));
			StringBuilder str1=str.reverse();
			if(str==str1)
			{
				palcount++;
			}
		}
		System.out.println("Total count of Strings that are pallindromes is: "+palcount);
	}
	//function to check the frequency of a certain character in the ArrayList
	public void charcount()
	{
		int charcount=0;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character who's frequency you want to check:");
		char token=sc.next().charAt(0);
		for(int i=0;i<s.size();i++)
		{
			for(int j=0;j<s.get(i).length();j++)
			{
				if(token==s.get(i).charAt(j))
				{
					charcount++;
				}
			}
		}
		System.out.println("No of times character "+token+" exists in the ArrayList is: "+charcount);
	}
}	
//main class
public class templates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Integer ArrayList and 2 for String ArrayList");
		int ch=sc.nextInt();
		while(true)
		{
			switch(ch)
			{
			case 1:
			{
				ArrayList <Integer> a =new ArrayList<>();
				System.out.println("Enter the elements in ArrayList. Enter -1 to stop.");
				int temp=1;
				while(temp>=0)
				{
					temp=sc.nextInt();
					if(temp<0)break;
					a.add(temp);		
				}
				System.out.println(a);
				IntArrayLists A=new IntArrayLists(a);
				while(true)
				{
					System.out.println("Enter\n1.Counting Even Numbers and Odd Numbers\n2.Counting Prime Numbers\n3.Counting numbers that are Pallindromes\nAnything else to stop");
					int choice=sc.nextInt();
					switch(choice)
					{
					case 1:
					{
						A.even_odd_nos();
						break;
					}
					case 2:
					{
						A.primenos();
						break;
					}
					case 3:
					{
						A.pallindrome();
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
			case 2:
			{
				ArrayList <String> s=new ArrayList<String>();
				System.out.println("Enter the string elements in ArrayList. Enter 'stop' to stop.");
				String temp="a";
				while(true)
				{
					temp=sc.next();
					if(temp.equals("stop"))break;
					s.add(temp);
				}
				
				System.out.println(s);
				StringArrayLists S=new StringArrayLists(s);
				int choice=0;
				while(true)
				{
					System.out.println("Enter\n1. Count pallindromes\n2. Count Frequency of Character");
					choice=sc.nextInt();
					switch(choice)
					{
					case 1:
					{
						S.pallindrome();
						break;
					}
					case 2:
					{
						S.charcount();
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
			default:return;
			}

		}
		
	}

}
//OUTPUT
/*
 Enter 1 for Integer ArrayList and 2 for String ArrayList
1
Enter the elements in ArrayList. Enter -1 to stop.
2
14
757
3
81
9
-1
[2, 14, 757, 3, 81, 9]
Enter
1.Counting Even Numbers and Odd Numbers
2.Counting Prime Numbers
3.Counting numbers that are Pallindromes
Anything else to stop
1
Total count of even nos in the arraylist is: 2
Total count of odd nos in the arraylist is: 4
Enter
1.Counting Even Numbers and Odd Numbers
2.Counting Prime Numbers
3.Counting numbers that are Pallindromes
Anything else to stop
2
Total count of Prime Numbers in the arraylist is: 3
Enter
1.Counting Even Numbers and Odd Numbers
2.Counting Prime Numbers
3.Counting numbers that are Pallindromes
Anything else to stop
3
Total count of nos that are pallindromes is: 4
Enter
1.Counting Even Numbers and Odd Numbers
2.Counting Prime Numbers
3.Counting numbers that are Pallindromes
Anything else to stop
0
Thank you

Enter 1 for Integer ArrayList and 2 for String ArrayList
2
Enter the string elements in ArrayList. Enter 'stop' to stop.
right
apple
sky
mom
tree
eye
tomato
stop
[right, apple, sky, mom, tree, eye, tomato]
Enter
1. Count pallindromes
2. Count Frequency of Character
1
Total count of Strings that are pallindromes is: 2
Enter
1. Count pallindromes
2. Count Frequency of Character
2
Enter the character who's frequency you want to check:
a
No of times character a exists in the ArrayList is: 2
Enter
1. Count pallindromes
2. Count Frequency of Character
2
Enter the character who's frequency you want to check:
t
No of times character t exists in the ArrayList is: 4
Enter
1. Count pallindromes
2. Count Frequency of Character
0
Thank You



 
 */
