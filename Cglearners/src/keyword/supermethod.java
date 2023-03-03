package keyword;
class Manager4
{
	float salary=125000.00f;
	void display()
	{
		System.out.println("The Manager salary: "+salary);
	}
	public Manager4() {
		System.out.println("Im a Manager constructor");
	}
	public Manager4(int num) {
		//num=34;
		System.out.println("Im a Manager constructor: "+num);
	}
}
class Developer4 extends Manager4//single inheritance 
{
	float salary=45000.00f;
		
	void display()
	{
		System.out.println("The Developer Salary: "+salary);
		super.display();
	}
	public Developer4() 
	{
		super(34);
		System.out.println("Im a developer constructor");
	}
	
	
}
public class supermethod {
		
		public static void main(String[] args) 
		{
			Developer4 d=new Developer4();
			
			//d.display();
		}
	}

