package object_class;

class Student4 {
	int rollno;
	String name;

	void insertrecord(int r, String n) {
		rollno = r;
		name = n;

	}

	void displayInformation() {
		System.out.println(rollno + " " + name);
	}
}

public class TestStudent4 {
	public static void main(String[] args) {
		Student4 s1 = new Student4();
		Student4 s2 = new Student4();
		s1.insertrecord(111, "le quoc bao");
		s2.insertrecord(222, "le thanh cong");
		s1.displayInformation();
		s2.displayInformation();
	}

}
