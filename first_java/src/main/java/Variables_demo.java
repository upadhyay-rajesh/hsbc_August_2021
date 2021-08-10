
public class Variables_demo {
	
	
	
	//global variable
	int i=5;   //instance variable
	static int j=8; //class variable

	public static void main(String[] args) {
		Variables_demo a=new Variables_demo();
		
		String ss="Hello How Are You?";
		System.out.println(ss.length());
		
		System.out.println(ss.charAt(5));
		System.out.println(ss.substring(6));
		String s1=ss.concat("dfaf");

	}

}
