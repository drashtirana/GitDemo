package maven1;

public class employee {
	
	int employeeid;
	String name;
	double salary;
	employee (int id,String empname,double empsalary){
	employeeid =id;
	name= empname;
	salary=empsalary;
}
	employee(int id,String empname){
	employeeid = id;
	name =empname;
	}
	
    void displayinfo() {
    	System.out.println(employeeid);
    	System.out.println(name);
    	System.out.println(salary);
    }
	
	

	public static void main(String[] args) {
		
		employee eo= new employee(2,"AB",1000.0);
		employee eo1= new employee(5,"XY",555.55);
		employee eo2= new employee(18,"VK");
	      eo.displayinfo();
	      eo1.displayinfo();
	      eo2.displayinfo();
	
	}

}
