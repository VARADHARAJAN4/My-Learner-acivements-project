package java8features;
@FunctionalInterface   //optional 
interface Funcinter//functional interface
{
	void greeeting();//one abstract method
	//void greeting2();
	//void greating1();
}
interface marker//no (body)implementation 
{
	
}
interface normalinterface //normal interface
{
	int process();
	float details();
}
public abstract class withfunctionalinterface implements Funcinter{

	public static void main(String[] args) 
	{
		Funcinter wf=()->System.out.println("Welcome to my dear learners");
		 wf.greeeting();
	}
}

