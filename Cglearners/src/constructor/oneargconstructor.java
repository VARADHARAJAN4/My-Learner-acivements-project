package constructor;

public class oneargconstructor {
	public oneargconstructor(int a) //one parameter constructor
	{
		System.out.println("im a one arg constructor:"+a);
	
	}
	public oneargconstructor(float b) //one parameter constructor
	{
		System.out.println("im a one arg constructor:"+b);
	
	}
	public oneargconstructor(float b, int a) //one parameter constructor
	{
		System.out.println("im a one arg constructor:"+b+"   "+a);
	
	}

	public static void main(String[] args) 
	{
		oneargconstructor onec1=new oneargconstructor(34);
		oneargconstructor onec2=new oneargconstructor(45.4f);
		oneargconstructor onec3=new oneargconstructor(5.4f,6);



	}

}
