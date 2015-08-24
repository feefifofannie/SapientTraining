package threadtwo;

class Runner implements Runnable {
	Thread firstThread;
	Thread secondThread;
	
	public Runner() {
		firstThread = new Thread(this, "First Thread");
		secondThread = new Thread(this, "Second Thread");
		firstThread.start();
		secondThread.start();
	}
	
	public void run() {
		if (Thread.currentThread().getName().equals("Second Thread")){
			try {
				//Thread.sleep(5000);   another way to wait for threads to finish
				firstThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Inside Run");
		for (int counter = 0; counter < 10; counter++){
			System.out.println(Thread.currentThread());
		}
	}
	
	public Thread getSecondThread(){
		return secondThread;
	}
}

public class ThreadTwo {

	public static void main(String[] args) {
		// every java app is single threaded
		Runner runner = new Runner();
		
		try {
			runner.getSecondThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End");
	}
}