package inheritance;

class book //base class 
{
	void concpet()
	{
		System.out.println("Java 8 features: LE,MR,FI...");
	}
}
class student1 extends book//Derived  class 1 
{
	void reading()
	{
		System.out.println("Student1: I read java 8 features");
	}
}

class student2 extends book //Derived  class 2
{
	void reading()
	{
		System.out.println("Student2 : I read java 8 features");
	}
}

public class hierainher {

	public static void main(String[] args) {
		student1 s1=new student1();
		s1.concpet();
		s1.reading();
	
		student2 s2=new student2();
		s2.concpet();
		s2.reading();
		}

}
