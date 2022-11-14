package studentManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		//paid fees
		double paid1=20000;
		double paid2=36000;
		double paid3=75000;
		double paid4=23000;
//these variables taken as total fees
		double a=70000;
		double b=60000;
		double c=75000;
		double d=50000;
		//we have created for student details
	List<String> list=new ArrayList<String>();  
	list.add("Student Details List:-"); 
	list.add("ID:1");  
	list.add("Student Name:Nikitha Gaikwad");  
	list.add("Fathername:Arun Kumar");  
	list.add("Mothername:Sunitha");
	list.add("course:CSE");
	list.add("Total fee="+a+"/-"); 
	list.add("Paid:"+(a-paid1)+"/-"); 
	list.add("Balance:"+paid1+"/-"); 


	list.add("ID:2");  
	list.add("Student Name:Ajay");  
	list.add("Fathername:varun Kumar");  
	list.add("Mothername:Uma"); 
	list.add("course:CSE");
	list.add("Total fee="+b+"/-"); 
	list.add("Paid:"+(b-paid2)+"/-"); 
	list.add("Balance:"+paid2+"/-");

	list.add("ID:3"); 
	list.add("Student Name:Sudha Sri");  
	list.add("Fathername:Veerabadra Rao");  
	list.add("Mothername:Vijaya Lakshmi");
	list.add("course:CSE");
	list.add("Total fee="+c+"/-"); 
	list.add("Paid:"+(c-paid3)+"/-"); 
	list.add("Balance:"+paid3+"/-");


	list.add("ID:4"); 
	list.add("Student Name:Jyothi");  
	list.add("Fathername:koteswar rao");  
	list.add("Mothername:jayashree"); 
	list.add("course:CSE");
	list.add("Total fee="+d+"/-"); 
	list.add("Paid:"+(d-paid4)+"/-"); 
	list.add("Balance:"+paid4+"/-");


	list.add("ID:5"); 
	list.add("Student Name:Hema");  
	list.add("Fathername:Naidu");  
	list.add("Mothername:Padma"); 
	list.add("course:CSE");
	list.add("Total fee="+b+"/-"); 
	list.add("Paid:"+(b-paid2)+"/-"); 
	list.add("Balance:"+paid2+"/-");


	list.add("ID:6"); 
	list.add("Student Name:Nikitha Kumar");  
	list.add("Fathername:kailash kumar");  
	list.add("Mothername:Vani"); 
	list.add("course:CSE");
	list.add("Total fee="+a+"/-"); 
	list.add("Paid:"+(a-paid1)+"/-"); 
	list.add("Balance:"+paid1+"/-");

	//If i want to get another branch 
	//list.add("ID:7");  
	//list.add("Student Name:Anil");  
	//list.add("Fathername:Ganesh Kumar");  
	//list.add("Mothername:Usha"); 
	//list.add("course:MECH");
	//list.add("Total fee="+d+"/-"); 
	//list.add("Paid:"+(d-paid4)+"/-"); 
	//list.add("Balance:"+paid4+"/-");
	for(String students:list)  
		  System.out.println(students);
	}
		

}