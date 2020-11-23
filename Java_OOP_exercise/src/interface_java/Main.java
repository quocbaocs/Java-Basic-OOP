package interface_java;

public class Main {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Manager manage1 = new Manager("Bao");
		machine1.showInfo();
		manage1.showInfo();
		System.out.println("--------------");
		Info in1 = new Manager("thanh");
		in1.showInfo();
	}

}
