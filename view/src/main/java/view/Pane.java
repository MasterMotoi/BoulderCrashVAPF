package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;


import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.util.List;
import controller.Key;




/**
 * Create the class Pane
 */
public class Pane extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Integer> listeCell;
	
	private Key touche = new Key();
	
	
	public Pane () {
		setFocusable(true);
	}
	
  public void paintComponent (Graphics g) {
		int x = 0;
		int y = 0;
		Graphics2D g2d = (Graphics2D) g;
		Image img = null;
		addKeyListener(touche);
	
		/**
		 * Create object and we define their path
		 */
		ImageIcon icTerre = new ImageIcon("C:/Users/Motoi/git/BoulderCrashVAPF/Img/Mur/Terre.png");
		ImageIcon icMur = new ImageIcon("C:/Users/Motoi/git/BoulderCrashVAPF/Img/Mur/Mur.png");
		ImageIcon icBob = new ImageIcon("C:/Users/Motoi/git/BoulderCrashVAPF/Img/Personnage/Face/Face 1.png");
		ImageIcon icDiamand = new ImageIcon("C:/Users/Motoi/git/BoulderCrashVAPF/Img/Diamand/Diamand.png");
		ImageIcon icPoulpe = new ImageIcon("C:/Users/Motoi/git/BoulderCrashVAPF/Img/Monstres/Poulpe.png");
		ImageIcon icRocher = new ImageIcon("C:/Users/Motoi/git/BoulderCrashVAPF/Img/Rocher/Rocher.png");
		ImageIcon icCs = new ImageIcon("C:/Users/Motoi/git/BoulderCrashVAPF/Img/Monstres/Chauve-souris.png");
		ImageIcon icVide = new ImageIcon("C:/Users/Motoi/git/BoulderCrashVAPF/Img/Mur/Tunnel.png");
	
		/**
		 * Condition to get a specific image when we have a specific digit 
		 */


		

     for(int tmp_cellule : listeCell)
     {
     	switch(tmp_cellule)
		   {
		   case 0 :
		   		img = icMur.getImage();
			break;
		   	
		   case 1 :
			 img = icTerre.getImage();
		   	break;
		   	
		   case 2:
			 img = icDiamand.getImage();
		   	break;	
		   	
		   case 3:
			 img = icPoulpe.getImage();
		   	break;
		   	
		   case 4:
			 img = icRocher.getImage();
		   	break;
		   	
		   case 5:
			 img = icBob.getImage();
		   	break;
		   	
		   case 6:
			 img = icCs.getImage();
		   	break;
		   	
		   	default :
		   		img = icTerre.getImage();
		   }

     	g2d.drawImage(icVide.getImage(), x*16, y*16, null);
     	g2d.drawImage(img, x*16 , y*16 , null);

       /**
        * line break when x = 30
        */
     	x ++;
         if(x % 30 == 0) {
         	y ++;
         	x = 0;
         }
         
      
     }
		
	
 }


	
	public void setListeCell (List<Integer> liste) {
		this.listeCell = liste;
	}

}
