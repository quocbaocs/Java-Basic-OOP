package polymorphism;

class Bike {
	void run() {
		System.out.println("running");
	}
}

class Splendor extends Bike {
	void run() {
		System.out.println("runningn safely with 60km");
	}
}

class Test {
	public static void main(String[] args) {
		Bike k = new Splendor();
		k.run();
	}
}
