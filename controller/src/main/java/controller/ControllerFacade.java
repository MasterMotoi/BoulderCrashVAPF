package controller;



import java.io.IOException;

import javax.swing.JFrame;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;
import model.IModel;
import view.IView;
import view.Pane;
import controller.Key;






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
	
	/** The view. */
    private final IView  view;
	
    /** The model. */
    private final IModel model;
    private List<Integer> tab_cellule = new ArrayList<Integer>();
 
    private final Key touche = new Key();
    

    
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


        touche.setListeCell(tab_cellule);
       
        touche.fen();

       }
            
    
     
    

	// FONCTION DE GRAPHIQUE AVEC LE SWITCH
    
//	public void fenetre () throws IOException{
//	
//    	 
//    	setTitle ("Crash Boulder");
// 		setSize(1000, 1000);
// 		
// 		setLocationRelativeTo(null);
// 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		setResizable(true);
// 		add(pan);
// 		addKeyListener(touche);
// 		setVisible(true);
// 			
//    
//	}
    
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