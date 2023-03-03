package FileConcept;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//create one file and copy the data from exiting file
public class fileprocessing 
{
	public static void main(String[] args) 
	{
		System s;
		long w,e,e1,r,r1,r2,r3,rg,er,ger1,ger,ddd;
		File f=new File("D:\\java programs\\demo for file\\ziyaold.txt");//opening existing file
		try(FileInputStream fis=new FileInputStream(f))//catching the data
		{
			byte b[]=new byte[(int)f.length()];//calculate the length
			fis.read(b);//read the content
			File fout=new File("D:\\java programs\\demo for file\\ziyanew.txt");//destination file we must create
			try(FileOutputStream fos=new FileOutputStream(fout))//catch the data from there and ready to put into the file
			{
				fos.write(b);//writing the data from old file to new file
				fos.flush();//clean the buffered memory by using of flush method
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File data copied");
	}
}