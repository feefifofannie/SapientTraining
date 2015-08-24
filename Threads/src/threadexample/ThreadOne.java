package threadexample;

class Runner implements Runnable {
	public void run() {
		System.out.println("Inside Run");
		for (int counter = 0; counter < 10; counter++){
			System.out.println(Thread.currentThread());
		}
	}
}

public class ThreadOne {

	public static void main(String[] args) {
		// every java app is single threaded
		Runner runner = new Runner();
		
		Thread firstThread = new Thread(runner, "First Thread");
		Thread secondThread = new Thread(runner, "Second Thread");
		firstThread.start();
		secondThread.start();
		
		try {
			firstThread.join();
			secondThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End");
	}
}