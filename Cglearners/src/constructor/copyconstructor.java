package constructor;

public class copyconstructor 
{
	String name;
	int regnum;
	public copyconstructor(String cpname, int cpnum) //two parameter constructor
	{
		this.name=cpname;//this is a keyword we can call the present variable and methods
		this.regnum=cpnum;
	}
	public copyconstructor(copyconstructor copy)//copy constructor
	{
		this.name=copy.name;
		this.regnum=copy.regnum;
	}
	public void display()//method
	{
		System.out.println("The values:"+name + regnum);
	}
	
	public static void main(String[] args) 
	{
		copyconstructor cc=new copyconstructor("Ziya",101);
		cc.display();
		cc.display();
		cc.display();
		cc.display();

	}

}
