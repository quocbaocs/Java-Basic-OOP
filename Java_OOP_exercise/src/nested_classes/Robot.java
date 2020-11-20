package nested_classes;

public class Robot {
	private long id;

	public Robot(long id) {
		this.id = id;

	}

	public void start() {
		System.out.println("Robot with id=" + this.id);
		Brain brain = new Brain();
		brain.think();
	}

	class Brain {
		public void think() {
			System.out.println("robot is thinking");
		}
	}
	static class battery{
		public void charge() {
			System.out.println("robot in plugin");
		}
	}

}
