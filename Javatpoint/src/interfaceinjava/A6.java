package interfaceinjava;

interface printable {
	public abstract void print();
}

class A6 implements printable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}

class Test {
	public static void main(String[] args) {
		A6 a = new A6();
		a.print();
	}
}