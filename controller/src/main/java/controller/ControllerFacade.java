package controller;



import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;
import model.IModel;
import view.IView;
import view.Pane;
import controller.Key;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;






/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade extends JFrame implements IController  {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Pane pan = new Pane();

	/** The view. */
    private final IView  view;
	
    /** The model. */
    private final IModel model;
    private List<Integer> tab_cellule = new ArrayList<Integer>();
 
    final Key Key = new Key();
    

    
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
	 * @param KeyEvent 
     *
     * @throws SQLException
     *             the SQL exception
     * @throws IOException 
     */
     public void start() throws SQLException, IOException {
    	

     final List<Example> examples = this.getModel().getAlllvl();
    
   	 
        
        tab_cellule.clear();

        
        for (final Example example : examples) {
        	      
            tab_cellule.add(Integer.parseInt(example.toString()));
            
        


        }


        pan.setListeCell(tab_cellule);
        Key.test();
        this.fenetre();
        
        

//       }
            
    }
     
    

	// FONCTION DE GRAPHIQUE AVEC LE SWITCH
    
	public void fenetre () throws IOException{

    	 JPanel p = new JPanel();
         JLabel label = new JLabel("Key Listener!");
         p.add(label);
         add(p);
        
    	 
    	setTitle ("Crash Boulder");
 		setSize(1000, 1000);
 		
 		//setKeyListener(this);
 		setLocationRelativeTo(null);
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		setResizable(true);
 		add(pan);
 		
 		//set(Key.test());
 		setVisible(true);
 		
 		 //JPanel a = new JPanel();
	     //   label = new JLabel("Key Listener!");
	    //    p.add(label);
	      //  add(a);
	     //   addKeyListener(this);
	     //   setSize(200, 100);
	     //   setVisible(true);
 		
    
	}
//	public void keyTyped(KeyEvent e) {
//
//        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//            System.out.println("Right key typed");
//        }
//        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//            System.out.println("Left key typed");
//        }
//        if (e.getKeyCode() == KeyEvent.VK_UP) {
//            System.out.println("Top key typed");
//        }
//        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//            System.out.println("Down key typed");
//        }
//        
//    }
//
// //  @Override
//    public void keyPressed(KeyEvent e) {
//
//        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//            System.out.println("Right key pressed");
//        }
//        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//            System.out.println("Left key pressed");
//        }
//        if (e.getKeyCode() == KeyEvent.VK_UP) {
//            System.out.println("Up key pressed");
//        }
//        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//            System.out.println("Down key pressed");
//        }
//
//    }
//
// //   @Override
//   public void keyReleased(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//            System.out.println("Right key Released");
//        }
//        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//            System.out.println("Left key Released");
//        }
//        if (e.getKeyCode() == KeyEvent.VK_UP) {
//            System.out.println("Up key Released");
//        }
//        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//            System.out.println("Down key Released");
//        }
//       
//    }
//     
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