package Threadconcept;

import java.util.ArrayList;

public class threadnew {
	public static void main(String[] args) throws InterruptedException
	{
		Thread t=new Thread();
		System.out.println(t.getState());
		System.out.println(t.getName());
		System.out.println(t.getId());
		t.start();
		System.out.println(t.getState());
		t.run();
		System.out.println(t.getState());
		System.out.println(t.isAlive());
		System.out.println(t.getPriority());
		System.out.println(t.getState());
		t.join();
		System.out.println(t.getState());
		System.out.println(t.isAlive());
	}
}
