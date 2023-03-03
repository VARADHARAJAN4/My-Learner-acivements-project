package inheritance;

import javax.print.attribute.standard.Fidelity;

class Gfather1 //base class first level class
{
	void GFcharacter()
	{
		System.out.println("GFather Char: Self motivator");
	}
}
class Father1 extends Gfather1 //Second level class
{
	void Fcharacter()
	{
		System.out.println("Father char: Helping mindset");
	}
}

class Son1 extends Father1 //Third level class 
{
	void Scharacter()
	{
		System.out.println("Son char: Hardworking with smart presentation");
	}
}

class Daughter extends Father1
{
	void Dcharacter()
	{
		System.out.println("Daughter Char: Supportive");
	}
}
public class hibrinher {

	public static void main(String[] args) 
	{
		Gfather1 gf=new Gfather1();
		gf.GFcharacter();
		
		Father1 f1=new Father1();
		f1.Fcharacter();
		f1.GFcharacter();
		
		Son1 s1=new Son1();
		s1.Fcharacter();
		s1.Scharacter();
		s1.GFcharacter();
		
		Daughter d=new Daughter();
		d.GFcharacter();
		d.Fcharacter();
		d.Dcharacter();
		

	}

}
