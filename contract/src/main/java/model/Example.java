package model;


/**
 * <h1>The Class Example.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Example {

  private final String sqlAllniveau_1;

   
    /**
     * Instantiates a new example.
     *
     * @param sqlAllniveau_1
     *            the sqlAllniveau_1
     */
    public Example(final String sqlAllniveau_1){			
    	super();
        
        this.sqlAllniveau_1 = sqlAllniveau_1;

    }

    /**
     * Gets the sqlAllniveau_1.
     *
     * @return the sqlAllniveau_1
     */
    public String getsqlAllniveau_1(){
    	return this.sqlAllniveau_1;
    }
    
 
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    public String toString() {
    	
    		return this.getsqlAllniveau_1();   
    	
 
    	
    	}
    

    }

    

