package miit;

class Numprinter extends Thread {
	int start;
	int end;

	Numprinter(int start, int end) {
		this.start = start;
		this.end = end;

	}
	public void run() {
		for(int i=start;i<=end;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is "+i);
		}
		
	}
}

public class SimontaniousNumPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numprinter n1 = new Numprinter(1,5);
		Numprinter n2 = new Numprinter(6,10);
		n1.start();
		n2.start();
		
	}

}
