package OOPS;

public class Customer {
	private String name;
	private Bank bank ; //Has-A relationship - Aggregation implementaion
	public Customer(String name, Bank bank) {
		this.name = name;
		this.bank = bank;
	}
	public void showCustomerDetails() {
		System.out.println("Customer Name: " + name);
		System.out.println("Bank Name: " + bank.getBankName());
		System.out.println("Interest Rate: " + bank.getInterestRate());
		System.out.println("--------------------------------------");
	}
}
