package keyword;

class learners
{
	public learners() {
		this(23);//calling one parameterized constructor
		System.out.println("The learner Details");
	}
	learners(int age)
	{
		System.out.println("the Age:"+age);
		//this();
	}
}
public class thiskeyword1 {

	public static void main(String[] args) {
			learners ll=new learners();//default constructor
			
	}

}
