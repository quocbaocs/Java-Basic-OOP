package week2_bai8;

import java.util.Arrays;
import java.util.Comparator;

public class DSCD {
	private CD[] list;// Khai bao mang CD
	private int count = 0;

	public DSCD() {
		list = new CD[1];
	}

	public CD timCDRoom(int maCD) {
		for (int i = 0; i < count; i++) {
			if (list[i].getMaCD() == maCD)
				return list[i];
		}
		return null;
	}

	public void XuatDS() {
		for (int i = 0; i < count; i++)
			System.out.println(list[i]);
	}

	public void XuatCDGThanhLon500() {
		for (int i = 0; i < count; i++)
			if (list[i].getGiaThanh() > 500)
				System.out.println(list[i]);
	}

	public void SapXepTheoMa() {
		// các bạn chú ý cách sắp xếp theo số các số thực làm tương tự
		Arrays.sort(list, 0, count, new Comparator<CD>() {
			@Override
			public int compare(CD o1, CD o2) {
				// TODO Auto-generated method stub

				Integer d1 = new Integer(o1.getMaCD());
				Integer d2 = new Integer(o2.getMaCD());
				return d1.compareTo(d2);
			}
		});

	}

	public void SapXepTheoTuaCD() {
		Arrays.sort(list, new Comparator<CD>() {
			@Override
			public int compare(CD o1, CD o2) {
				// TODO Auto-generated method stub
				// so sanh dang chuoi
				return o1.getTuaCD().compareToIgnoreCase(o2.getTuaCD());
			}
		});
	}

	/**
	 * nếu trùng tựa thì sắp xếp theo giá thành
	 */
	public void sapXepGiaThanhVaTua() {
		Arrays.sort(list, 0, count, new Comparator<CD>() {
			@Override
			public int compare(CD o1, CD o2) {
				Double d1 = new Double(o1.getGiaThanh());
				Double d2 = new Double(o2.getGiaThanh());
				int s = d1.compareTo(d2);

				return (s == 0) ? o1.getTuaCD().compareToIgnoreCase(o2.getTuaCD()) : s;
			}
		});
	}

	public double TongGiaThanh() {
		double tt = 0;
		for (int i = 0; i < count; i++) {
			tt += list[i].getGiaThanh();
		}
		return tt;
	}

	private void tangKichThuoc() {
		CD[] temp = new CD[(int) (list.length * 2)];
		for (int i = 0; i < list.length; i++) {
			temp[i] = list[i];
		}
		list = temp;
	}

	public boolean them(CD cD) {
		// kiểm tra trùng mã sinh viên:
		if (!(timCDRoom(cD.getMaCD()) == null))
			return false;
		// kiểm tra tăng kích thước mảng:
		else {
			if (count == list.length)
				tangKichThuoc();
			list[count] = cD;
			count++;
			return true;
		}
	}
}
