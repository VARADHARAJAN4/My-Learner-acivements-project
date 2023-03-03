package Threadconcept;

public class threadcreate extends Thread {
	
public void run()
{
	System.out.println("The thread");
}
	public static void main(String[] args) 
	{
		Thread t=new Thread();
		System.out.println(t.getState());
		t.start();
		System.out.println(t.getState());
		System.out.println("The thread is ALive:"+t.isAlive());
		System.out.println("The name of the thread: "+t.getName());
		System.out.println("The id of the thread: "+t.getId());
		System.out.println("The priority of the thread: "+t.getPriority());
		t.run();
		System.out.println(t.getState());



	}

}
