package team857.robot2015.auto;

import team857.robot2015.RobotDrive;
import team857.yetiRobot.PeriodController;;

public class FancyAutonTwo extends PeriodController.NoOperation {
	public void run(double time){
		/**/ if(time> 4.2) RobotDrive.getInstance().drive(-0.4).stop();
		else if(time> 2.1) RobotDrive.getInstance().drive(0.5);
		else if(time> 1.3) RobotDrive.getInstance().winch(0).drive(-0.5,0.5);
		else if(time> 0.5) RobotDrive.getInstance().winch(0.6);
		else /*1st to do*/ RobotDrive.getInstance().grab(true);
		
		// this was in chris's version but it looks funny to me
		///**/ if(time> 3.8) RobotDrive.stop();
		//else if(time> 2.2) RobotDrive.drive(0.74);
		//else if(time> 1.3) RobotDrive.winch(0).drive(0.8,-0.8);
		//else if(time> 0.5) RobotDrive.winch(0.6); 
		//else /*1st to do*/ RobotDrive.grab(false);
	}
}
