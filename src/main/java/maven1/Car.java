package maven1;

public class Car {
	
	private String model ;
	private String company;
	private int year;
	
	
	
	public String getcompany() {
	return company;
	}
	public String getmodel()
	{
		return model;
	}
	public int year()
	{
			return year;
	} 
	public void  setcompany(String company) 
	{
		this.company= company;
	}
	public void setmodel(String model)
	{
		this.model=model;
	}
	public void setyear(int year) 
	{
	 if
	 (year>0) {
		 this.year =year;
	 }
	 else
	 {
		 System.out.println("invalid year");
		 }
	 }
	 
	 public Car(String model,String company,int year) 
	 {
	 this.year =year;
	 this.model=model;
	 this.company= company;
	}
	}

