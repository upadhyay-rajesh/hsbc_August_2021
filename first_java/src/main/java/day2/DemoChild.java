package day2;

import java.io.FileNotFoundException;

class DemoChild extends Demo{
	
	void method() {
		System.out.println(i);
		//System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}

	public static void main(String[] args)throws FileNotFoundException {
		DemoChild d=new DemoChild();
		d.method();
		
		float f=d.calculateInterest(12.3f, 12000.0, 2.4f);
		System.out.println(f);
		
		System.out.println(d.i);
		//System.out.println(j);
		System.out.println(d.k);
		System.out.println(d.m);

	}
	
	public float calculateInterest(float rate,double pamount , float time)throws FileNotFoundException{
		return 33.3f;
	}

}

 