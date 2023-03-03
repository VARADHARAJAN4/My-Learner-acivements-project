package constructor;

import java.util.Scanner;

public class Student {
	int streg=123;
	String stname="sankat";
	
 String examresult(int mark)//one argument method
	{
		if(mark>50)
			return("Pass");
		else {
			return ("Fail");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);//one argument predefined constructor
		String result;
		System.out.println("enter your marks: ");
		int marks=ss.nextInt();
		Student stu=new Student();//Default constructor - there is no arguments in a constructor
		result=stu.examresult(marks);
		System.out.println("The Exam result: "+result);
	}

}
