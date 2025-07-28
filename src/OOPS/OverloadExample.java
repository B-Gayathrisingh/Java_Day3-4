package OOPS;

public class OverloadExample {

	public static void main(String[] args) {
		ShippingService service = new ShippingService();
		
		System.out.println("Cost 1: " +  service.calculateShippingCost(2));
		System.out.println("Cost 2: " + service.calculateShippingCost(2, 10));
		System.out.println("Cost 3: " + service.calculateShippingCost(2, 10, true));

	}

}
