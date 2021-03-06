package week2_bai7;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;

	public HinhTron(ToaDo tam, double banKinh) {
		this.tam = tam;
		this.banKinh = banKinh;
	}

	public HinhTron() {

	}

	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	public double tinhChuVi() {

		return Math.round(2 * banKinh * Math.PI);
	}

	public double tinhDienTich() {
		return Math.round(banKinh * banKinh * Math.PI);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hinh tron : "+tam.getTen()+"("+tam.getX()+","+tam.getY()+") với bán kính:"+tinhChuVi()+" và diện tích: "+tinhDienTich();
	}

}
