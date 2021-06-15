import java.util.*;


//interface
/*interface A
{
	void print();
	int prrint();
	
}
class AB implements A
{
	public void print()
	{
		System.out.println("snckj");
	}
	public int prrint()
	{
		return 3;
	}
}*/
class Convertsec	
{
	private int sec,min,hr;
	
	Convertsec(int sec)
	{
		this.sec=sec;
		this.min=0;
		this.hr=0;
	}
	public void convert(int sec)
	{
		this.hr=this.sec/3600;
		this.sec=
		
		this.min=this.sec/60;
		
	}
}
public class MockPractise {

	public static void main(String[] args) {
		/*AB a=new AB();
		a.print();
		a.prrint();*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter seconds");
		int sec=sc.nextInt();
		Convertsec c=new Convertsec(sec);
		
		
		
		

	}

}
