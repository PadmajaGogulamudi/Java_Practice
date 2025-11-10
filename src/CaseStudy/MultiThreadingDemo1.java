package CaseStudy;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i <= 126; i++) {
			if (Character.isLetter((char)i))
				System.out.print((char)i + " ");
		}
	}
}

class Thread3 extends Thread {
	public void run() {
		for (int i = 32; i <= 126; i++) {
			if (!Character.isLetterOrDigit(i)) {
				System.out.print((char) i + " ");
			}
		}
	}
}

public class MultiThreadingDemo1 {

	public static void main(String[] args) {

		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.start();
		t2.start();
		t3.start();

	}

}
