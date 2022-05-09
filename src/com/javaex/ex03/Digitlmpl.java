package com.javaex.ex03;

public class Digitlmpl implements Runnable {

	//생성자
	//public Digitlmpl() {}
	
	
	
	//메소드 일반
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	

}
