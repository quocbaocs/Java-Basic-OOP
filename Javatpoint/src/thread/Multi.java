package thread;

class Multi extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is running");
	}
}

class Multi3 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thead Mutli 3 runningn");
	}
}

class TestSleepMethod1 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i);
		}
	}
}

class Test {
	public static void main(String[] args) {
		Multi t1 = new Multi();
		t1.start();
		Multi3 m3 = new Multi3();
		Thread t2 = new Thread(m3);
		t2.start();
		System.out.println("-------------");
		TestSleepMethod1 ts1 = new TestSleepMethod1();
		TestSleepMethod1 ts2 = new TestSleepMethod1();
		ts1.start();
		
		ts2.start();
	}
}