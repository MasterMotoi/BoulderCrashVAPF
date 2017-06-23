package model;


/**
 * <h1>The Class Example.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Example {

  private final String sqlAlllvl;

   
    /**
     * Instantiates a new lvl.
     *
     * @param sqlAlllvl
     *            the sqlAlllvl
     */
    public Example(final String sqlAlllvl){			
    	super();
        
        this.sqlAlllvl = sqlAlllvl;

    }

    /**
     * Gets the sqlAlllvl.
     *
     * @return the sqlAlllvl
     */
    public String getsqlAlllvl(){
    	return this.sqlAlllvl;
    }
    
 
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    public String toString() {
    	
    		return this.getsqlAlllvl();   
    	
 
    	
    	}
    

    }

    

