package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pannel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x = 0;
	private int y = 0;
	private String path;
	ImageIcon icMur = new ImageIcon("Img/Mur/Mur.png");
	ImageIcon icTerre = new ImageIcon("Img/Mur/Terre.png");
	ImageIcon icDiamand = new ImageIcon("Img/Diamand/Diamand.png");
	ImageIcon icPoulpe = new ImageIcon("Img/Monstres/Poulpe.png");
	ImageIcon icRocher = new ImageIcon("Img/Rocher/Rocher.png");
	ImageIcon icBob = new ImageIcon("Img/Personnage/Face/Face 1.png");
	ImageIcon icCs = new ImageIcon("Img/Monstres/Chauve-ouris.png");
	
	
	public Pannel(){
		setFocusable(true);
	}

	public void paint (Graphics g) {
	
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		final List<Example> examples = this.getModel().getAllniveau_1();
		final StringBuilder message = new StringBuilder();
		// a.append(" bar);
		for (final Example example : examples) {
		   
		   
		   int tmp_cellule = Integer.parseInt(example.toString());
		   
		   switch(tmp_cellule)
		   {
		   case 0 :
		   		img=icMur.getImage;
			break;
		   	
		   case 1 :
			   img=icTerre.getImage;
		   	break;
		   	
		   case 2:
			   img=icDiamand.getImage;
		   	break;	
		   	
		   case 3:
			   img=icPoulpe.getImage;
		   	break;
		   	
		   case 4:
			   img=icRocher.getImage;
		   	break;
		   	
		   case 5:
			   img=icBob.getImage;
		   	break;
		   	
		   case 6:
			   img=icCs.getImage;
		   	break;
		   }
		   
			g2d.drawImage(img,  x*16,  y*16,  null);
		   x++;
		   
		   if(x % 15 == 0)
			   x=0;
		   		y++;
			}
		

		
		this.getView().displayMessage(message.toString());

	}
}









