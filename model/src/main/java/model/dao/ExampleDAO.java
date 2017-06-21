package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class ExampleDAO extends AbstractDAO {

    /** The sql example by id. */
    private static String sqlniveau_1Bycolone_1   = "{call findniveau_1Bycolone_1(?)}";

    /** The sql example by name. */
    private static String sqlniveau_1Bycolone_2 = "{call findniveau_1Bycolone_2(?)}";
    
    /** The sql example by id. */
    private static String sqlniveau_1Bycolone_3   = "{call findniveau_1Bycolone_3(?)}";

    /** The sql all examples. */
    private static String sqlAllniveau_1   = "{call findAllniveau_1()}";

    /** The id column index. */
    private static int    colone_1ColumnIndex    = 1;

    /** The name column index. */
    private static int    colone_2ColumnIndex  = 2;

    /** The id column index. */
    private static int    colone_3ColumnIndex    = 3;
    
    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    public static Example getniveau_1Bycolone_1(final int colone_1) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_1);
        Example example = null;
        callStatement.setInt(1, colone_1);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex));
            }
            result.close();
        }
        return example;
    }

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    public static Example getniveau_1Bycolone_2(final String colone_2) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_2);
        Example example = null;

        callStatement.setString(1, colone_2);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex));
            }
            result.close();
        }
        return example;
    }

    
    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    public static Example getniveau_1Bycolone_3(final String colone_3) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_3);
        Example example = null;

        callStatement.setString(1, colone_3);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex));
            }
            result.close();
        }
        return example;
    }
    
    
    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */
    public static List<Example> getAllniveau_1() throws SQLException {
        final ArrayList<Example> examples = new ArrayList<Example>();
        final CallableStatement callStatement = prepareCall(sqlAllniveau_1);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
                examples.add(new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex)));
            }
            result.close();
        }
        return examples;
    }
}
