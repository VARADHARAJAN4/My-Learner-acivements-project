package inheritance;

import javax.print.attribute.standard.DialogOwner;

class Base1 //base class
{
	void run()
	{
		System.out.println("First class");
	}
}
class Base2 
{
	void run()
	{
		System.out.println("The second class");
	}
}
class Derived extends Base1 extends Base2//java doesn't support multiple inheritance
{
	void display()
	{
		System.out.println("Im derived");
	}
}
public class multipleinher {
	public static void main(String[] args) 
	{
			Derived d=new Derived();
			d.run();
			d.display();
	}

}
