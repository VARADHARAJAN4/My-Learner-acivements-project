package constructor;


class abc
{
	int a, b;
	int add(int a,int b)//normal method
	{
		return a+b;
	}
}

public class construct {
	public static void main(String[] args) 
	{
		abc aa=new abc();//default constructor
		int x=aa.add(34, 44);
		System.out.println(x);
	}
}
