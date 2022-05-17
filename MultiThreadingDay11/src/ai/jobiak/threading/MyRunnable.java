package ai.jobiak.threading;

public class MyRunnable implements Runnable{
	public void run()
	{
	
		for(int i=0;i<500;i++)
		{
			System.out.println(Thread.currentThread().getName()+"entered run()");
		}
	}
	

}
