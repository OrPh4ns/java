package run;

public class Sync extends Thread{

	public synchronized void run() {
		
		
		try {
			
			for (int i = 0; i < 10; i++) {
				System.out.println("A "+Thread.currentThread().getName()+" ][ "+ i);
				Thread.sleep(1000);
				
			}
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	
}
}
