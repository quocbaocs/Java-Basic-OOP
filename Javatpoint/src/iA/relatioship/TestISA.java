package iA.relatioship;

class Employee {
	float salary = 40000;
}

class Programmer extends Employee {
	int bouns = 10000;
}

class TestISA {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is: " + p.salary);
		System.out.println("Bounds of Programmer is: " + p.bouns);
	}

}
