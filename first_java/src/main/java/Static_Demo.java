
public class Static_Demo {
	
	static float salary;
	static String address;
	
	static {
		salary=3456.7f;
		address="Bangalore";
	}
	
	static int age=23;
	
	String name="Shreya";

	public static void main(String[] args) {
		
		Static_Demo a=new Static_Demo();
		
		System.out.println(a.name);

	}
	
	static void add() {
		System.out.println(age);
	}

}
