package myprojects;
	class Cats {
		String color="Orange";
		void greet() {
			System.out.println("Meowuvchu!");
		}
	}
public class LAB_ACT1 extends Cats{
		String catbreed ="Tabby";
	public static void main(String[] args) {
		LAB_ACT1 myCat = new LAB_ACT1();
		myCat.greet();
		System.out.println(myCat.color+" "+myCat.catbreed);
	}
}
