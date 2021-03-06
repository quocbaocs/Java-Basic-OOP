package week2_bai1;

public class Toado {
	private String tentodo;
	private int x;
	private int y;

	public Toado(String tentodo, int x, int y) {
		super();
		this.tentodo = tentodo;
		this.x = x;
		this.y = y;
	}

	public Toado() {

	}

	public String getTentodo() {
		return tentodo;
	}

	public void setTentodo(String tentodo) {
		this.tentodo = tentodo;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return tentodo+"("+x+","+y+")";
	}
}
