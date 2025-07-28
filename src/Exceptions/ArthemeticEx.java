package Exceptions;

public class ArthemeticEx {
	public static void main(String[] args) {
		//int data = 0 ;
		try {
			int data = 100/0;  //Arithmetic Exception
			//System.out.println("Go to the next line.");
			//int data = 100/2;
			String s = null;
			//System.out.println(s.length()); //throws an exception Null Pointer Exception
			String s1 = "abc";
			//int i = Integer.parseInt(s1); //NumberFormat Exception
			int arr[] = new int[5];
			//arr[8] = 50;            //ArrayIndexOutOfBounds Exception
		}
//		catch(ArithmeticException e){
//			System.out.println("Arithmetic Exception Raised: Number divide by zero is not correct.");
//		}
//		catch(NullPointerException e) {
//			System.out.println(e);
//		}
//		catch(NumberFormatException e) {
//			System.out.println(e);
//		}
		catch(Exception e1) {
			System.out.println(e1);
		}
		System.out.println("Rest of the code here");
		//System.out.println(data);
	}

}

