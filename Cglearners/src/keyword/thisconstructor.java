package keyword;

import java.util.concurrent.atomic.AtomicBoolean;

class learner
{
	public learner() {
		System.out.println("The learner Details");// TODO Auto-generated constructor stub
	}
	learner(int age)
	{
		this();
		System.out.println("the Age:"+age);
		//this();
	}
}

public class thisconstructor {

	public static void main(String[] args) 
	{
		learner l=new learner(21);//calling one parameter constructor 
	}

}
