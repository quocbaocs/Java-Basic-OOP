package abstract_class_example;

public class Parrot extends Bird{

	public Parrot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(this.name +" roi");
	}
	
	

}
