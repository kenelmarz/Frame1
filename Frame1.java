package frames;

import javax.swing.JFrame;

public class Frame1 extends JFrame {
	public Frame1() {
		setTitle("Frame test 2");
		setSize(400,400);
		sheet1 mysheet=new sheet1();
		add(mysheet);
	}
}
	
