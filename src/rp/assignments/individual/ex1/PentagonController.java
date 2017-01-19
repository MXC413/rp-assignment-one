package rp.assignments.individual.ex1;

import lejos.robotics.navigation.DifferentialPilot;
import rp.robotics.DifferentialDriveRobot;
import rp.robotics.MobileRobot;
import rp.systems.StoppableRunnable;

/**
 * 
 * A placeholder to show you how you could start writing a controller for the
 * first part of the first individual assignment (creating a controller which
 * drives in a pentagon). Note that you don't have to follow this structure for
 * your controller as there are more elegant and efficient (at least in terms of
 * numbers of lines of code) in which you can implement the different shape
 * controllers.
 * 
 * @author Nick Hawes
 *
 */
public class PentagonController implements StoppableRunnable {

	private DifferentialDriveRobot robot;
	private float sideLength;

	public PentagonController(DifferentialDriveRobot robot, float sideLength) {
		this.robot = robot;
		this.sideLength = sideLength;
	}

	@Override
	public void run() {
		DifferentialPilot pilot = robot.getDifferentialPilot();
		for (int i = 0; i < 5; i++) {
			pilot.travel(sideLength);
			pilot.rotate(72);
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

}