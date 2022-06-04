package Threads;

public class Main extends Thread{
	public static void main(String[] args) {
		Main thread = new Main();
		thread.start();
		System.out.println("this is out side of thread");
	}
	@Override
	public void run() {
		System.out.println("this is inside of therad");
	}
}