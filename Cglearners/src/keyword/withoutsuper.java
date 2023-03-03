package keyword;
class Manager
{
	float salary=125000.00f;
	void display()
	{
		System.out.println("The Manager salary: "+salary);
	}
}
class Developer extends Manager//single inheritance 
{
	float salary=45000.00f;
	void display()
	{
		System.out.println("The Developer Salary: "+salary);
		System.out.println("The Manager salary: "+salary);
	}
}
public class withoutsuper {
		
		public static void main(String[] args) 
		{
			Developer d=new Developer();
			d.display();
		}
	}

