package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import view.IView;

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
private int i = 0;
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
    	 
     final List<Example> examples = this.getModel().getAllniveau_1();
        final StringBuilder message = new StringBuilder();
        // a.append(" bar);
        for (final Example example : examples) {
            
            
            int tmp_cellule = Integer.parseInt(example.toString());
            
            switch(tmp_cellule)
            {
            case 0 :
            	message.append("A");
            	break;
            case 1 :
            	message.append("B");
            	break;
            	
            default:
            	message.append("O");
            	break;
            }
            
            
            i++;
            System.out.println(i);
            if(i % 15 == 0)
            	message.append('\n');

        }
        this.getView().displayMessage(message.toString());
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
