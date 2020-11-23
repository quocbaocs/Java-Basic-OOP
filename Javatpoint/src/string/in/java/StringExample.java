package string.in.java;

public class StringExample {
	public static void main(String[] args) {
//		String s1 = "java";
//		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
//		String s2 = new String(ch);
//		String s3 = new String("example");
//
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);

		System.out.println("------------");
		String s1 = "Sachin";
		String s2 = "SAchin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println("-----------");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("---------");

		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// 1(because s1>s3)
		System.out.println(s3.compareTo(s1));// -1(because s3 < s1 )
		System.out.println("--------------");
		System.out.println("constain in java");
		String cons = "truong";
		System.out.println(cons.contains("t"));
		System.out.println("----------end wich trong String");
		System.out.println(cons.endsWith("ng"));
		System.out.println("------------");
		String s11 = new String("hello");
		String s22 = "hello";
		String s33 = s11.intern();// returns string from pool, now it will be same as s2
		System.out.println(s11 == s22);// false because reference variables are pointing to different instance
		System.out.println(s22 == s33);// true because reference variables ar

		System.out.println("join string");

		System.out.println(String.join("-", "quoc", "bao"));

		System.out.println("replace all");
		String rep = "truong trung hoc pho thong thanh hoa";
		System.out.println(rep.replaceAll(" ", "-"));

		System.out.println("Split in java");
		String spl = "quocbao .net";
		String[] sp = spl.split("\\ ");
		for (String item : sp) {
			System.out.println(item);
		}
	}

}
