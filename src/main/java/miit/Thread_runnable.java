package miit;

class MyThread implements Runnable {
	public void run() {
		System.out.println("Thread is running");
		for(int i = 1;i<=10;i++) {
		System.out.println("i=" +i);
		}
		
	}
}

public class Thread_runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MyThread m1 = new  MyThread();
		 Thread t1= new Thread( m1);
		 System.out.println("Thread is starting");
		 t1.start();
		 
		 
	}

}
