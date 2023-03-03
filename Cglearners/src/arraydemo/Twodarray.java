package arraydemo;


public class Twodarray {

	public void demo()
	{
		System.out.println("the demo process");
	}
	public static void main(String[] args)
	{
		Twodarray tt=new Twodarray();
		tt.demo();
		char c[][]= {	{'a','b','c'},//initialize to first row
						{'d','e','z'},
						{'f','g','d'}
						//{'h','i','y'}
					};
		for(int x=0;x<c.length;x++)//row (first []) we want to call the location)
		{
			for(int y=0;y<c.length;y++)//column (second []) we want to call the location)
			{
				System.out.print(c[x][y]+"   ");//calling one by one
			}
			System.out.println();//making row by row
		}
	}

}
