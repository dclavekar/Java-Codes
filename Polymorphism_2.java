//Assignment 2 Polymorphism

//Identify commonalities and differences between Publication, Book and Magazine classes. Title, 
//Price, Copies are common instance variables and saleCopy is common method. The differences 
//are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty, Current issue, 
//receiveissue().Write a program to find how many copies of the given books are ordered and 
//display total sale of publication.

import java.util.*;
//parent class
class Publication
{
	//declaring private data members
	private String title;
	private double price;
	private int copies;
	
	//get set methods
	public int getcopies()
	{			
		return this.copies;
	}
	public void setcopies(int copies)
	{
		this.copies=copies;
	}
	public double getprice()
	{	
		return this.price;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	public String gettitle()
	{			
		return this.title;
	}
	public void settitle(String title)
	{
		this.title=title;
	}
	
	//methods
	public void saleCopy(int qnty)
	{
		System.out.println("Total Publication sale");
	}	
	
}
//child class 1
class Book extends Publication  
{
	//declaring private data members
	private String Author;
	
	//get set methods
	public String getauthor() 
	{
		return this.Author;
	}
	public void setauthor (String Author) 
	{
		this.Author=Author;
	}
	
	//methods
	public void getbookdetails()
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the details of these books: ");
			System.out.println("Title: ");
			String title=sc.next();
			this.settitle(title);
			
			System.out.println("Author: ");
			String author=sc.next();
			this.setauthor(author);
			
			System.out.println("Price: ");
			int price=sc.nextInt();
			this.setprice(price);
			
			System.out.println("Copies: ");
			int copies=sc.nextInt();
			this.setcopies(copies);	
		
	}

	//display function		
		public void displaybook()
		{	
			System.out.print((String)(this.gettitle()+"\t\t"+this.getauthor()+"\t\t"+this.getprice()+"\t\t"+this.getcopies()+"\n"));
		}
	public void ordercopies(int ordercopies)
	{
		setcopies(getcopies() + ordercopies );
		
	}
	//polymorphism
	public void saleCopy(int qnty)
	{
		//int qnty= ordercopies (newcopies)
		System.out.println("Total Book sale is: $"+(qnty*getprice()));
	}
	//hardcoded no of copies
	public void saleCopy()
	{
		//int qnty= ordercopies (newcopies)
		System.out.println("Total Book sale is: $"+(10*getprice()));
	}
}
//child class 2
class Magazine extends Publication   
{
	//declaring private data members
	private int orderQnty;
	private String currentIssue;
	
	//get set methods
	public String getcurrentIssue() 
	{
		return this.currentIssue;
	}
	public void setcurrentIssue (String currentIssue) 
	{
		this.currentIssue=currentIssue;
	}
	public int getorderQnty() 
	{
		return this.orderQnty;
	}
	public void setorderQnty (int orderQnty) 
	{
		this.orderQnty=orderQnty;
	}
	
	//methods
	public void getmagdetails()
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the details of these magazines: ");
			
			System.out.println("Title: ");
			String title=sc.next();
			this.settitle(title);
			
			System.out.println("Current Issue: ");
			String currentIssue=sc.next();
			this.setcurrentIssue(currentIssue);
			
			System.out.println("Price: ");
			int price=sc.nextInt();
			this.setprice(price);
			
