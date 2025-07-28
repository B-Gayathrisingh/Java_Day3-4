package Exceptions;

public class Throw {

	public static void main(String[] args) {
		int age = 15;
		if( age < 18 ) {
			throw new ArithmeticException("Access denited - you must be 18 or above.");
		}
		else {
			System.out.println("Access granted.");
		}

	}

}
