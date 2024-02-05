package myprojects;

public class overloading {
	// Method with 2 parameter
	static int Multiply(int a, int b){
	return a * b;
	}
	// Method with the same name but 2 double parameter
	static double Multiply(double a, double b){
	return a * b;
	}
	}
	class Times {
	public static void main(String[] args){
	System.out.println( overloading.Multiply(2, 4));
	System.out.println( overloading.Multiply(5.5, 6.3));
	}
	}
