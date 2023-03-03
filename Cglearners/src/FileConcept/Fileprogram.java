package FileConcept;
import java.io.File;
import java.io.IOException;
public class Fileprogram 
{
	public static void main(String[] args) 
	{
		File f=new File("D:\\java programs\\demo for file\\ziya.txt");
		try 
		{
			if(f.createNewFile())
			{
				System.out.println("File created");
			}
			else {
				System.out.println("Not created");
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}