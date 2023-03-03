package String_stringbuffer;
public class Stringdemo {
	public static void main(String[] args) 
	{
		String st=" Sapana";
		String st1=" shinde";
		System.out.println("The Name:"+st);
		st=st.toUpperCase();
		System.out.println("the uppercase: "+st);
		st=st.toLowerCase();
		System.out.println("the Lowercase: "+st);
		st=st.concat(st1);
		System.out.println("the concat: "+st);
		st=st.repeat(7);
		System.out.println("the repeat: "+st);
		st=st1.trim();
		System.out.println("the trim: "+st);
		st=st.intern();
		System.out.println("the intern: "+st1);

	}
}