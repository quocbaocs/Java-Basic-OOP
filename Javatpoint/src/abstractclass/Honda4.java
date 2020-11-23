package abstractclass;

abstract class Bike {
	abstract void run();
}

class Honda4 extends Bike {
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("running safely");
	}
}

class Test {
	public static void main(String[] args) {
		Bike obj = new Honda4();
		obj.run();
	}
}
