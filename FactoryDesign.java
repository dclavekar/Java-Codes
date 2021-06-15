//Assignment 10 factory design pattern

/*
 Implement Factory design pattern for the given context.
 Consider Car building process, which requires many steps from allocating accessories to final makeup.
 These steps should be written as methods and should be called while creating an instance of a specific car type.
 Hatchback, Sedan, SUV could be the subclasses of Car class.
 Car class and its subclasses, CarFactory and Test Factory Pattern should be implemented
 */

import java.util.Scanner;
// base class declaration for car model
class Cars
{   
	//private data members
    private String Colour;
    private boolean engineassembled;
    private boolean wheelsassembled;
    private boolean chassisready;
    private double price;
    //get methods
    public String getcolour()
    {
    	return Colour;
    }
    public double getprice()
    {
    	return price;
    }
    //set methods
    public void setcolour(String col)
    {
    	 Colour=col;
    }
    public void setengineassembled(boolean status)
    {
    	engineassembled=status;
    }
    public void setwheelsassembled(boolean status)
    {
    	wheelsassembled=status;
    }
    public void setchassisready(boolean status)
    {
    	chassisready=status;
    }
    public void setprice(double p)
    {
    	price=p;
    }
    //method to set details for default model of any car
    public void defaultmodel()
    {
        Colour = "white";
        engineassembled = false;
        wheelsassembled = false;
        chassisready = false;
        price = 0;
    }
    //method to get what type of car is being manufactured
    public int gettype()
    {      
        int type;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of car to be manufactured: ");
        System.out.println("1. SUV");
        System.out.println("2. Hatchback");
        System.out.println("3. Sedan");
        type = sc.nextInt();
        return (type>0 && type<4)? type : gettype();
    }
}
//subclass SUV
class SUV extends Cars
{   
		//constructor
        SUV()
        {
            super.defaultmodel();
        }
        
}
class Hatchback extends Cars
{
	//constructor
        Hatchback()
        {
        	super.defaultmodel();
        }
}
class Sedan extends Cars
{   
	//constructor
        Sedan()
        {
        	super.defaultmodel();
        }
}
//interface declaration
interface Testfactory
{
    public void engine();
    public void wheels();
    public void chassis();
    public String paint();
    public double pricetag(int x);
}
//class that implements interface Testfactory
class Carfactory implements Testfactory
{   
	//method to get engine ready
    public void engine()
    {
        System.out.println("Engine is Assembled");
    }
  //method to get chassis ready
    public void chassis()
    {
        System.out.println("Chassis is ready");
    }
  //method to get wheels ready
    public void wheels()
    {
        System.out.println("Wheels are Assembled");
    }
  //method to paint the car according to colour of customers choice
    public String paint()
    {   
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the desired Colour: ");
        return(sc2.nextLine());
    }
    //method to allot predefined pricetags to car models
    public double pricetag(int x)
    {
        if(x ==1)
        {   
            System.out.println("Price of our SUV Model is: Rs. 10,00,000");
            return 1000000;
        }
        else if (x ==2)
        {   
            System.out.println("Price of our Harchback Model is: Rs. 9,00,000");
            return 900000;
        }
        else 
        {
            System.out.println("Price of our Sedan Model is: Rs. 12,00,000");
            return 1200000;
        }
    }

}
//main class
public class  FactoryDesign 
{
    public static void main(String[] args)
    {
        Cars c = new Cars(); //creation of object ie. instantization of a new car order
        Carfactory f = new Carfactory(); //order sent to car factory
        
        while(true)
        {
	        int type = c.gettype();
	        //menu driven program
	        switch(type)
	        {
		        case 1:
		        {
		            System.out.println("SUV is being Created in the factory");
		            SUV s1 = new SUV();
		            f.chassis();
		            s1.setchassisready(true);
		            f.engine();
		            s1.setengineassembled(true);
		            f.wheels();
		            s1.setwheelsassembled(true);
		            s1.setcolour(f.paint());
		            s1.setprice(f.pricetag(type));
		            System.out.println("Your "+ s1.getcolour()+" SUV costs "+ s1.getprice()); //final display
		            break;
		        }
		        case 2:
		        {
		            System.out.println("Hatchback is being Created in the factory");
		            Hatchback s1 = new Hatchback();
		            f.chassis();
		            s1.setchassisready(true);
		            f.engine();
		            s1.setengineassembled(true);
		            f.wheels();
		            s1.setwheelsassembled(true);
		            s1.setcolour(f.paint());
		            s1.setprice(f.pricetag(type));
		            System.out.println("Your "+ s1.getcolour()+" Hatchback costs "+ s1.getprice());  //final display
		            break;
		        }
		        case 3:
		        {
		            System.out.println("Sedan is being Created in the factory");
		            Hatchback s1 = new Hatchback();
		            f.chassis();
		            s1.setchassisready(true);
		            f.engine();
		            s1.setengineassembled(true);
		            f.wheels();
		            s1.setwheelsassembled(true);
		            s1.setcolour(f.paint());
		            s1.setprice(f.pricetag(type));
		            System.out.println("Your "+ s1.getcolour()+" Sedan costs "+ s1.getprice());  //final display
		            break;
		        }
		        default:
		        {
		        	System.out.println("thank you");
		        	return;
		        }
	        }
        }
    }
}
//OUTPUT
/*
Enter the type of car to be manufactured: 
1. SUV
2. Hatchback
3. Sedan
1
SUV is being Created in the factory
Chassis is ready
Engine is Assembled
Wheels are Assembled
Enter the desired Colour: 
Red
Price of our SUV Model is: Rs. 10,00,000
Your Red SUV costs 1000000.0
Enter the type of car to be manufactured: 
1. SUV
2. Hatchback
3. Sedan
2
Hatchback is being Created in the factory
Chassis is ready
Engine is Assembled
Wheels are Assembled
Enter the desired Colour: 
White
Price of our Harchback Model is: Rs. 9,00,000
Your White Hatchback costs 900000.0
Enter the type of car to be manufactured: 
1. SUV
2. Hatchback
3. Sedan
3
Sedan is being Created in the factory
Chassis is ready
Engine is Assembled
Wheels are Assembled
Enter the desired Colour: 
Black
Price of our Sedan Model is: Rs. 12,00,000
Your Black Sedan costs 1200000.0



*/