package interfaceinjava;

interface Drawable {
	void draw();
}

class Rectangle implements Drawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");
	}

}

class Circle implements Drawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
	}

}

class Test4 {
	public static void main(String[] args) {
		Drawable d = new Circle();
		d.draw();
	}

}
