package Collections;

import java.util.Vector;

public class vectorconcept {

	public static void main(String[] args) {
		Vector<Float> vv=new Vector<>();
		vv.add(53500.00f);
		vv.add(3500.00f);
		vv.add(3500.00f);
		vv.add(45500.00f);
		vv.add(10000.00f);
		vv.add(2345.567f);
		System.out.println("The Salary values: " + vv);
		System.out.println("The Size of the vector: " + vv.size());
		System.out.println("The Capacity of the vector: " + vv.capacity());
		System.out.println("The hashcode of the vector: " + vv.hashCode());
		System.out.println("The Size of the vector: " + vv.remove(2));
		System.out.println("The after removed Salary values: " + vv);
		 vv.removeAllElements();
			System.out.println("The after removed Salary values: " + vv);

		



		
	}

}
