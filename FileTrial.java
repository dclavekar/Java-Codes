import java.io.File;
import java.util.*;
import java.io.IOException;

public class FileTrial {
	
	public static void createFile()
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the name of the file to be created");
			String filename=sc.next();
			File obj=new File(filename+".txt");
			if(obj.createNewFile())
			{
				System.out.println("New file is created: "+obj.getName());
			}
			else
			{
				System.out.println("A file with "+obj.getName()+" already exists");
				
			}
		}
		catch (IOException e)
		{
			System.out.println("Oops! an error occured"+e);
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter\n1. Create database\n2. Display Database\n3. Delete Records\n4. Update Record\n5. Search Record");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				createFile();
				break;
			}
			case 2:
			{
				break;
			}

			case 3:
			{
				break;
			}

			case 4:
			{
				break;
			}
			case 5:
			{
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

}
