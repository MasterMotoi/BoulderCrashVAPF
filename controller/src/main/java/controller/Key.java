package controller;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;



import javax.swing.JFrame;



public class Key extends  JFrame implements KeyListener{
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;
	

	    public  Key() {

	        JPanel p = new JPanel();
	        label = new JLabel("Key Listener!");
	        p.add(label);

	        addKeyListener(this);
	        setSize(1000, 1000);
	        setVisible(true);		
	    }



	public void keyTyped(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key typed");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key typed");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("Top key typed");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("Down key typed");
        }
        
    }

 //  @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("Up key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("Down key pressed");
        }

    }

 //   @Override
   public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key Released");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key Released");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("Up key Released");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("Down key Released");
        }
       
    }
 public void test(String[] args) {
        new test();
        
    }

  
}


