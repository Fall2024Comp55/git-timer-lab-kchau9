import acm.graphics.*;
import acm.program.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class MyFirstTimer extends GraphicsProgram implements ActionListener{
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	public static int numTimes = 0;
	public Timer someTimerVar = new Timer(1000, this); // 1000ms = 1 second
	private GLabel myLabel;
	

	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
		
		someTimerVar.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		myLabel.move(5, 0);
		numTimes+=1;
		myLabel.setLabel("times called? " + numTimes);
		if (numTimes >= 10)
		{
			someTimerVar.stop();
		}
	}
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}