package java8features;

			//ArrayList, Lambda exp, ForEach,Method reference, Stream API, limit,sorted,filter......
import java.util.ArrayList;

public class allinonej8feature {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Nikita");
		al.add("Rutuja");
		al.add("Sankat");
		al.add("Sapana");
		al.add("Siddhant");
		al.add("Sakshee");
		al.add("Girija");
		al.add("Pratik");
		al.add("Kshitij");
		al.add("Abijeet");
		al.add("Karuna");
		al.add("Tushar");
		al.add("Namrata");
		al.add("Aditi");
		al.add("Prachi");
		al.add("Gajanan");
		al.add("Adnan");
		al.add("Madhura");
		al.add("Shraddha");
		al.add("Adithya");
		al.add("Vaishnavi");
		al.add("Sejal");
		al.add("Saurab");
		al.add("Sejal");
		al.add("Saurab");
		//Stream.of(al);//one of the creation method of stream process
		al.stream()//Created stream //Stream
		//.filter(f->f.startsWith("S"))//filter method with LE
		//.limit(1)
		.distinct()//no duplication
		.sorted()
		.forEach(System.out::println);//forEach method with method reference 
	}
}
