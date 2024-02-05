package myprojects;
//polymorphism
class Humangreet {
	public void greetings() {
		System.out.println("Greetings!!");
	}
}
class Spanish extends Humangreet {
	public void greetings() {
		System.out.println("Spanish people says: Como Esta?");
	}
}
class Japanese extends Humangreet {
	public void greetings() {
		System.out.println("Japanese people says: Genkidesuka?");
	}
}
	public class quiz1_LAB_3 {
	public static void main(String[] args) {
		Humangreet humangreet = new Humangreet();  
		Humangreet filipino = new Spanish();  
		Humangreet japanese = new Japanese();  
		humangreet.greetings();
		filipino.greetings();
		japanese.greetings();
	}
}