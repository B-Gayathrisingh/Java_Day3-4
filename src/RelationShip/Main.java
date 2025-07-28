package RelationShip;

public class Main {

	public static void main(String[] args) {
//		Employee emp = new Employee("Alice", 30, "E101", "Software Engineer");
//		emp.displayEmployeeDetails();
		
		Address address = new Address("Chennai","Tamil Nadu");
		Employee1 emp = new Employee1("BOB", 35, "E202", "Manager",address);
		
		emp.displayEmployeeDetails();

	}
}
