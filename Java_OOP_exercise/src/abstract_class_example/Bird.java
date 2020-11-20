package abstract_class_example;

public abstract class Bird extends Animal {

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is eating");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("Hit vao tho ra");
	}
	public abstract void fly();

}
