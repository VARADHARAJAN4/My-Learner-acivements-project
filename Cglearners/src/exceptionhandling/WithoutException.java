package exceptionhandling;

import java.util.Scanner;

public class WithoutException {
	public static void main(String[] args) 
	{
		int a,b;
		System.out.println("Welcome learners Multiple two number");
		System.out.println("Enter the Value1:");
		Scanner ss=new Scanner(System.in);
		a=ss.nextInt();
		System.out.println("Enter the Value2:");
		b=ss.nextInt();
		if(b==0)
		{
			System.out.println("The not predict the result");
		}
		else
		{
				System.out.println("the Result is: "+(a/b));
		}
	}
}
