package OOPS;

public class TestBank {

	public static void main(String[] args) {
		Bank b1 = new SBI();
		Bank b2 = new ICIC();
		
//		System.out.println("SBI Interest Rate: "+ b1.getInterestRate());
//		System.out.println("ICICI Interest Rate: "+b2.getInterestRate());
		
		Customer c1 = new Customer("Amit" , b1);
		Customer c2 = new Customer("Neha", b2);
		
		c1.showCustomerDetails();
		c2.showCustomerDetails();

	}
}
