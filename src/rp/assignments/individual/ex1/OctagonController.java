package rp.assignments.individual.ex1;

import lejos.robotics.navigation.DifferentialPilot;
import rp.robotics.DifferentialDriveRobot;
import rp.robotics.MobileRobot;
import rp.systems.StoppableRunnable;

public class OctagonController implements StoppableRunnable {

	private DifferentialDriveRobot robot;
	private float sideLength;

	public OctagonController(DifferentialDriveRobot robot, float sideLength) {
		this.robot = robot;
		this.sideLength = sideLength;
	}

	@Override
	public void run() {
		DifferentialPilot pilot = robot.getDifferentialPilot();
		for (int i = 0; i < 8; i++) {
			pilot.travel(sideLength);
			pilot.rotate(45);
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

}