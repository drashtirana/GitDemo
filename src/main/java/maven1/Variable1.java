package maven1;

public class Variable1 {
      int a=5;
      static int c=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int b=10;
      System.out.println(b);//10
      Variable1 nv= new Variable1();//alise
      nv.method1();
      System.out.println("Hello from 1st Class"+c);
	}
	public void method1() {
		System.out.println(a);//5
		System.out.println(c);//20
		System.out.println("Hello from 1st Class");
	}

}

