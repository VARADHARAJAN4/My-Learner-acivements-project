package inheritance;

//abstract class, Achieve Multiple inheritance concept indirectly, interface, implements and extends keyword and 
interface animal1									//interface
{
	String name="hourse1";
	abstract void petanimal();
//	 void cat()
//	{
//		System.out.println("shfjksdf");
//	}
//	
}
interface animal2									//interface
{
	String name="hourse2";
	void wildanimal();
}

abstract class hourse implements animal1 , animal2	//abstract class
{
	public void petanimal()
	{
		System.out.println("Im a petanimal: "+animal1.name);
	}
	public void wildanimal()
	{
		System.out.println("Im a Wildanimal: "+animal2.name);
	}
}
public class interfacelogic extends hourse 			//concrete class
{

	public static void main(String[] args) 
	{
		interfacelogic il=new interfacelogic();
		il.petanimal();
		il.wildanimal();
		
	}

}
