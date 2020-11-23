package abstract_class_example;

public class Main {
	public static void main(String[] args) {
		Pig p1 = new Pig("pig1");
		p1.eat();
		p1.breathe();
		System.out.println("-----------");
		
		Animal a = new Pig("heo");
		a.eat();
		System.out.println("----------");
		
		Animal b = new Parrot("hello");
		b.eat();
		
		Bird b1 = new Parrot("hehe");
		b1.fly();
	}

}
