
public class PrintCount implements Runnable {
	
	public void run() {
		int count = 1;
		
		while(true) {
			try {
				Thread.sleep(10);
				System.out.print(count++ + " ");
			}catch(InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
				
				return;
			}
		}
	}

	public static void main(String[] args) {
	
		Thread th = new Thread(new PrintCount());
		th.start();
		try {
			Thread.sleep(100); }
			catch(InterruptedException e) {
				System.out.println(e);
			}
			th.interrupt();
		}
		

	}


