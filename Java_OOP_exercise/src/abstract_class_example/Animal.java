package abstract_class_example;

public abstract class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public abstract void eat();

	public abstract void breathe();

	public String getName() {
		return this.name;
	}

}
