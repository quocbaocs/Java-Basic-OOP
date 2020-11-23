package object_class;
//Java Program to get the cube of a given number using the static method

class Caculate {
	static int cube(int x) {
		return x * x * x;
	}

	public static void main(String[] args) {
		int result = Caculate.cube(19);
		System.out.println(result);
	}
}
