package myprojects;
//inheritances
class hotday {
	String weather="Sunny";
	void todo() {
		System.out.println("Stay hydrated and stayin the shade!");
	}
}
public class quiz1_LAB extends hotday{
	String country ="Philippines";
	public static void main(String[] args) {
		quiz1_LAB weathertoday = new quiz1_LAB();
		weathertoday.todo();
		System.out.println(weathertoday.weather+" "+weathertoday.country);
	}
}