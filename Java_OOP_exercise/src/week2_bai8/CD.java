package week2_bai8;

public class CD {
	private int maCD;
	private String tuaCD;
	private int sobaihat;
	private float giaThanh;

	public CD(int maCD, String tuaCD, int sobaihat, float giaThanh) {
		super();
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.sobaihat = sobaihat;
		this.giaThanh = giaThanh;
	}

	public CD() {
		super();
	}

	

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}

	public int getSobaihat() {
		return sobaihat;
	}

	public void setSobaihat(int sobaihat) {
		this.sobaihat = sobaihat;
	}

	public float getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(float giaThanh) {
		this.giaThanh = giaThanh;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-5d %-10s %10d %20s", maCD, tuaCD, sobaihat, giaThanh);
	}

}
