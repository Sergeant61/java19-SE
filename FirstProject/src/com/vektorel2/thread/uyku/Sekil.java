package com.vektorel2.thread.uyku;

public class Sekil implements Runnable {

	@Override
	public void run() {
		int sayac = 0;
		while(sayac < 200){
			sayac++;
			if(sayac % 25 == 0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("**");
		}
		
	}
	
	

}
