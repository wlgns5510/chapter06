package com.javaex.ex03;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException{
		
		//Runnable digit = new Digitlmpl();
		
		Thread thread = new Thread();
		thread.start();
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
		

	}

}
