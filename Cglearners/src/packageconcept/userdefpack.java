package packageconcept;
import Enum.*;
import arraydemo.Twodarray;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class userdefpack {
	String color="Blue", color2="Orange";
	void colorprocess()
	{
		System.out.println("The first color:"+color);
		System.out.println("The second color:"+color2);
	}
	public static void main(String[] args) 
	{
			Twodarray tt =new Twodarray();
			tt.demo();
			Scanner s=new Scanner(System.in);
			without_enum d=new without_enum();
			String ss=d.east; 
			System.out.println("The directions: "+ss);
//			up=new userdefpack();
//		up.colorprocess();
	}

}
