package abstractimplements;

interface A {
	void a();

	void b();

	void c();

	void d();
}

abstract class B implements A {
	abstract void inta(int a);
	public void c() {
		System.out.println("I am c");
	}
}

class M extends B {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("I am a");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("I am b");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("I am d");
	}

	@Override
	void inta(int a) {
		// TODO Auto-generated method stub
		
	}

}

class Test5 {
	public static void main(String[] args) {
		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}

}
