package Basicprogram;

import java.util.Scanner;

public class operatordemo {

	public static void main(String[] args) 
	{
		int a,b,c;
	Scanner ss=new Scanner(System.in);
	System.out.println("enter The First number: ");
	a=ss.nextInt();
	System.out.println("enter The Second number: ");

	b=ss.nextInt();
	System.out.println("The increment operation:  "+(a++));//first print the a value and increment reflect in next statement
	System.out.println("The increment operation:  "+(a));
	System.out.println("The decrement operation:  "+(--a));//First decrement and update the value in same statement
	System.out.println("The decrement operation:  "+(a--));//first print the a value and decrement reflect in next statement
	System.out.println("The decrement operation:  "+(a));//updated value
	System.out.println("The Addition operation:  "+(a+b));//add value
	System.out.println("The Subtraction operation:  "+(a-b));//sub value
	System.out.println("The Multi operation:  "+(a*b));//multiplication value
	System.out.println("The div operation:  "+(a/b));//divide value
	System.out.println("The Modulo operation:  "+(a%b));//modulo value
	System.out.println("The Right shift operation:  "+(a>>1));//right shift value
	System.out.println("The left shift operation:  "+(a<<1));//left shift value
	System.out.println("The unsignedRight shift operation:  "+(a>>>1));//right shift value
	System.out.println("The unsignedleft shift operation:  "+(a<<1));//left shift value
	System.out.println("The == operation:  "+(a==12));//comparison operator value








	

	}

}
