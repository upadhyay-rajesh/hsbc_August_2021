package day2;

import java.io.IOException;

public  class Demo {
	
	int i=5;
	private int j=6;
	protected int k=7;
	public int m=8;
	
	void add() {
		i=9;
		System.out.println("add");
	}
	private void sub() {
		System.out.println("sub");
	}
	protected void mult() {
		System.out.println("mult");
	}
	public void div() {
		System.out.println("div");
	}
	
	float calculateInterest(float rate,double pamount , float time)throws IOException {
		return 34.5f;
	}

}
