package object_class;

class Student1 {
	int id;
	String name;
}

class TestStudent2 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.id = 10;
		s1.name = "truong";
		System.out.println(s1.id + " " + s1.name);
		System.out.println("-------------------");
		Student1 s2 = new Student1();
		s2.id = 123;
		s2.name = "Quoc bao";
		System.out.println(s2.id + " " + s2.name);
	}
}
