package interface_java;

public class Manager implements Info, Studyable{
	private String name;
	public Manager(String name) {
		this.name = name;
	}
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Manager with name: "+name);
	}
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("truong"+a);
	}
}
