package day2;

import java.io.FileNotFoundException;

class DemoChild extends Demo{
	
	void method() {
		System.out.println(i);
		//System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}

	public static void main(String[] args) {
		DemoChild d=new DemoChild();
		d.method();

	}
	
	public float calculateInterest(float rate,double pamount , float time)throws FileNotFoundException{
		return 33.3f;
	}

}

 