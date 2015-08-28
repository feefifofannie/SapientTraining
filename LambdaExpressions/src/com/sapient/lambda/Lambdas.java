package com.sapient.lambda;

public class Lambdas {

	public static void main(String[] args) {
		newWay();
	}
	
	public static void newWay() {
		Execution execution = new Execution();
		execution.call(()->{System.out.println("testing1");});
	}
	
	public static void oldWay() {
		Execution execution = new Execution();
		execution.call(new Test() {
			public void testing() {
				System.out.println("testing1");
			}
		});
	}

}

interface Test {
	public void testing();
}

class Execution {
	public void call(Test test){
		test.testing();
	}
}