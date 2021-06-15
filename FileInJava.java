//import java.io.*;
//import java.util.*;
//import java.io.IOException;
//
//class Student
//{
//	private int id;
//	private String name;
//	private int rollno;
////	private float marks;
////	private String address;
//	
//	public void setdata()
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter student id:");
//		id=sc.nextInt();
//
//		System.out.println("Enter name:");
//		name=sc.next();
//		System.out.println("Enter roll number:");
//		rollno=sc.nextInt();
//		sc.close();
//	}
//	public String convertToString()
//	{
//		return id+"\t"+name+"\t"+rollno+"\t";
//	}
//}
//
//public class FileInJava {
//	
//	public static void createFile()
//	{
//		Scanner sc=new Scanner(System.in);
//		try
//		{
//			System.out.println("Enter the name of the file to be created");
//			String filename=sc.next();
//			File obj=new File(filename+".txt");
//			if(obj.createNewFile())
//			{
//				System.out.println("New file is created: "+obj.getName());
//			}
//			else
//			{
//				System.out.println("A file with "+obj.getName()+" already exists");
//				
//			}
//			writeFile(obj);
//		}
//		catch (IOException e)
//		{
//			System.out.println("Oops! an error occured"+e);
//		}
//		//sc.close();
//	}
//	public static void  writeFile(File obj)
//	{
//		try
//		{
//			Student s=new Student();
//			FileWriter fw=new FileWriter(obj,true);
//			s.setdata();
//			fw.append(s.convertToString());
//			fw.append("\n");
//			fw.close();
//			
//		}
//		catch( IOException e)
//		{
//			System.out.println("Oops! an error occured"+e);
//		}
//		
//		
//	}
//	public static void displayFile() //read a file
//	{
//		System.out.println("Student Id\tName\tRoll No.\tMarks\tAdress");
//		try
//		{
//			//File f=new File("xyz.txt");
////			BufferedReader br=new BufferedReader(new FileReader("c.txt"));
////			while(br.readLine()!=null)
////			{
////				System.out.println(br.readLine());
////			}
////			//br.readLine();
//			BufferedReader file=new BufferedReader(new FileReader("c.txt"));
//			String name;
//			while((name= file.readLine()) !=null)
//			{
//				System.out.println(name);
//			}
//			file.close();
//		}
//		catch( IOException e)
//		{
//			System.out.println("Oops! an error occured"+e);
//		}		
//	}
//	public static void deleteRecord()
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter\n1. To delete a particular record\n2. To clear the complete file");
//		int ch=sc.nextInt();
//		switch(ch)
//		{
//		case 1:
//		{
//			try
//			{
//				System.out.println("Enter the id of the element you want to delete");
//				int delid=sc.nextInt();
//				String delid1=Integer.toString(delid);
//				PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("c.txt",false)));
//				BufferedReader br=new BufferedReader (new FileReader("c.txt"));
//				String x;
//				while((x=br.readLine())!=null)
//				{
//					String[] line= x.split("\t");
//					
//					if(line[0].equals(delid1)) {}
//					else
//					{
//						System.out.println(line[0]+"\t"+line[1]+"\t"+line[2]);
//						
//					}
//				}
//				pw.close();
//				br.close();
//				File newfile= new File("newfile.txt");
//				File oldfile=new File("c.txt");
//				oldfile.delete();
//				newfile.renameTo(oldfile);
//				System.out.println("Record with id "+delid+" is deleted successfully");
//				
//				
//				
//			}
//			catch (IOException e)
//			{
//				System.out.println("Oops! an error occured"+e);
//			}
//			break;
//		}
//		case 2:
//		{
//			break;
//		}
//		default:
//			{
//				sc.close();
//				return;
//			}
//
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int choice=0;
//		while(true)
//		{
//			try
//			{
//				System.out.println("Enter\n1. Create database\n2. Display Database\n3. Delete Records\n4. Update Record\n5. Search Record");
//				choice=sc.nextInt();
//				switch(choice)
//				{
//				case 1:
//				{
//					createFile();
//					
//					break;
//				}
//				case 2:
//				{
//					displayFile();
//					break;
//				}
//	
//				case 3:
//				{
//					deleteRecord();
//					break;
//				}
//	
//				case 4:
//				{
//					break;
//				}
//				case 5:
//				{
//					break;
//				}
//				default:
//				{
//					System.out.println("Thank You");
//					//sc.close();
//					return;
//				}
//				}
//			}
//			catch (Exception e)
//			{
//				System.out.println("OOPs error occured: "+e);
//				break;
//			}
//		}
//		
//	}
//
//}
//
//
