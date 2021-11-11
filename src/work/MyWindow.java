package work;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {

	public static void main(String[] args) {

		// Window : Object JFrame
		JFrame frame = new JFrame("My Window..!!");
		frame.setSize(400, 400);
		frame.setLayout(null);
		
		

		// Create Buttons And Add jframe

		JButton button = new JButton("Click Me..");
		button.addActionListener(null);
		
		frame.add(button);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}
}
