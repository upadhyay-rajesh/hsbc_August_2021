package day2;

class Access {
	
	void method() {
		Demo d1=new Demo();
		System.out.println(d1.i);
		//System.out.println(d1.j);
		System.out.println(d1.k);
		System.out.println(d1.m);
	}

	public static void main(String[] args) {
		Access a=new Access();
		a.method();

	}

}
