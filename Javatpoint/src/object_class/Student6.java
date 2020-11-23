package object_class;

class Student6 {
	int id;
	String name;
	int age;

	// creating two arg constructor
	Student6(int i, String n) {
		id = i;
		name = n;
	}

	// creating three arg constructor
	Student6(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);

	}

	public static void main(String[] args) {
		Student6 s1 = new Student6(111, " quoc bao");
		Student6 s2 = new Student6(222, "le thanh hai", 25);
		s1.display();
		s2.display();
	}
}
