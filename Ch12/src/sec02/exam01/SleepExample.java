package sec02.exam01;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolKit=Toolkit.getDefaultToolkit();
		for(int i=0;i<10;i++) {
			toolKit.beep();
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {}
		}
	}

}
