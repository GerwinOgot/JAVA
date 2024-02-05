package myprojects;
//abstraction
abstract class Human {
	public abstract void humanspeak();
	public void greet() {
		System.out.println("Hello!");
	}
}
	class Filipino extends Human {
	public void filgreet() {
		System.out.println("Filipino greet: Kamusta!");
	}
	public void humanspeak() {		
	}
}
	public class quiz1_LAB_2 {
	public static void main(String[] args) {
		Filipino mygreet = new Filipino(); 
		mygreet.greet();
		mygreet.filgreet();
	}
}