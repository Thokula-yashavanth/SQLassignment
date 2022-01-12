package javatraining;

public class  employee {
	
	public int empid;
	public String empname;
	public int empsal;
	private int salcal;
	
	
	public void salcal() {
		salcal= empsal-2000;
		System.out.println(salcal);
		
	}
	public class manager extends employee{
		
		public void salcal() {
			salcal= empsal-2000;
			System.out.println(salcal);
		}
	}
	public class developer extends employee{
		
		public void salcal() {
			salcal= empsal-2000;
			System.out.println(salcal);
		}
	}
	public class tester extends employee{
		
		public void salcal() {
			salcal= empsal-2000;
			System.out.println(salcal);
		}
	}
	public static void main(String[] args) {
		 employee emp = new employee();
		 tester tes=emp.new tester();
		 emp.empid=21507;
		 emp.empname="yashwanth";
		 emp.empsal=25000;
		 emp.salcal();
		 emp.display();
	}
		 
		 public void display() 
{
				
System.out.println(empid);
System.out.println(empname);
System.out.println(empsal);
		 
		
	}

}
