package week1;

public class Bai10 {
	public static void main(String[] args) {
		int sum =0;
		int dem = 0;
		for(int i=0; i < 50; i++) {
			if(i%2==0) {
				sum = sum + i;
				dem = dem + 1;
				if(dem==10) {
					break;
				}
			}
			
		}
		System.out.println(sum);
			
	}

}
