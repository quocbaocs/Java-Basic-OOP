package week2_bai3;

public class HinhTamGiac {
	private float ma, mb, mc;

	public HinhTamGiac(float ma, float mb, float mc) {
		super();
		if (((ma + mb) > mc) && ((mb + mc) > ma) && ((ma + mc) > mb) &&((ma)>0) &&((ma)>0)&&((ma)>0)) {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		} else {
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		}

	}

	public HinhTamGiac() {
		this(0, 0, 0);
	}

	public float getMa() {
		return ma;
	}

	public void setMa(float ma) {
		this.ma = ma;
	}

	public float getMb() {
		return mb;
	}

	public void setMb(float mb) {
		this.mb = mb;
	}

	public float getMc() {
		return mc;
	}

	public void setMc(float mc) {
		this.mc = mc;
	}
	
	public String loaiTG() {
		String loai = null;
		if ((ma==mb)&&ma==mc&&mb==mc) {
			loai = "deu";
		}else if(((ma==mb)||ma==mc||mb==mc)) {
			loai = "can";
		}
		return loai;
	}
	
	public float Chuvi(float ma, float mb, float mc) {
		float chuvi = (ma+mb+mc)/2;
		return chuvi;
	}
	public float dientich() {
		float p = Chuvi(this.ma, this.mb, this.mc);
		float dientich = (float) Math.pow(p*(p-this.ma)*(p-this.mb)*(p-this.mc), 2);
		return dientich; 
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-5f %-10f %10.2f %s %f", ma,mb,mc,loaiTG(), dientich());
	}
}
