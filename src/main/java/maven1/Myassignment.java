package maven1;

public class Myassignment {
	static int a=5;
	static int b=10;
	static int c =0;
	
	public static void main(String[] args) {
	     c=a*b;
		System.out.println("Multiplication="+c); //50
		 System.out.println(b);//10
		 Variable1 ma= new Variable1();//alise
	      ma.method1();
	      System.out.println(c);
	      
	      int i = 0;
	      while (i < 15) {
	        System.out.println(i);
	        i++;
	      }
	      
	      int z =6;
	      //int x = z/2;
	      switch(z/2) {
	      case 1:
	    	  System.out.println("Sunday");
	        break;
	      case 2:
	    	  System.out.println("Monday");
	        break;
	      case 3:
	    	  System.out.println("tue");
		        break;
	      case 4:
	    	  System.out.println("Wen");
		        break;
	      case 5:
	    	  System.out.println("Thur");
		        break;
	      case 6:
	    	  System.out.println("Friday");
		        break;
	      case 7:
	    	  System.out.println("Sat");
		        break;
	      default:
	        // code block
	    }
		
	}
	
	public void  method1() {
		System.out.println(c);
		
	}

}
