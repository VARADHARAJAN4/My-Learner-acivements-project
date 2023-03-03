package keyword;

class student
{
	int regnumber;
	String name;
	student(int rnumber, String Sname)
	{
		this.regnumber=rnumber;//this keyword calling present object or member data
		this.name=Sname;
	}
	void display()
	{
		System.out.println("The Regnumber: "+regnumber);
		System.out.println("The Student name: "+name);
	}
}
public class thiskeyword 
{

	public static void main(String[] args) {
		student s=new student(23, "Madhura");
		s.display();
	}

}
