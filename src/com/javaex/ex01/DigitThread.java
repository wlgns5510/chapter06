package com.javaex.ex01;

public class DigitThread extends Thread{
	//필드
	//생성자
	//메소드 gs
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
