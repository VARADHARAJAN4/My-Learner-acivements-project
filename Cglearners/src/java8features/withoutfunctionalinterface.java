package java8features;

public class withoutfunctionalinterface 
{
//	void greeting()
//	{
//		System.out.println("welcome to my dear learners");
//	}

	public static void main(String[] args) 
	{
		withoutfunctionalinterface wf=new withoutfunctionalinterface();
		wf=()->System.out.println("Welcome to my dear learners");
	}
}
