package interfaceinjava;

interface Bank {
	float rateOfInterest();
}

class SBI implements Bank {

	@Override
	public float rateOfInterest() {
		// TODO Auto-generated method stub
		return 9.15f;
	}

}

class PNB implements Bank {

	@Override
	public float rateOfInterest() {
		// TODO Auto-generated method stub
		return 9.15f;
	}

}

class Test5 {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest());
	}

}
