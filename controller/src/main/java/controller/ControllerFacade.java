package controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.sql.SQLException;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

import model.Example;
=======
import javax.swing.SwingUtilities;
>>>>>>> branch 'master' of https://github.com/MasterMotoi/BoulderCrashVAPF.git
import model.IModel;
<<<<<<< HEAD
import view.IView;

=======
import view.*;
>>>>>>> branch 'master' of https://github.com/MasterMotoi/BoulderCrashVAPF.git

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade extends JFrame implements IController  {

    /** The view. */
    private final IView  view;
	JPanel pan = new JPanel();

    /** The model. */
    private final IModel model;
<<<<<<< HEAD
    private int i = 0;
    private List<Integer> tab_cellule = new ArrayList<Integer>();
    

    
=======
>>>>>>> branch 'master' of https://github.com/MasterMotoi/BoulderCrashVAPF.git
    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
        
      
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     * @throws IOException 
     */
<<<<<<< HEAD
     public void start() throws SQLException, IOException {
    	
    
     final List<Example> examples = this.getModel().getAllniveau_1();
        final StringBuilder message = new StringBuilder();
        // a.append(" bar);
        tab_cellule.clear();
        
        for (final Example example : examples) {
        	      
            tab_cellule.add(Integer.parseInt(example.toString()));
            
        


        }
//        this.getView().displayMessage(message.toString());
        this.fenetre();
    }
     
     
     // FONCTION DE GRAPHIQUE AVEC LE SWITCH
     
     public void paint (Graphics g) {
 		int x = 0;
 		int y = 0;
 		Graphics2D g2d = (Graphics2D) g;
 		ImageIcon icTerre = new ImageIcon("Image jeu/Mur/Terre.png");
 		ImageIcon icMur = new ImageIcon("Image jeu/Mur/Mur.png");
 		ImageIcon icBob = new ImageIcon("Image jeu/Personnage/Face/Face 1.png");
 		ImageIcon icEnnemi = new ImageIcon("Image jeu/Monstres/Poulpe.png");
 		ImageIcon icVide = new ImageIcon("Image jeu/Mur/Vide.png");
 		ImageIcon icDiamand = new ImageIcon("Img/Diamand/Diamand.png");
 		ImageIcon icPoulpe = new ImageIcon("Img/Monstres/Poulpe.png");
 		ImageIcon icRocher = new ImageIcon("Img/Rocher/Rocher.png");
 		ImageIcon icCs = new ImageIcon("Img/Monstres/Chauve-ouris.png");
 		Image img = null;
 		
        for(int tmp_cellule : tab_cellule)
        {
        	switch(tmp_cellule)
  		   {
  		   case 0 :
  		   		img=icMur.getImage();
  			break;
  		   	
  		   case 1 :
  			   img=icTerre.getImage();
  		   	break;
  		   	
  		   case 2:
  			   img=icDiamand.getImage();
  		   	break;	
  		   	
  		   case 3:
  			   img=icPoulpe.getImage();
  		   	break;
  		   	
  		   case 4:
  			   img=icRocher.getImage();
  		   	break;
  		   	
  		   case 5:
  			   img=icBob.getImage();
  		   	break;
  		   	
  		   case 6:
  			   img=icCs.getImage();
  		   	break;
  		   }
        	
        	g.drawImage(img, x, y, null);
=======
     public void start() throws SQLException {
 		System.out.println("Hello World");
		
 		SwingUtilities.invokeLater(new Runnable() {
 		 public void run() {
 			 Fenetre fen;
 			fen = new Fenetre();
			fen.setVisible(true);
 		 }
 		});
 		
 		System.out.println("Hello World");
 	}
    
>>>>>>> branch 'master' of https://github.com/MasterMotoi/BoulderCrashVAPF.git

            x ++;
            if(x % 15 == 0) {
            y ++;
            x = 0;
            }
            }
 		
 	
     }
     
     
     public void fenetre () throws IOException{
 		setTitle ("Crash Boulder");
 		setSize(1000, 1000);
 		setLocationRelativeTo(null);
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		setResizable(true);
 		add(pan);
 		setVisible(true);
     }
     
     
     
    /**
     * Gets the view. 
     *
     * @return the view
     */
     
     
     
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    
    public IModel getModel() {
        return this.model;
    }
}
