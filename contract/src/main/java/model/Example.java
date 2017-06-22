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
     * @param id
     *            the id
     * @param name
     *            the name
     */
    public Example(final String sqlAllniveau_1){			
    	super();
        
        this.sqlAllniveau_1 = sqlAllniveau_1;

    }

    /**
     * Gets the id.
     *
     * @return the id
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
    
    public void test (){
     	if (toString() == "0") {System.out.println("LOL");}    	

    }
    }

    

