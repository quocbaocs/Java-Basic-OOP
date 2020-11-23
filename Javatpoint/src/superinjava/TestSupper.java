package superinjava;

class Person {
	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

class Emp extends Person {
	float salary;

	Emp(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}

}

class TestSupper {

	public static void main(String[] args) {
		Emp e1 = new Emp(1, "ankit", 450000f);
		e1.display();
	}
}
