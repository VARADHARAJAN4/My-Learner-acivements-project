package inheritance;
interface oldinterface//before java 8
{
	void Studetails();
}
interface newinterface//After Java 7 like 8,9,....current version
{
	default void newstudetails1()
	{
		System.out.println("Im a Java 8 interface with default");
	}
	static void newstudetails2()
	{
		System.out.println("Im a Java 8 interface with static");
	}
}
public class interfacedemo implements oldinterface,newinterface
{
		public static void main(String[] args) {
			interfacedemo id=new interfacedemo();
			id.Studetails();
			id.newstudetails1();
			newinterface.newstudetails2();//because static method
	}
	@Override
	public void Studetails() {
		System.out.println("Im a java 7 interface ");
	}

}
