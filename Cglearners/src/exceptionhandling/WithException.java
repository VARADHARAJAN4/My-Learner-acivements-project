package exceptionhandling;

import java.util.Scanner;

public class WithException {

	public static void main(String[] args) 
	{
		try 
		{
			int a,b;
			System.out.println("Welcome learners Multiple two number");
			System.out.println("Enter the Value1:");
			Scanner ss=new Scanner(System.in);
			a=ss.nextInt();
			System.out.println("Enter the Value2:");
			b=ss.nextInt();
					System.out.println("the Result is: "+(a/b));
		} 
		catch (Exception e) 
		{
			System.out.println("You may be entered illegal value");
		}	
	}

	}
