package word_this;

//Calling parameterized constructor from default constructor:

class C {
	C() {
		this(5);
		System.out.println("hello c");
	}

	C(int x) {
		System.out.println(x);
	}
}

//Calling contructor delault form parameterized contructor 
class B {
	B() {
		System.out.println("hello B");
	}

	B(int x) {
		this();
		System.out.println(x);
	}
}

class A {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		// m()//same as this.m();
		this.m();
	}
}

class TestThis4 {
	public static void main(String[] args) {
		A a = new A();
		a.n();
		System.out.println("---------------");
		B b = new B(10);

		System.out.println("-----------------");
		C c = new C();
	}

}
