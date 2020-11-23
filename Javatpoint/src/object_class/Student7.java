package object_class;
//Java program to initialize the values from one onject to another object

class Student7 {
	int id;
	String name;

	// constructor to initialize integer and string
	Student7(int i, String n) {
		id = i;
		name = n;

	}

	// constructor to initialize another object
	Student7(Student7 s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student7 s1 = new Student7(111, " quoc bao");
		Student7 s2 = new Student7(s1);
		s1.display();
		s2.display();
	}
}
