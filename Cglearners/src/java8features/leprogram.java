package java8features;

import java.util.ArrayList;
import java.util.List;

public class leprogram {
	  
	  public static void main(String[] args) {
	    List<String> list = new ArrayList<>();
	        list.add("RAM");
	        list.add("VARAHA");
	        list.add("VAMANA");
	        list.add("NARASIMHA");
	        
	        list.forEach(value -> System.out.println(value));  
	    }
	}
