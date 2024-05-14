package maven1;

public class SvP {

	static void mymethodstatic()
    {
    	System.out.println("static method can be called without creating object");

	}
	public void mymethodpublic()
	{
		System.out.println("public method must be called by creating object");
		
	}
	
	

      public static void main(String[] args)
      {
    	  mymethodstatic();
    	  
    	 SvP s1 = new SvP();
    	 s1.mymethodpublic();
  	  
    	  
    	  
    	  
    	  
      }

}