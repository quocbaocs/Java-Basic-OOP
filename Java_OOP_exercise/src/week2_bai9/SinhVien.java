package week2_bai9;

public class SinhVien {
	private int mssv;
	private String hoTen;
	private String diaChi;
	private int phoneNumber;

	public SinhVien(int mssv, String hoTen, String diaChi, int phoneNumber) {
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.phoneNumber = phoneNumber;
	}

	public SinhVien() {

	}

	public int getMssv() {
		return mssv;
	}

	public void setMssv(int mssv) {
		this.mssv = mssv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mssv;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		if (mssv != other.mssv)
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generted method stub
		return String.format("%-5d %-10s %10s %15d", mssv, hoTen, diaChi, phoneNumber);
	}
}
