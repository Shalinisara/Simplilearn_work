package Threadpkg;

public class ThreadMain {

	public static void main(String[] args) {
		
		ThreadCls r1=new ThreadCls();
		ThreadCls r2=new ThreadCls();
		ThreadCls r3=new ThreadCls();
		ThreadCls r4=new ThreadCls();
		ThreadCls r5=new ThreadCls();
		
		Thread t1=new Thread(r1, "run-1");
		Thread t2=new Thread(r2, "run-2");
		Thread t3=new Thread(r3, "run-3");
		Thread t4=new Thread(r4, "run-4");
		Thread t5=new Thread(r5, "run-5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		/*try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Printing from thread "+Thread.currentThread().getName()+" value of i = "+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
		System.out.println("All salaries processed successfuullyy");

	}

}
 