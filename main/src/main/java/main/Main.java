package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import controller.ControllerFacade;
import model.ModelFacade;
import view.*;
import controller.Key;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */

public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException 
     */

    public static void main(final String[] args) throws IOException {

    			
        final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());
		final Key key = new Key(KeyEvent);
        
      
        try {
          
      	      key.keyTyped(e);
              key.keyReleased(e);
              key.keyPressed(e);
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
        
        

    }
    

}
