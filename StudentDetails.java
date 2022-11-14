package studentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		//Student details
		String sname;
		String fname;
		String mname;
		String sel;
Scanner sc=new Scanner(System.in);
System.out.println("Please enter your personal details:");
System.out.println("Enter your Fullname:");
sname=sc.next();

Scanner sc1=new Scanner(System.in);
System.out.println("Enter Your Fathername:");
fname=sc1.next();

Scanner sc2=new Scanner(System.in);
System.out.println("Enter Your Mothername:");
mname=sc2.next();

//student courses
Scanner sc3=new Scanner(System.in);
System.out.println("Select your course:");
System.out.println("1.CSE");
System.out.println("2.ECE");
System.out.println("3.IT");
System.out.println("4.Mech");
sel=sc3.next();

double paid1=20000;
double paid2=36000;
double paid3=75000;
double paid4=23000;

double a=70000;
double b=60000;
double c=75000;
double d=50000;
//to switch from one condition to another condition
switch(sel)
{
case "CSE":
	System.out.println("Total fee="+a+"/-");
	System.out.println("Paid:"+(a-paid1)+"/-");
	System.out.println("Balance:"+paid1+"/-");
	break;
case "ECE":
	System.out.println("Total fee="+b+"/-");
	System.out.println("Paid:"+(b-paid2)+"/-");
	System.out.println("Balance:"+paid2+"/-");
	break;
case "IT": 
	System.out.println("Total fee="+c+"/-");
	System.out.println("Paid:"+(paid3)+"/-");
	System.out.println("Balance:"+(c-paid3)+"/-");
break;	
case "Mech": 
	System.out.println("Total fee="+d+"/-");
	System.out.println("Paid:"+(d-paid4)+"/-");
	System.out.println("Balance:"+paid4+"/-");
	break;

default:
	System.out.println("Once check your course");
}
	}

}

