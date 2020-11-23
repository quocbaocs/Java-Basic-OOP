package multipleInterface;

interface Printable {
	void print();
}

interface Showable {
	void show();
}

class A7 implements Printable, Showable {

	public static void main(String args[]) {
		A7 obj = new A7();
		obj.print();
		obj.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Wellcome");
	}
}