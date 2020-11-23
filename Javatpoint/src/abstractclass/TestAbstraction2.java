package abstractclass;

abstract class Bike2 {
	Bike2() {
		System.out.println("bike is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

class Honda extends Bike2 {
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("running safely...");
	}
}

class TestAbstraction2 {
	public static void main(String[] args) {
		Bike2 obj = new Honda();
		obj.run();
		obj.changeGear();
	}
}
