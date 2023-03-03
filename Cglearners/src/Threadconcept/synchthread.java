package Threadconcept;//package concept

class synch//1.class
{
	synchronized void method()//created the resource//2.synchronized method
	{
		Thread t=Thread.currentThread();//3.current thread
		for(int i=0;i<=10;i++)//for loop
		{
			System.out.println("The Thread: "+t.getState()+" -"+i);//output state
		}
	}
}
public class synchthread {
	public static void main(String[] args) 
	{
		final synch s=new synch();
		Thread t1=new Thread("Thread 1")
				{@Override
			public void run()
			{
				s.method();
			}
			};
			Thread t2=new Thread("Thread 2")
			{@Override
		public void run()
		{
			s.method();
		}
		};	
		t1.start();
		t2.start();
	}

}
