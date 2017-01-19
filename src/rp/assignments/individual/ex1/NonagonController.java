package rp.assignments.individual.ex1;

import lejos.robotics.navigation.DifferentialPilot;
import rp.robotics.DifferentialDriveRobot;
import rp.robotics.MobileRobot;
import rp.systems.StoppableRunnable;

public class NonagonController implements StoppableRunnable {

	private DifferentialDriveRobot robot;
	private float sideLength;

	public NonagonController(DifferentialDriveRobot robot, float sideLength) {
		this.robot = robot;
		this.sideLength = sideLength;
	}

	@Override
	public void run() {
		DifferentialPilot pilot = robot.getDifferentialPilot();
		for (int i = 0; i < 9; i++) {
			pilot.travel(sideLength);
			pilot.rotate(40);
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

}