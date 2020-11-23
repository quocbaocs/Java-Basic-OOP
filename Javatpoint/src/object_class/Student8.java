package object_class;

class Student8 {
	int id;
	String name;

	Student8(int i, String n) {
		id = i;
		name = n;
	}

	Student8() {

	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student8 s1 = new Student8(111, "le quoc bao");
		Student8 s2 = new Student8();
		s2.id = s1.id;
		s2.name = s1.name;
		s1.display();
		s2.display();
	}

}
