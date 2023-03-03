package java8features;
interface adding//functional interface -must be at most one abstract method
{
	int add(int a,int b);//abstract method
	//int xxx(int x,int y);
}
public class withle 
{

	public static void main(String[] args) 
	{
		adding ad=(a,b)->(a+b);//Lambda Expression
		System.out.println("The added value: "+ad.add(23,50));
	}

}
