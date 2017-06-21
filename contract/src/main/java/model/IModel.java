package model;

import java.sql.SQLException;
import java.util.List;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    Example getniveau_1Bycolone_1(int colone_1) throws SQLException;

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    Example getniveau_1Bycolone_2(String colone_2) throws SQLException;

    Example getniveau_1Bycolone_3(String colone_3) throws SQLException;

    Example getniveau_1Bycolone_4(String colone_4) throws SQLException;
    
    Example getniveau_1Bycolone_5(String colone_5) throws SQLException;

    Example getniveau_1Bycolone_6(String colone_6) throws SQLException;

    Example getniveau_1Bycolone_7(String colone_7) throws SQLException;
    
    Example getniveau_1Bycolone_8(String colone_8) throws SQLException;

    Example getniveau_1Bycolone_9(String colone_9) throws SQLException;

    Example getniveau_1Bycolone_10(String colone_10) throws SQLException;
    
    Example getniveau_1Bycolone_11(String colone_11) throws SQLException;

    Example getniveau_1Bycolone_12(String colone_12) throws SQLException;

    Example getniveau_1Bycolone_13(String colone_13) throws SQLException;
    
    Example getniveau_1Bycolone_14(String colone_14) throws SQLException;

    Example getniveau_1Bycolone_15(String colone_15) throws SQLException;
    
    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */
    List<Example> getAllniveau_1() throws SQLException;
}
