package MultiThreading;

public class ThreadRunnable implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadRunnable tr = new ThreadRunnable();
		Thread t =new Thread(tr);
		Thread t1 =new Thread(new ThreadRunnable());

		t.start();
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println("Hi");
		
	}

}
