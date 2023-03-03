package methodoverloadoverride;

class base
{
	void show(int x,int y)
	{
		System.out.println("The Mul values: "+(x*y));
	}
	public base() {
		System.out.println("fdsgdfgf");
	}
}

class derived extends base
{
		derived() 
		{
	//	System.out.println("dsfsd");
		super();
		}
	void show(int x,int y)
	{
		System.out.println("The Add values: "+(x+y));
		super.show(23, 32);
	}
}
public class methodoverride {

	public static void main(String[] args) {
		derived d=new derived();
		d.show(23, 44);
	}
}
