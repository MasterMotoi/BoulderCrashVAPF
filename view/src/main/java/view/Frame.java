package view;

import java.io.IOException;

import javax.swing.JFrame;

public class Frame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public void view () throws IOException{
		setTitle ("Crash Boulder");
		setSize(512, 536);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		add(new Pannel());
		setVisible(true);
	}

}
