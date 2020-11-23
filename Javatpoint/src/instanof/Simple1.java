package instanof;

class Aninmal {
}

class Dog extends Aninmal {

}

class Dog2 {
}

class Simple1 {
	public static void main(String[] args) {
		Simple1 s = new Simple1();
		System.out.println(s instanceof Simple1);
		Dog d = new Dog();
		System.out.println(d instanceof Aninmal);
		
		Dog2 d2 = null;
		System.out.println(d2 instanceof Dog2);
	}

}
