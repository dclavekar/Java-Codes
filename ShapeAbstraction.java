////Assignment 4 Dynamic binding
//Design a base class shape with two double type values and member functions to input the data 
//and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make 
//compute_area() as abstract function and redefine this function in the derived class to suit their 
//requirements. Write a program that accepts dimensions of triangle/rectangle and display 
//calculated area. Implement dynamic binding for given case study.



import java.util.Scanner;
//abstract class
abstract class SHAPE{
	Scanner sc=new Scanner(System.in);
	
	private	double a,b; //private data members
	//constructors
	 
	SHAPE()
	{
		System.out.println("Enter the sides: ");
		this.a=sc.nextDouble();
		this.b=sc.nextDouble();
	}
	//get methods
	public double geta() {return a;}
	public double getb() {return b;}
	
	//abstract method
	abstract public double compute_area();
	
}
//derived class
class rectangle extends SHAPE
{
	public double compute_area()
	{
		return geta()*getb(); //returns area of rectangle
	}
}
//derived class
class triangle extends SHAPE
{
	public double compute_area()
	{
		return (geta()*getb())/2; //returns area of triangle
	}
}
public class ShapeAbstraction {
	
	//main function
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//menu driven program
		int temp=1;
		while(temp!=0)
		{	
		System.out.println("Enter 1 for rectangle. 2 for triangle");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{	
			rectangle r=new rectangle();
			double area=r.compute_area();
			System.out.println("The area of Rectangle is: "+area); //display of area
			break;			
		}
		case 2:
		{
			triangle t=new triangle();
			double area=t.compute_area();
			System.out.println("The area of Triangle is: "+area); //display of area
			break;
		}
		default:System.out.println("Invalid Input");
				
		}
		System.out.println("Enter 0 to stop, anything else to continue: ");
		temp=sc.nextInt();
		}
		sc.close();
		System.out.println("Thank you!");
	}

}
//OUTPUT
/*
Enter 1 for rectangle. 2 for triangle
1
Enter the sides: 
4
5
The area of Rectangle is: 20.0
Enter 0 to stop, anything else to continue: 
1
Enter 1 for rectangle. 2 for triangle
2
Enter the sides: 
4
5
The area of Triangle is: 10.0
Enter 0 to stop, anything else to continue: 
0
Thank you! 
 */














