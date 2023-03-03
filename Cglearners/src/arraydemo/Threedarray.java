package arraydemo;
public class Threedarray {
		public static void main(String[] args)
		{
			char c[][][]= {	{	{'a','b','c'},//initialize to first table
								{'d','e','z'},
								{'f','g','d'},
								{'h','i','y'}
							},
							{	{'x','b','c'},//initialize to second table
								{'d','e','z'},
								{'f','g','d'},
								{'h','i','y'}
							},
							{	{'z','b','c'},//initialize to third table
								{'d','e','z'},
								{'f','g','d'},
								{'h','i','y'}
							}
		};
			for(int x=0;x<c.length;x++)//row (first []) we want to call the location)
			{
				for(int y=0;y<c.length;y++)//column (second []) we want to call the location)
				{
					for(int z=0;z<c.length;z++)//Table (Third [])calling number of tables
					{
					System.out.print(c[x][y][z]+"   ");//calling one by one
				}
				System.out.println();//making row by row
			}
				System.out.println();//making row by row
		}

	}
}
