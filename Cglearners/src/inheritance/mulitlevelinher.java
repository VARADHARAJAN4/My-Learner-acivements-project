package inheritance;
interface IGfather
{
	void abc();
}
class Gfather //base class first level class
{
	void GFcharacter()
	{
		System.out.println("GFather Char: Self motivator");
	}
	void GFcharacter1()
	{
		System.out.println("GFather Char: Self motivator");
	}
}
class Father extends Gfather //Second level class
{
	void Fcharacter()
	{
		System.out.println("Father char: Helping mindset");
	}
}

class Son extends Father //Third level class 
{
	void Scharacter()
	{
		System.out.println("Son char: Hardworking with smart presentation");
	}
}
public class mulitlevelinher {

	public static void main(String[] args) 
	{
		Son s=new Son();
		s.GFcharacter();
		s.Fcharacter();
		s.Scharacter();
		inter i=new inter();//no constructor
		
	}

}
