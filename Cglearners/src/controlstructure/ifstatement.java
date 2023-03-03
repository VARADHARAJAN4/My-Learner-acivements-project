package controlstructure;

import java.util.Scanner;

public class ifstatement {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Time:  ");
		float time=scan.nextFloat();
		if(true)
		{
		if (time>=0.1 && time<=11.59) //if - keyword, ()->condition or boolean value if statement is mandatory 
		{
			System.out.println("Good Morning");
		}
		 else if(time>=12 && time<=15.59) //optional
		 {
			 System.out.println("Good Noon");
		}
		 else if(time>=16 && time<=19.59)//optional
		 {
			 System.out.println("Good Evening");
		 }
		 else if (time>=18 && time<23.59)//optional
		 {
			 System.out.println("Good Night");
		 }	
		 else {//else - keyword, logical point of view mandatory, compiler point of view optional 
			 System.out.println("You entered ilegal time");
				 
			 }
		}
	}
	}