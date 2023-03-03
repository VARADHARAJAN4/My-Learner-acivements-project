package inheritance;
					//Before INHERITANCE
//no reusability
//more memory space required
//time complexity problem
//Developer not interested to develop this kinds of approach

class a 
{
	void run()
	{
		System.out.println("First class");
	}
}
class b
{
	void execute()
	{
		System.out.println("The second class");
	}
}
public class withoutinheritance {

	public static void main(String[] args) 
	{
		a a1=new a();//two obj we created
		b b1=new b();
		a1.run();//separately we called the objects
		b1.execute();
	}

}
