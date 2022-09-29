package Inheritance;

public class Console {

	public static void main(String[] args) {
		Employee a = new Employee();
		Customer b = new Customer();
		
		EmployeeManager x = new EmployeeManager();
		CustomerManger y = new CustomerManger();
		x.bestEmployee();
		y.add();
		a.age= 12;
		b.email="skfdlfs@gmail.com";
		
		
	}

}
