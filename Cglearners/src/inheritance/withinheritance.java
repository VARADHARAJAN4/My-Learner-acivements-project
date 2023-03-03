package inheritance;
				//After INHERITANCE
// reusability
//Less memory space required
//Good time complexity 
//Developer  interested to develop this kinds of approach

class aa //base class
{
	void run()
	{
		System.out.println("First class");
	}
}
class bb extends aa //derived class
{
	void execute()
	{
		System.out.println("The second class");
	}
}
public class withinheritance {

	public static void main(String[] args)
	{
		bb b1=new bb();
		b1.execute();//b class method
		b1.run();//a class method

	}

}
