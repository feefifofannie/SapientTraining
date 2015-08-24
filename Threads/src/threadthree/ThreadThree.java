package threadthree;

class Data {
	private int value;

	
	public void getValue(){
		System.out.println(value);;
	}
	
	public void setValue(int v){
		this.value = v;
	}
}

class Runner implements Runnable {
	Data data;
	private Thread secondThread;
	
	public Runner(){
		data = new Data();
	}
	
	public void setSecondThread(Thread t) {
		this.secondThread = t;
	}
	
	public void run() {
		Thread currThread;
		System.out.println("Inside Run");
		for (int counter = 0; counter < 10; counter++){
			currThread = Thread.currentThread();
			
			if (currThread.getName().equals("Producer")){
				System.out.println(currThread);
				synchronized(data){
					data.setValue(counter+1);
					try {
						data.notify();
						if (!secondThread.isAlive()){
							secondThread.start();
						}
						data.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} else if (currThread.getName().equals("Consumer")){
				System.out.println(currThread);
				synchronized(data){
					data.getValue();
					try {
						data.notify();
						data.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

public class ThreadThree {

	public static void main(String[] args) {
		// every java app is single threaded
		Runner runner = new Runner();
		
		Thread firstThread = new Thread(runner, "Producer");
		Thread secondThread = new Thread(runner, "Consumer");
		firstThread.start();
		runner.setSecondThread(secondThread);
		
		System.out.println("End");
	}
}