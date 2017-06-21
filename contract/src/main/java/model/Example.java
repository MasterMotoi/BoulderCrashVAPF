package model;

/**
 * <h1>The Class Example.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Example {

    /** The id. */
    private final int colone_1;

    /** The name. */
    private String    colone_2;

    private String    colone_3;
    
    /**
     * Instantiates a new example.
     *
     * @param id
     *            the id
     * @param name
     *            the name
     */
    public Example(final int colone_1, final String colone_2, final String colone_3) {
        super();
        this.colone_1 = colone_1;
        this.colone_2 = colone_2;
        this.colone_3 = colone_3;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getcolone_1() {
        return this.colone_1;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getcolone_2() {
        return this.colone_2;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getcolone_3() {
        return this.colone_3;
    }
    
    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
   /* public void setcolone_2(final String colone_2) {
        this.colone_2 = colone_2;
    }*/

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.getcolone_1() + "  " + this.getcolone_2()+ "  " + this.getcolone_3();
    }
}
