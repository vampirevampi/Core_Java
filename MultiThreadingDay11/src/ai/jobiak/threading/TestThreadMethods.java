package ai.jobiak.threading;
import java.util.Scanner;

public class TestThreadMethods {

	public static void main(String[] args) {
		System.out.println("started main....");
		System.out.println(Thread.currentThread().getId()); // id of thread
		System.out.println(Thread.currentThread().getName()); // name of thread
		System.out.println(Thread.currentThread().getPriority()); //priority of thread
		System.out.println(Thread.currentThread().isAlive()); // say weather the thread is alive or not
		System.out.println(Thread.currentThread().getState()); // state of thread
		System.out.println(Thread.currentThread().isDaemon()); // determines the thread is daemon thread or not ...main thread can never be daemon
	    MyThread t1=new MyThread("T1");   //creating instance of the class
		MyThread t2=new MyThread("T2");
		t1.start();   // starting the thread
		t2.start();
		
		
		System.out.println(t1.getName()+" has "+t1.getPriority()); //name of tread along with priority
		try {
			Thread.sleep(5000);  // happens explicitly
		} catch (InterruptedException e) {
			
			e.printStackTrace(); // can make main thread sleep
		}
	
		Scanner sc =new Scanner(System.in); // thread is blocked for i/o...main thread got blocked // happens implicitly 
		    String line=sc.nextLine();
		   
		System.out.println("exiting main...."); 
		
		
		

	}

}
