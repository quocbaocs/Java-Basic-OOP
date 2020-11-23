package iA.relatioship;

class TestInheritance {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();

		Cat c = new Cat();
		c.meow();
		c.eat();

	}
}

class Animal {
	void eat() {
		System.out.println("eating....");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking....");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("meowing....");
	}
}
