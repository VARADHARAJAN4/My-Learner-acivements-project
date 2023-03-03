package controlstructure;

import java.util.Scanner;

public class switchstatement {
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Hospital");
		Scanner ss=new Scanner(System.in);
		System.out.println("What is your Problem?");
		byte wardnum;
		wardnum=ss.nextByte();
		
		
		switch (wardnum) {
		default:
			System.out.println("other care");
			break;
		case (2): 
		{
			System.out.println("Eye care");
			break;
		}
		case-3: 
		{
			System.out.println("Dentel care");
			break;
		}
		case 4,5: 
		{
			System.out.println("OP care");
			break;
		}
//		case 5: 
//		{
//			System.out.println("Skin care");
//			break;
//		}
		case 1: 
		{
			System.out.println("Child care");
			break;
		}
		}
	}

}
