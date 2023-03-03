package java8features;
interface display
{
	String name();
}
public class oneple {

	public static void main(String[] args) {
		display d=()->{return "Sankat";};
		//System.out.println(d.name("Sankat"));
		System.out.println(d.name());
	}

}
