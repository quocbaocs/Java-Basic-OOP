package overriding;
//Java program to demonstraate the real scenario of Java Method Overriding

//where three classes are overidingn the method of a partent class.
//Creating child classed .

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 5;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 4;
	}
}

class AXIS extends Bank {
	int getRateOfInterest() {
		return 1;
	}
}

class TestBank {
	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
	}
}
