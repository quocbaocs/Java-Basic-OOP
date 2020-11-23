package mypack;

import pack.*;
import pack.A;

public class Simple {
	public static void main(String[] args) {
		System.out.println("Wellcome to package");
		A a = new A();
		a.msg();
		pack.A b = new A();
		b.msg();
	}

}
