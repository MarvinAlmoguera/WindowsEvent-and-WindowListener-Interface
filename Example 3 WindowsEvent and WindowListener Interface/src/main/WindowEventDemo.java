/**
 * 
 */
package main;

/**
 * @author Lenovo
 *
 */
import java.awt.*;
import java.awt.event.*;

public class WindowEventDemo extends Frame {

	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	
	public WindowEventDemo() {
		setLayout(new FlowLayout());
		
		add(new Label("Counter"));
		
		tfCount = new TextField("0", 10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCount = new Button("Count");
		add(btnCount);
		
		btnCount.addActionListener(new BtnCountListener());
		
		setTitle("WindowEvent Demo");
		setSize(300, 100);
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new WindowEventDemo();
		
	}
	
	private class BtnCountListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evt) {
			++count;
			tfCount.setText(count + "");
		}
	}
}
