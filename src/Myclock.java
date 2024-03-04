
/*
 * @uthor:rajnish
 * Logic of program is to make class that extends JComponent. This class is Clockdiagram here.
 * This class will have take System time to get hour, minute and second values. 
 * We make an analogue clock graphics in this class based on this time values.
 * In Main method, create frame, add this JComponent to frame and repaint() method
 * to get updated clock (JComponent). One need to use Thread Class, details are given
 * in comments where Thread class is invoked in code. 
 * 
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Stroke;
import java.time.LocalTime;

import javax.swing.JComponent;
import javax.swing.JFrame;
//we make a thread by implementing Runnable here. This will help in keeping application light
class Clockdiagram extends JComponent implements Runnable{
	private static final long serialVersionUID = 1L;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {	
				
				Thread.sleep(1000l);
				/*
				 * If we wont use Thread.sleep(1000l), it will increase cpu &
				 * memory usage too much. It is because System will continuously
				 * repaint() the JComponent, while now I am forcing to repaint
				 * after a second.
				 */
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
		}
	}
	public void paint(Graphics g) {
		g.drawOval(0, 0, 300, 300);
		g.setColor(Color. BLUE);
		g.fillOval(0, 0, 300, 300);
		g.setColor(Color.WHITE);
		int xcenter = 150;
		int ycenter = 150;
		// g.drawLine(xcenter,ycenter,300,300);
		g.drawString("XII", xcenter, 15);
		g.drawString("III", 290, ycenter);
		g.drawString("VI", xcenter, 290);
		g.drawString("IX", 10, ycenter);
		/*
		 * When we consider center of this circle as center, then center
		 * coordinate is xcenter & ycenter (not 0,0).When clock shows 3-6, it is
		 * our first quadrant, meaning angle goes from 0 to 90, similarly 6-9 is
		 * 2nd quadraant and so on.. 12-3 becomes last quadrant, angle is 270 to
		 * 360 degrees. Based on this cosine is applied for x coordinate like
		 * 'xcenter*Math.cos(Math.toRadians(300.0))' and sine is applied for y
		 * coordinate such as 'ycenter*Math.sin(Math.toRadians(300.0))'.
		 */

		g.drawString("I", (xcenter - 15 + (int) ((double) xcenter * Math.cos(Math.toRadians(300.0)))),
				ycenter + 10 + (int) ((double) ycenter * Math.sin(Math.toRadians(300.0))));
		// 'xcenter- 15' is done so that letter "I" comes slightly under
		// circumference of circle
		g.drawString("II", (xcenter - 10 + (int) ((double) xcenter * Math.cos(Math.toRadians(330.0)))),
				ycenter + (int) ((double) ycenter * Math.sin(Math.toRadians(330.0))));
		g.drawString("IV", (xcenter - 10 + (int) ((double) xcenter * Math.cos(Math.toRadians(30.0)))),
				ycenter + (int) ((double) ycenter * Math.sin(Math.toRadians(30.0))));
		g.drawString("V", (xcenter - 5 + (int) ((double) xcenter * Math.cos(Math.toRadians(60.0)))),
				ycenter + (int) ((double) ycenter * Math.sin(Math.toRadians(60.0))));
		g.drawString("VII", (xcenter + (int) ((double) xcenter * Math.cos(Math.toRadians(120.0)))),
				ycenter + (int) ((double) ycenter * Math.sin(Math.toRadians(120.0))));
		g.drawString("VIII", (xcenter + (int) ((double) xcenter * Math.cos(Math.toRadians(150.0)))),
				ycenter + (int) ((double) ycenter * Math.sin(Math.toRadians(150.0))));
		g.drawString("X", (xcenter + 10 + (int) ((double) xcenter * Math.cos(Math.toRadians(210.0)))),
				ycenter + 10 + (int) ((double) ycenter * Math.sin(Math.toRadians(210.0))));
		g.drawString("XI", (xcenter + 10 + (int) ((double) xcenter * Math.cos(Math.toRadians(240.0)))),
				ycenter + 10 + (int) ((double) ycenter * Math.sin(Math.toRadians(240.0))));
		LocalTime time = LocalTime.now();
		double hour = (double) time.getHour();
		// converting hour into 12 hour time format
		if (hour > 12.0) {
			hour = hour - 12.0;
		}
		if (hour < 3.0) {
			hour = hour + 12.0;
		}
		double minute = (double) time.getMinute();
		if (minute < 15.0) {
			minute = 60 + minute;
		}
		double second = (double) time.getSecond();
		if (second < 15.0) {
			second = 60.0 + second;
		}
		double secondangle = (second - 15) * 6.0;
		double minuteangle = (minute - 15) * 6.0;
		double hourangle = (hour - 3.0) * 30.0 + (minute/ 2);
		//gSystem.out.println(hourangle);
		double hradian = Math.toRadians(hourangle);
		double mradian = Math.toRadians(minuteangle);
		double sradian = Math.toRadians(secondangle);
			g.drawLine(xcenter, ycenter, xcenter + (int) (75.0 * Math.cos(hradian)),
				ycenter + (int) (75.0 * Math.sin(hradian)));
		g.drawLine(xcenter, ycenter, xcenter + (int) (120.0 * Math.cos(mradian)),
				ycenter + (int) (120.0 * Math.sin(mradian)));
		g.drawLine(xcenter, ycenter, xcenter + (int) (140.0 * Math.cos(sradian)),
				ycenter + (int) (140.0 * Math.sin(sradian)));
	}

	
}

public class Myclock {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Clock");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 400, 400);
		
		Clockdiagram clock = new Clockdiagram();
		Thread clockthread = new Thread(clock,"clockthread-1");
		frame.add(clock);
		frame.setVisible(true);
		clockthread.start();
		
	}
}
