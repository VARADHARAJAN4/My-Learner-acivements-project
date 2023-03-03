package arraydemo;

import java.util.Scanner;
//one dimensional array
public class inputoarray {
	public static void main(String[] args)   
	{  
	int d;
	Scanner ss=new Scanner(System.in);  
	System.out.print("Enter the No of items: ");  
	d=ss.nextInt();  
	int[] inarray = new int[21];  
	System.out.println("Enter the elements of an array: ");  
	for(int i=0; i<d; i++)  
	{  
	inarray[i]=ss.nextInt();  
	}  
	System.out.println("Array elements are: ");  
	for (int i=0; i<d; i++)   
	{  
	System.out.println(inarray[i]);  
	}  
	}  
	}  
