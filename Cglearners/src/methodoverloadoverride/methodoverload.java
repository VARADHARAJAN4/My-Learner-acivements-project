package methodoverloadoverride;

public class methodoverload 
{
	int process(int x,int y)//Two different type of param in a method
	{
		System.out.println("The Adding values: "+(x+y));
		return x+y;
	}
	void process(String x, String y)//Two different type of param in a method
	{
		System.out.println("The Concatination values: "+(x+y));

	}

	public static void main(String[] args) {
		methodoverload mo=new methodoverload();
		mo.process("sdf", "fsd");
		mo.process(67, 34);
	}

}
