package nested_classes;

import nested_classes.Robot.Brain;
import nested_classes.Robot.battery;

public class Main {
	public static void main(String[] args) {
		Robot robot = new Robot(123);
		robot.start();

		System.out.println("----------");
		Brain brain = robot.new Brain();
		brain.think();

		System.out.println("--------------");

		Robot.battery pattery = new Robot.battery();
		pattery.charge();
	}
}