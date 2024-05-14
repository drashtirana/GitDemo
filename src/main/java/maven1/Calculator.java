 package maven1;

public class Calculator {

	public static void main(String[] args) {
		
	
		      Calculator object1= new Calculator();
		     object1 .addition(5, 5);
		      object1 .substraction(5, 5);
		      object1 .multiplication(5, 5);
			object1 .division(5, 5);
			}
			
			public static int  addition(int a,int b) {
				int result=a+b;
				System.out.println("adition"+result);
				return result;
				
			}
			public  static int substraction(int a,int b) {
				int result=a-b;
				System.out.println("substraction"+result);
				return result;
			}
			
			public static int multiplication(int a,int b) {
				int result=a*b;
				System.out.println("multiplication"+result);
				return result;
			}
			public  static int division(int a,int b) {
				int result=a/b;
				System.out.println("division"+result);
				return result;
				
			}

		

	

	}


