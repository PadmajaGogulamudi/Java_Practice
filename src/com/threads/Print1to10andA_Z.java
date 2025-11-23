package com.threads;



class Print1to10 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
	}
}

class PrintAtoJ extends Thread{
	public void run() {
		for(char i='A';i<='J';i++) {
			System.out.print(i+" ");
		}
	}
}

public class Print1to10andA_Z {

	public static void main(String[] args) {
		Print1to10 t1=new Print1to10();
	PrintAtoJ t2=new PrintAtoJ();
	
		for(int i=1;i<10;i++) {
			System.out.println("hello ");
			
		}
		t1.start();
		t2.start();
		

	}

}
