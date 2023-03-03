package keyword;
class Manager1
{
	float salary=125000.00f;
	void display()
	{
		System.out.println("The Manager salary: "+salary);
	}
}
class Developer1 extends Manager1//single inheritance 
{
	float salary=45000.00f;
	void display()
	{
		System.out.println("The Developer Salary: "+salary);
		System.out.println("The Manager salary: "+super.salary);
	}
}
public class withsuper 
{
	public static void main(String[] args) 
	{
		Developer1 d=new Developer1();
		d.display();
	}
}
