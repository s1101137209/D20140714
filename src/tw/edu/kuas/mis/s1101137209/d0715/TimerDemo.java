package tw.edu.kuas.mis.s1101137209.d0715;

import java.util.Timer;

public class TimerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		timer.schedule(new D0723test(), 5000, 10000);
	}

}
