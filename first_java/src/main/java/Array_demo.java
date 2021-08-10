
public class Array_demo {

	public static void main(String[] args) {
		Employee ee[]=new Employee[4];
		
		ee[0]=new Employee();
		ee[0].setName("Devendra");
		ee[0].setPassword("abcd");
		ee[0].setAge(23);
		ee[0].setEmail("abc@yahoo.com");
		ee[0].setAddress("Bangalore");
		
		ee[1]=new Employee();
		ee[1].setName("Devendra");
		ee[1].setPassword("abcd");
		ee[1].setAge(23);
		ee[1].setEmail("abc@yahoo.com");
		ee[1].setAddress("Bangalore");
		
		ee[2]=new Employee();
		ee[2].setName("Devendra");
		ee[2].setPassword("abcd");
		ee[2].setAge(23);
		ee[2].setEmail("abc@yahoo.com");
		ee[2].setAddress("Bangalore");
		
		ee[3]=new Employee();
		ee[3].setName("Devendra");
		ee[3].setPassword("abcd");
		ee[3].setAge(23);
		ee[3].setEmail("abc@yahoo.com");
		ee[3].setAddress("Bangalore");
		
		System.out.println(ee.length+"  record found");
		
		for(Employee e1:ee) {
			System.out.println("***************");
				System.out.println("Name is "+e1.getName());
				System.out.println("Password is "+e1.getPassword());
				System.out.println("Age is "+e1.getAge());
				System.out.println("Email is "+e1.getEmail());
				System.out.println("Address is "+e1.getAddress());
			System.out.println("****************");
		}

	}

}


















