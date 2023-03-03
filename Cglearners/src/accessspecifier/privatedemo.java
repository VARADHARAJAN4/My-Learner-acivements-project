package accessspecifier;
class privatelocalclass
{
	//protected String name="Varadharajan";
	int pinnumber=1234;//it showing with a class
	//public String city="kanchipuram";//it showing anywhere 
	void process()
	{
		System.out.println(pinnumber);
	}
}
public class privatedemo 
{
	public static void main(String[] args) 
	{
		String name1="Varadharajan";
		String city1="kanchipuram";//it showing anywhere 
		privatelocalclass pc=new privatelocalclass();
		
		
		
		
	}

}
