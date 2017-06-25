package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import view.Pane;

import javax.swing.JFrame;



public class Key extends  JFrame implements KeyListener{
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;
	private Pane panne = new Pane ();
	

	    public void fen() {
	    	setTitle ("Crash Boulder");
	 		setSize(1000, 1000);
	 		setLocationRelativeTo(null);
	 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		setResizable(true);
	        add(panne);
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

	public void setListeCell (List<Integer> liste) {
		panne.setListeCell(liste);
	}
  
}


