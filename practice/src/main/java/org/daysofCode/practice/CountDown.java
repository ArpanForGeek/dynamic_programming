package org.daysofCode.practice;

public class CountDown {
	
	private static void countDown(int seconds) throws InterruptedException {
		//without recursion
//		for(int i=seconds;i>=0;i--) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
		
		//with recursion
		if(seconds<0) return;
		System.out.println(seconds);
		Thread.sleep(1000);
		countDown(seconds-1);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new CountDown().countDown(5);

	}

}
