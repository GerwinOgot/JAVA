package myprojects;
public class  LAB_ACT3{
	static int math(int g, int j){
	return g/j+g;
	}
	static double math(double g, double j){
	return g*j-g;
	}
	static int math(int g, int j, int c) {
	return g/j+c;
	}
	static double math(double g, double j, double c){
	return g*j-c;
	}
}
	class Division {
	public static void main(String[] args){
		  int N1 = (LAB_ACT3.math(144, 12));
		  double N2 = (LAB_ACT3.math(75.5, 15.2));
		  int N3 = (LAB_ACT3.math(19,17,7));
		  double N4 = (LAB_ACT3.math(6.017,29.19,11.7));
		  System.out.println("2 int: " + N1);
		  System.out.println("2 double: " + N2);
		  System.out.println("3 int: "+N3);
		  System.out.println("3 double: "+N4);
	}
}