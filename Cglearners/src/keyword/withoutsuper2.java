package keyword;
class Manager2
{
	static float salary=125000.00f;
	void display()
	{
		System.out.println("The Manager salary: "+salary);
	}
}
class Developer2 extends Manager2//single inheritance 
{
	float salary=45000.00f;
	void display()
	{
		System.out.println("The Developer Salary: "+salary);
		System.out.println("The Manager salary: "+Manager2.salary);
	}
}
public class withoutsuper2 {
		
		public static void main(String[] args) 
		{
			Developer2 d=new Developer2();
			d.display();
		}
	}

