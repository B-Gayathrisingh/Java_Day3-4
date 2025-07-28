package OOPS;

public class ShippingService {

	public double calculateShippingCost(double weightInKg) {
		return weightInKg * 50; //50 rupees per kg
		
	}
	
	//Shipping with weight and distance
	public double calculateShippingCost(double weightInKg, double distance) {
		return (weightInKg * 50) + (distance*5); //50 rupees per kg and 5 rupees per km
		
	}
	
	public double calculateShippingCost(double weightInKg, double distance, boolean isPriority) {
		double base = (weightInKg * 50) + (distance*5); //50 rupees per kg
		return isPriority ? base +200 : base; //200rupees extra for priority
		
		
	}
}
