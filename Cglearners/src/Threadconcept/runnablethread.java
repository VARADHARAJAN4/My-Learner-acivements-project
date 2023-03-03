package Threadconcept;

public class runnablethread implements Runnable
{

	public static void main(String[] args) 
	{
		runnablethread r=new runnablethread();
		r.run();
	}

	@Override
	public void run()
	{
		Thread tt=new Thread();
		Thread ss=new Thread();
		System.out.println(tt.getState());
		tt.start();
		tt.run();
		System.out.println("Before Yield:"+tt.getState());
		tt.yield();
		System.out.println("After Yield:"+tt.getState());
		System.out.println(ss.getState());
		ss.start();
		System.out.println(ss.getState());
		System.out.println(ss.getPriority());

		System.out.println(ss.NORM_PRIORITY);
		System.out.println(ss.getPriority());
		ss.setPriority(9);
		System.out.println(ss.getPriority());

		System.out.println("Im a runnable");
	}

}
