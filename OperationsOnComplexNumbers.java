//Assignment 1 Classes and Objects

//Design a class ‘Complex ‘with data members for real and imaginary part. Provide default and 
//Parameterized constructors. Write a program to perform arithmetic operations of two complex 
//numbers.


import java.util.Scanner; //importing Scanner class				


class Complex{  //defining a complex class
	private float x,y; //declaring of private variables
	// x is the real part of complex number and y is the imaginary part of the complex number
	public Complex() //constructor 1 of class complex without parameters
	{
		x=y=0; //initializing of variables 
	}
	
	public Complex(float a,float b) //constructor 2 of class complex with parameters
	{
		this.x=a;
		this.y=b;
	}	
	public void display(float x, float y) //function to display the complex no
	{
		System.out.println("the complex no is: "+x+"+i("+y+")");
	}
	public void add_results(float x, float y)
	{
		System.out.println("addition of two complex nos. is:"+ x+"+i("+y+")"); //result display
		
	}
	public void add(Complex num1, Complex num2) //function for addition
	{
		
		x=(num1.x+num2.x);
		y=(num1.y+num2.y);
		add_results(x,y);
		
	}
	public void sub_results(float x, float y)
	{
		System.out.println("Subtraction of two complex nos. is:"+ x+"+i("+y+")"); //result display
					
	}
	public void subtract(Complex num1, Complex num2) //function for subtraction
	{
		
		x=(num1.x-num2.x);
		y=(num1.y-num2.y);
		sub_results( x, y);
		
	}
	public void mul_results(float x, float y)
	{
		System.out.println("Multiplication of two complex nos. is:"+ x+"+i("+y+")");  //result display
					
	}
	public void multiply(Complex num1, Complex num2)  //function for multiplication
	{
		
		x=((num1.x*num2.x)-(num1.y*num2.y));
		y=((num1.x*num2.y)+(num2.x*num1.y));
		mul_results( x,  y);
		
		
	}
	public void div_results(float x, float y)
	{
		System.out.println("Division of two complex nos. is:"+ x+"+i("+y+")"); //result display
					
	}
	public void divide(Complex num1, Complex num2)  //function for division
	{	
		
		if(num2.x==0 || num2.y==0) //validation
		{
			System.out.println("the real and imaginary parts of denominator cannot be 0");
		}
		else
		{
			x= ((num1.x*num2.x)+(num1.y*num2.y))/((num2.x*num2.x)+(num2.y*num2.y));
			y=((num1.y*num2.x)-(num1.x*num2.y))/((num2.x*num2.x)+(num2.y*num2.y));
			div_results(x,  y);
		}
					
	}
	
};
public class OperationsOnComplexNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //object creation of Scanner class
		System.out.println("enter real and imaginary part of the complex no 1");
		float a=sc.nextFloat(); //taking input for real part
		float b=sc.nextFloat();  //taking input for imaginary part
		Complex c1= new Complex(a,b); //creation of new object of class complex
		c1.display(a,b); //function calling
		System.out.println("enter real and imaginary part of the complex no 2");
		float m=sc.nextFloat(); //input taking for real part
		float n=sc.nextFloat();  //taking input for imaginary part
		Complex c2= new Complex(m,n);  //creation of new object of class complex
		c2.display(m,n);  //function calling
		
		//menu driven program
		System.out.println("For following operations press:\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division");
		
		//initializing choice to -1
		int choice=-1;
		while(choice!=0) //condition for menu driven program to continue
		{
		choice=sc.nextInt();
		if(choice==0)
		{
			break;
		}
		
		Complex result=new Complex(); //creation of new object of complex class
				
		switch(choice)
		{
		case 1: {
			result.add(c1, c2); //function calling using object result
			break;
			
		}
		case 2:{
			result.subtract(c1, c2);  //function calling using object result
			break;
		}
		case 3:{
			result.multiply(c1, c2);  //function calling using object result
			break;
		}
		case 4:{
			result.divide(c1,c2);  //function calling using object result
			break;
		}
		default:System.out.println("enter valid input");  //validation
		}
		System.out.println("enter 0 for stopping or else continue according to the above instructions"); //instruction for user
		}			


	}

}

//OUTPUT
/*
enter real and imaginary part of the complex no 1
4
6
the complex no is: 4.0+i(6.0)
enter real and imaginary part of the complex no 2
-5
2
the complex no is: -5.0+i(2.0)
For following operations press:
1 for addition
2 for subtraction
3 for multiplication
4 for division
1
addition of two complex nos. is:-1.0+i(8.0)
enter 0 for stopping or else continue according to the above instructions
2
Subtraction of two complex nos. is:9.0+i(4.0)
enter 0 for stopping or else continue according to the above instructions
3
Multiplication of two complex nos. is:-32.0+i(-22.0)
enter 0 for stopping or else continue according to the above instructions
4
Division of two complex nos. is:-0.27586207+i(-1.3103448)
enter 0 for stopping or else continue according to the above instructions
0



*/
