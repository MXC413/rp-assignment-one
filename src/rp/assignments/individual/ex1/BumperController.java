package rp.assignments.individual.ex1;

import lejos.nxt.SensorPort;
import lejos.nxt.SensorPortListener;
import lejos.nxt.TouchSensor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.Delay;
import rp.robotics.DifferentialDriveRobot;
import rp.robotics.MobileRobot;
import rp.robotics.TouchSensorEvent;
import rp.systems.ControllerWithTouchSensor;
import rp.systems.StoppableRunnable;

public class BumperController implements ControllerWithTouchSensor {

	private DifferentialDriveRobot robot;
	private DifferentialPilot pilot;
	
	BumperController(DifferentialDriveRobot robot) {
		this.robot = robot;
		pilot = robot.getDifferentialPilot();
	}

	@Override
	public void run() {
		pilot.forward();
//		Delay.msDelay(3000);
//			sensorPressed(new TouchSensorEvent(0, 0));
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sensorPressed(TouchSensorEvent _e) {
		pilot.stop();
		pilot.rotate(180);
		run();
	}

	@Override
	public void sensorReleased(TouchSensorEvent _e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sensorBumped(TouchSensorEvent _e) {
		// TODO Auto-generated method stub
		
	}

}