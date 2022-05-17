package ai.jobiak.threading;



public class MyThread extends Thread { //extends Thread class
	String name;
	
	public MyThread(String name) {
		super();
		this.name = name;
	}

	public void run()
	{
		for(int i=0;i<=1000;i++) {
		
			System.out.println(this.name+" entered run() : "+i);
			//Thread.yield();   //MyThread stops and gives a chance to main threadS
		}
			try {
				sleep(5000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		
	}

}
