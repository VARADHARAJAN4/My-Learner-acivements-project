package Basicprogram;

public class variabletypedemo
{
	int d;//instance variable
	static int s=23;//Static variable or class variable
	int add()
	{
		int x=12;//local variable
		x=x+1;
		s=33;
		d=44;
		return x;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//d=13;//instance variable not able to visible inside main method
		System.out.println("static value1:"+(s+s));
		s=33;//static variable visible throughout the class
		System.out.println("static value2:"+s);
		//x=33;//bcz, local variable the scope is inside method only
	}
}
