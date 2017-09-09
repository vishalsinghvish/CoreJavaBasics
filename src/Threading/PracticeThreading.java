package Threading;



class th implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class PracticeThreading {

	public static void main(String[] args) {
		Thread t= new Thread(new th());
		t.start();
		Thread t1= new Thread(new th());
		t1.start();
	}

}
