package encapsulation;

class encap
{
	private int pinnumber;

public void setpindetails(int hint)
{
	this.pinnumber=hint;
}
public int getpindetails()
{
return pinnumber;
}
}

public class encapsulationdemo {

	public static void main(String[] args) 
	{
		encap e=new encap();
		e.setpindetails(12);
		System.out.println(e.getpindetails());
	
	}

}
