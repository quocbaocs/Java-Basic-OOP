package interface_java;

public class Machine implements Info {
	private long id;

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Machine with id :"+id);
	}
	

}
