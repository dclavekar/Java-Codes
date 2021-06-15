////Assignment 6 exception handling
//Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user enters 
//two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2 
//are not integers, the program would throw a Number Format Exception. If Num2 were zero, the 
//program would throw an Arithmetic Exception. Display the exception.


import java.util.Scanner;

//class to check IndexOutOfBound and NumberFormat exceptions
class exc {
	//function to check IndexOutOfBound exception
	public static void checkIndex (int size, int index, int arr[]) throws Exception{
		
		
		if(index >= size || index < 0)
		{
			throw new Exception("Index Out Of Bound");
			
		}
	}
		
	//function to check NumberFormat exception
    public static int check(String s) throws Exception {
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c < '0' || c > '9') {
				throw new Exception("Entered value is not an integer");
			}
		}		
		return Integer.parseInt(s);
	}
}
//class to check if the denominator is 0
class  checkdiv
{
    static void div(int a, int b) throws Exception
    {
        if(b==0)
        {
            throw new Exception("Denominator is zero");
        }
        Double division= Double.longBitsToDouble(a)/Double.longBitsToDouble(b);
        System.out.println("Division is :"+ division);

    }
}
public class exception {

	public static void main(String[] args) {	
		int choice = 7;
		Scanner sc = new Scanner(System.in);
		//menu driven program
		while(choice != 0) {
			System.out.println("\n1.Perform division");
			System.out.println("2.Array operations");
			System.out.println("3.Number format checking");
			System.out.println("0.Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:{
				System.out.print("\nEnter first number : ");
				String s1 = sc.next();
				int n1 = 0;
                try
                {
					n1 = exc.check(s1);
				} 
				catch(Exception e) {
					System.out.println("\n" + e);
					break;
				}
				
				System.out.print("\nEnter second number : ");
				String s2 = sc.next();
				int n2 = 0;
				try{
					n2 = exc.check(s2);
				}
				catch(Exception e) {
					System.out.println("\n" + e);
					break;
				}
				
				int a;
				try {
					checkdiv.div(n1,n2);
				}
				catch(Exception ae){
					System.out.println("\n"+ ae);
				}     
				
				break;
			}
			case 2:{
				
				System.out.print("\nEnter The Size Of The Array : ");
				String s1 = sc.next();
				int n1;
				try{
					n1 = exc.check(s1);
				}
				catch(Exception e) {
					System.out.println("\n" + e);
					break;
				}
				
				int arr[] = new int[n1];
				
				for(int i = 0; i < n1; i++) {
					System.out.print("7 ");
					arr[i] = 7; //temporary hardcoded array
				}
				
				
				System.out.print("\nEnter The Index Of The Array You Want To Invert : ");
				String s2 = sc.next();
				int n2 = 0;
				try{
					n2 = exc.check(s2);
				}
				catch(Exception e) {
					System.out.println("\n" + e);
					break;
				}
				
				try {
					exc.checkIndex(n1, n2,arr);
					arr[n2] = 0;
					
					
					for(int i = 0; i < n1; i++) {
						System.out.print(arr[i] + " ");
					}
					
					
				}
				catch(Exception e){
					System.out.println("\n" + e);
					
					
					break;
				}
				
				break;
			}
			case 3:
			{
				System.out.print("Enter the number to be checked: ");
				String x= sc.next();
				try
				{
					exc.check(x);
					System.out.println("Entered number is an integer.");  
					break;
				}
				catch(Exception e)
				{
					System.out.println("\n" + e);
					break;
				}
			}
			
			default:{
				System.out.println("Thank you");
				break;
			}
			}
			
		}
		
		
	}
}
//OUTPUT
/*
1.Perform division
2.Array operations
3.Number format checking
0.Exit
1

Enter first number : 4

Enter second number : 0

java.lang.Exception: Denominator is zero

1.Perform division
2.Array operations
3.Number format checking
0.Exit
1

Enter first number : 4

Enter second number : 2
Division is :2.0

1.Perform division
2.Array operations
3.Number format checking
0.Exit
2

Enter The Size Of The Array : 3
7 7 7 
Enter The Index Of The Array You Want To Invert : 1
7 0 7 
1.Perform division
2.Array operations
3.Number format checking
0.Exit
2

Enter The Size Of The Array : 3
7 7 7 
Enter The Index Of The Array You Want To Invert : 9

java.lang.Exception: Index Out Of Bound

1.Perform division
2.Array operations
3.Number format checking
0.Exit
3
Enter the number to be checked: 4
Entered number is an integer.

1.Perform division
2.Array operations
3.Number format checking
0.Exit
3
Enter the number to be checked: s

java.lang.Exception: Entered value is not an integer

1.Perform division
2.Array operations
3.Number format checking
0.Exit
0
Thank you

*/





