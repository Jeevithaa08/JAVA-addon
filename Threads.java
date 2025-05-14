package Newproject;
class MyThread extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}
}
public class Threads {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.start();
	}
}
