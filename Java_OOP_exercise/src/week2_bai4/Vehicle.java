package week2_bai4;

public class Vehicle {
	private String chuxe;
	private String loaixe;
	private int dungtich;
	private float trigia;

	public Vehicle(String chuxe, String loaixe, int dungtich, float trigia) {
		super();
		this.chuxe = chuxe;
		this.loaixe = loaixe;
		this.dungtich = dungtich;
		this.trigia = trigia;
	}

	public Vehicle() {
		super();
	}

	public String getChuxe() {
		return chuxe;
	}

	public void setChuxe(String chuxe) {
		this.chuxe = chuxe;
	}

	public String getLoaixe() {
		return loaixe;
	}

	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}

	public int getDungtich() {
		return dungtich;
	}

	public void setDungtich(int dungtich) {
		this.dungtich = dungtich;
	}

	public float getTrigia() {
		return trigia;
	}

	public void setTrigia(float trigia) {
		this.trigia = trigia;
	}
	
	public float tienThue() {
		float thue = 0;
		if(dungtich<100) {
			thue = trigia/100;
		}else if(dungtich >=100 && dungtich<200) {
			thue = trigia*3/100;
		}else if(dungtich>=200) {
			thue = trigia*5/100;
		}
		return thue;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return String.format("%-5s %-30s %5d %20.2f %30.2f ", chuxe, loaixe, dungtich, trigia, tienThue());
	}
}
