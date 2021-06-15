////Assignment 5 interface
//Design and develop a context for given case study and implement an interface for Vehicles 
//Consider the example of vehicles like bicycle, car and bike. All Vehicles have common 
//functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all 
//these common functionalities. Bicycle, Bike, Car classes should be implemented for all these 
//functionalities in their own class in their own way.

import java.util.*;
////interface declaration 1
//interface Printable{
//	void print();
//}
////class declaration 
//class Print implements Printable
//{
//	public void print()
//	{
//		System.out.println("The interface is implemented successfully!");
//	}
//}
////interface declaration 2
//interface shape
//{
//	void area();
//	void volume();
//	double pi=3.14;
//}
////class declaration 
//class Circle implements shape
//{
//	private double rad;
//	Circle()
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter radius of circle: ");
//		this.rad=sc.nextDouble();
//		sc.close();
//	}
//	public void area()
//	{
//		System.out.println("\nArea of circle is: "+ pi*rad*rad);
//		
//	}
//	public void volume(){}
//}
////class declaration 
//class Rectangle implements shape
//{
//	private int a,b;
//	Rectangle(){
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter sides of rectangle: ");
//		this.a=sc.nextInt();
//		this.b=sc.nextInt();
//		sc.close();
//	}
//	public void area()
//	{
//		System.out.println("Area of rectangle is: "+ a*b);
//	}
//	public void volume() {}
//}


//interface declaration 3
interface Vehicle
{
	
	void speedup();
	void gear_change();
	void apply_brakes();
}
//class declaration 
class Bicycle implements Vehicle
{
	Bicycle()
	{System.out.println("The weather is sunny today. I am going cycling today on my gearless cycle!");}
	
	public void speedup()
	{
		System.out.println("Speeding up to 10 mph");
	}
	public void gear_change()
	{
		System.out.println("Sorry my cycle doesnt have gears");
	}
	public void apply_brakes()
	{
		System.out.println("Ohh theres a puddle! Applied brakes");
	}
	
}
//class declaration 
class Bike implements Vehicle
{
	Bike()
	{System.out.println("The weather is windy today. Lets go on a bike ride!");}
	
	public void speedup()
	{
		System.out.println("Speeding up to 30 mph");
	}
	public void gear_change()
	{
		System.out.println("Putting third gear");
	}
	public void apply_brakes()
	{
		System.out.println("Ohh theres a speed breaker! Applied brakes");
	}
	
}
//class declaration 
class Car implements Vehicle
{
	Car()
	{System.out.println("The weather is cloudy today. Lets go for a long drive in car!");}
	
	public void speedup()
	{
		System.out.println("Speeding up to 60 mph");
	}
	public void gear_change()
	{
		System.out.println("Putting fifth gear");
	}
	public void apply_brakes()
	{
		System.out.println("Ohh theres a tresspasser! Applied brakes");
	}
	
}

public class Interface {

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
//			System.out.println("\nEnter\n1. Printable interface\n2. Shape interface\n");
			System.out.println("3. Vehicle interface");
			int choice= sc.nextInt();
			switch(choice)
			{
//			case 1:
//			{
//				Print p=new Print();
//				p.print();
//				break;
//			}
//			case 2:
//			{
//				Circle c=new Circle();
//				c.area();
//				Rectangle r=new Rectangle();
//				r.area();
//			
//				break;
//			}
			case 3:
			{
				System.out.println("Enter\na. Bicycle\nb. Bike\nc. Car");
				String ch=sc.next();
				switch(ch)
				{
				case "a":
				{
					Bicycle bi=new Bicycle();
					bi.speedup();
					bi.gear_change();
					bi.apply_brakes();
					break;
				}
				case "b":
				{
					Bike bike=new Bike();
					bike.speedup();
					bike.gear_change();
					bike.apply_brakes();
					break;
				}
				case "c":
				{
					Car car=new Car();
					car.speedup();
					car.gear_change();
					car.apply_brakes();
					break;
				}
				default:break;

				}
				break;
			}
			default:break;
			}
		}
		
		}
	
}
/*
 OUTPUT
 
Enter
1. Printable interface
2. Shape interface
3. Vehicle interface
1
The interface is implemented successfully!

Enter
1. Printable interface
2. Shape interface
3. Vehicle interface
2
Enter radius of circle: 1.2

Area of circle is: 4.521599999999999
Enter sides of rectangle: 4  5

Area of rectangle is: 20.0

Enter
1. Printable interface
2. Shape interface
3. Vehicle interface
3
Enter
a. Bicycle
b. Bike
c. Car
a
The weather is sunny today. I am going cycling today on my gearless cycle!
Speeding up to 10 mph
Sorry my cycle doesnt have gears
Ohh theres a puddle! Applied brakes

Enter
1. Printable interface
2. Shape interface
3. Vehicle interface
3
Enter
a. Bicycle
b. Bike
c. Car
b
The weather is windy today. Lets go on a bike ride!
Speeding up to 30 mph
Putting third gear
Ohh theres a speed breaker! Applied brakes

Enter
1. Printable interface
2. Shape interface
3. Vehicle interface
3
Enter
a. Bicycle
b. Bike
c. Car
c
The weather is cloudy today. Lets go for a long drive in car!
Speeding up to 60 mph
Putting fifth gear
Ohh theres a tresspasser! Applied brakes


 
 
 
 */