			System.out.println("Copies: ");
			int copies=sc.nextInt();
			this.setcopies(copies);
					
		
	}
	//polymorphism
	public void saleCopy(int qnty)
	{
		//int qnty= ordercopies (newcopies)
		System.out.println("Total Magazine sale is: $"+(qnty*getprice()));
	}
	//hardcoded no of copies
	public void saleCopy()
	{
		//int qnty= ordercopies (newcopies)
		System.out.println("Total Magazine sale is: $"+(10*getprice()));
	}

	//display function		
			public void displaymag()
			{	
				System.out.print((String)(this.gettitle()+"\t\t"+this.getcurrentIssue()+"\t\t\t\t"+this.getprice()+"\t\t"+this.getcopies()+"\t\t"));
				System.out.print("\n");
								
			}
}
//main class
public class Polymorphism_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of books in the store");
		int oldbooks=sc.nextInt();
		Book bookarray[]=new Book[oldbooks];   //object array of BOOK class
		for(int i=0; i<oldbooks ; i++)
		{
			bookarray[i]=new Book();
			bookarray[i].getbookdetails();
		}
		
		if(oldbooks>0)
		{
		System.out.println("The books in the store are: ");
		System.out.println("Title\t\tAuthor\t\tPrice\t\tCopies");
		}
		for(int i=0;i<oldbooks;i++)
		{
			bookarray[i].displaybook();
		}
		System.out.println("Enter the no. of magazines in the store");
		int oldmag=sc.nextInt();
		Magazine magarray[]=new Magazine[oldmag];   //object array of MAGAZINE class
		for(int i=0; i<oldmag ; i++)
		{
			magarray[i]=new Magazine();
			magarray[i].getmagdetails();
		}
		
		if(oldmag>0)
		{
		System.out.println("The magazines in the store are: ");
		System.out.println("Title\t\tCurrentIssue\t\t\tPrice\t\tCopies");
		}
		for(int i=0;i<oldmag;i++)
		{
			magarray[i].displaymag();
		}
	
		//transactions in menu driven program
		int temp=1;
		while(temp!=0)
		{
			System.out.println("Transactions: ");
			int choice;
			System.out.println("Enter your choice of transaction according to the following menu: ");
			System.out.println("1. Order new books");
			System.out.println("2. Order new magazines");
			System.out.println("3. Sale of books for the day ");
			System.out.println("4. Sale of magazines for the day ");
			System.out.println("5. Stock at the end of the day ");
			System.out.print("Your choice:  ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: 
			{
				System.out.print("How many new books do you want to order? ");
				int newbooks= sc.nextInt();
				Book newbookarr[]= new Book[oldbooks+newbooks];
				
				for(int i=0;i<oldbooks;i++)
				{
					newbookarr[i]=new Book();
					newbookarr[i]=bookarray[i];
				}
				for(int i=oldbooks;i<oldbooks+newbooks;i++)
				{
					newbookarr[i]=new Book();
					newbookarr[i].getbookdetails();
				}
				
				System.out.println("The books in the store now are: ");
				System.out.println("Title\t\tAuthor\t\tPrice\t\tCopies");
				bookarray=newbookarr;
				for(int i=0;i<oldbooks+newbooks;i++)
				{
					bookarray[i].displaybook();
				}
				break;
				
			}
			case 2:
			{
				System.out.print("How many new magazines do you want to order? ");
				int newmag= sc.nextInt();
				Magazine newmagarr[]= new Magazine[oldmag+newmag];
				
				for(int i=0;i<oldmag;i++)
				{
					newmagarr[i]=new Magazine();
					newmagarr[i]=magarray[i];
				}
				for(int i=oldmag;i<oldmag+newmag;i++)
				{
					newmagarr[i]=new Magazine();
					newmagarr[i].getmagdetails();
				}
				
				System.out.println("The magazines in the store now are: ");
				System.out.println("Title\t\tCurrentIssue\t\t\tPrice\t\tCopies");
				magarray=newmagarr;
				for(int i=0;i<oldmag+newmag;i++)
				{
					newmagarr[i].displaymag();
				}
				break;
			}
			case 3:
			{
				
				System.out.println("The current stock of books we have is: ");
				for(int i=0;i<bookarray.length;i++)
				{
					bookarray[i].displaybook();
				}
				System.out.println("Enter the name of the book you want to sell: ");
				String selltitle=sc.next();
				System.out.println("Enter the number of copies of the book you want to sell: ");
				int sellcopies=sc.nextInt();
				int flag=0;
				int index;
				
				for(int i=0; i<bookarray.length; i++)
				{
					
					if(selltitle.equals (bookarray[i].gettitle()))
					{
						flag=1;
						index=i;
						int c1=bookarray[index].getcopies();
						int finalcopies=c1-sellcopies;
						if(finalcopies<0)
						{
							System.out.println("There are not sufficient books available in the store for the sale.");
							break;
						}
						else
						{
							System.out.println("Now the stock of books in the store is: ");
							bookarray[index].setcopies(finalcopies);
							bookarray[index].displaybook();
						}							
					}
					
				}
				if(flag==0)
				{
					System.out.println("The entered book is not present in the store.");
				}	
				break;
			}
			case 4:
			{
				System.out.println("The current stock of magazines we have is: ");
				for(int i=0;i<magarray.length;i++)
				{
					magarray[i].displaymag();
				}
				System.out.println("Enter the name of the magazine you want to sell: ");
				String selltitle=sc.next();
				System.out.println("Enter the number of copies of the magazine you want to sell: ");
				int sellcopies=sc.nextInt();
				int flag=0;
				int index;
				for(int i=0; i<magarray.length; i++)
				{
					if(selltitle.equals(magarray[i].gettitle()))
					{
						flag=1;
						index=i;
						int c1=magarray[index].getcopies();
						int finalcopies=c1-sellcopies;
						if(finalcopies<0)
						{
							System.out.println("There are not sufficient magazines available in the store for the sale.");
							break;
						}
						else
						{
							System.out.println("Now the stock of magazines in the store is: ");
							magarray[index].setcopies(finalcopies);
							magarray[index].displaymag();
						}
					}
					
				}
				if(flag==0)
				{
					System.out.println("The entered magazine is not present in the store.");
				}				
				break;
			}
			case 5:
			{
				System.out.println("Stock of books and magazines in the store is: ");
				for(int i=0;i<bookarray.length;i++)
				{
					bookarray[i].displaybook();
					
				}
				for(int i=0;i<magarray.length;i++)
				{
					magarray[i].displaymag();
					
				}
				break;
			}
			default:System.out.println("Invalid input ");
			}
			System.out.println("Enter 0 to stop. Anything else to continue");
			temp=sc.nextInt();
		}
		System.out.println("Thank you! ");
		sc.close();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		