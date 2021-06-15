//final Assignment 8 File handling
//
//Implement a program for maintaining a database of student records using Files.
//Student has Student_id,name, Roll_no, Class, marks and address. Display the data for few 
//students.
//1. Create Database
//2. Display Database 
//3. Delete Records
//4. Update Record
//5. Search Record
import java.io.*; //importing for File

//class for Student details
class Student {
	String id, name, rollno, cls, address,marks;
	
	//function to take details of the student
	public void setData(boolean exists) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (!exists) 
		{
			System.out.print("Enter id: ");
			this.id = br.readLine();
		
		System.out.print("Enter name: ");
		this.name = br.readLine();
		System.out.print("Enter rollno: ");
		this.rollno = br.readLine();
		System.out.print("Enter class: ");
		this.cls = br.readLine();
		System.out.print("Enter marks: ");
		this.marks =br.readLine();
		System.out.print("Enter address: ");
		this.address = br.readLine();
		}
	}
}

class FileOps {
	void writeFile() throws IOException {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("database.txt", true)));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of records: ");
		int n = Integer.parseInt(br.readLine());
		Student[] arr = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Record for student "+(i+1));
			arr[i] = new Student();
			arr[i].setData(false);
			pw.print(arr[i].id + " ");
			pw.print(arr[i].name + " ");
			pw.print(arr[i].rollno + " ");
			pw.print(arr[i].cls + " ");
			pw.print(arr[i].marks + " ");
			pw.println(arr[i].address);
		}
		pw.close();
	}
	//function to display the file contents
	void display() throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("database.txt"));
		System.out.println("Id\tName\tRollno\tClass\tMarks\tAddress");
		String name;
		boolean empty = true;
		while ((name = file.readLine()) != null) {
			String[] line = name.split(" ");
			for (String word : line)
				System.out.print(word + "\t");
			System.out.println();
			empty = false;
		}
		if (empty)
			System.out.println("No Records found.");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------");
		file.close();
	}
	//function to search a particular record
	void search() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1. Id\t2. Name\t3. Rollno\t4. Class\t5. Marks\t6. Address");
		System.out.print("Enter choice: ");
		int choice = Integer.parseInt(br.readLine());
		choice--;
		System.out.print("Enter search keyword: ");
		String key = br.readLine();
		BufferedReader file = new BufferedReader(new FileReader("database.txt"));
		String name;
		boolean found = false;
		while ((name = file.readLine()) != null) {
			String[] line = name.split(" ");
			if (key.equals(line[choice])) {
				System.out.println("Record found.");
				System.out.println("Id\tName\tRollno\tClass\tMarks\tAddress");
				for (String data : line)
					System.out.print(data + "\t");
				System.out.println();
				found = true;
			}
		}
		if (!found)
			System.out.println("No Record found.");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------");
		file.close();
	}
	//function to delete the complete file
	void delete() throws IOException {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("database.txt")));
		pw.close();
	}
	//function to modify a particular record
	void modify() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter id of student: ");
		String id = br.readLine();
		BufferedReader file = new BufferedReader(new FileReader("database.txt"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("database-migrate.txt")));
		String name;
		boolean found = false;
		while ((name = file.readLine()) != null) {
			String[] line = name.split(" ");
			if (id.equals(line[0])) {
				Student s = new Student();
				s.setData(true);
				pw.print(id + " ");
				pw.print(s.name + " ");
				pw.print(s.rollno + " ");
				pw.print(s.cls + " ");
				pw.print(s.marks + " ");
				pw.println(s.address);
				found = true;
				continue;
			}
			for (String data : line)
				pw.print(data + " ");
			pw.println();
		}
		if (!found)
			System.out.println("No record found.");
		pw.close();
		file.close();
		File oldFile = new File("database.txt");
		File newFile = new File("database-migrate.txt");
		oldFile.delete();
		newFile.renameTo(oldFile);
		System.out.println("Record is modified successfully.");
		File file3 = new File("database-migrate.txt");
		file3.createNewFile();
	}
	////function to delete a particular record
	void deleteRecord() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter id of student: ");
		String id = br.readLine();
		BufferedReader file1 = new BufferedReader(new FileReader("database.txt"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("database-migrate.txt")));
		String name;
		while ((name = file1.readLine()) != null) {
			String[] line = name.split(" ");
			if (id.equals(line[0]))
				continue;
			for (String data : line)
				pw.print(data + " ");
			pw.println();
		}
		pw.close();
		file1.close();
		File oldFile = new File("database.txt");
		File newFile = new File("database-migrate.txt");
		oldFile.delete();
		newFile.renameTo(oldFile);
		System.out.println("Record deleted successfully.");
		File file = new File("database-migrate.txt");
		file.createNewFile();
	}
}
//main class
public class FileHandling {

	public static void main(String[] args) {
		
		FileOps f = new FileOps();
		while (true) {
			try {
				System.out.println("1. Create database\n2. Display database \n3. Search database\n4. Modify database\n5. Delete Record\n6. Clear database\n7. Exit");
				System.out.print("Enter choice: ");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int choice = Integer.parseInt(br.readLine());
				switch (choice) {
				case 1:
					f.writeFile();
					break;

				case 2:
					f.display();
					break;

				case 3:
					f.search();
					break;

				case 4:
					f.modify();
					break;

				case 5:
					f.deleteRecord();
					break;

				case 6:
					f.delete();
					System.out.println("File cleared successfully.");
					break;

				case 7:
					return;

				default:
					System.out.println("Invalid choice.");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
