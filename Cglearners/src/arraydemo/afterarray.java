package arraydemo;

public class afterarray {
	//After the array concept

	public static void main(String[] args) 
	{
		//one dimensional array
		int regnumber[] = {101,102,103,104,105,106,107,108,109,110};
		/*regnumber[0]=101,ren[1]=102......regnumber[9]=110*/
		int regnumber1[];
		regnumber1=regnumber.clone();//cloning or copying the array	
		for(int i=0;i<regnumber.length;i++)
		{
			System.out.println("Registernumber first"+i+":"+regnumber[i]);
		}
		System.out.println("6th Regnumber: "+regnumber[9]);
		for(int i=0;i<regnumber1.length;i++)
		{
			System.out.println("Registernumber"+i+":"+regnumber1[i]);
		}
		
		System.out.println("6th Regnumber: "+regnumber1[9]);
	}

}
