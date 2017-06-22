package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.swing.SwingUtilities;

import model.Example;
import model.IModel;
import view.*;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;
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
     */
     public void start() throws SQLException {
 		System.out.println("Hello World");
		
 		SwingUtilities.invokeLater(new Runnable() {
 		 public void run() {
 			 Frame fen;
 			try {
 				fen = new Frame();
 				fen.setVisible(true);
 			} catch (IOException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
 		 }
 		});
 		
 		System.out.println("Hello World");
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
