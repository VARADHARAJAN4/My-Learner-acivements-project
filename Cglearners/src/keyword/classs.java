package keyword;

public class classs
{
	int regnum;//declaring variable or data member
	String name;
	 classs()//formal Parameter
	{
		System.out.println("constructor");
	}
	   classs(int x)
	 {
		 this();//current class constructor
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			classs cc=new classs();
		
	}

}
