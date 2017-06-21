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

    private static String sqlniveau_1Bycolone_4  = "{call findniveau_1Bycolone_4(?)}";
    
    private static String sqlniveau_1Bycolone_5   = "{call findniveau_1Bycolone_5(?)}";
    
    private static String sqlniveau_1Bycolone_6   = "{call findniveau_1Bycolone_6(?)}";

    private static String sqlniveau_1Bycolone_7   = "{call findniveau_1Bycolone_7(?)}";
    
    private static String sqlniveau_1Bycolone_8   = "{call findniveau_1Bycolone_8(?)}";
    
    private static String sqlniveau_1Bycolone_9   = "{call findniveau_1Bycolone_9(?)}";

    private static String sqlniveau_1Bycolone_10   = "{call findniveau_1Bycolone_10(?)}";
    
    private static String sqlniveau_1Bycolone_11   = "{call findniveau_1Bycolone_11(?)}";
    
    private static String sqlniveau_1Bycolone_12   = "{call findniveau_1Bycolone_12(?)}";

    private static String sqlniveau_1Bycolone_13   = "{call findniveau_1Bycolone_13(?)}";
    
    private static String sqlniveau_1Bycolone_14   = "{call findniveau_1Bycolone_14(?)}";
    
    private static String sqlniveau_1Bycolone_15   = "{call findniveau_1Bycolone_15(?)}";
    /** The sql all examples. */
    private static String sqlAllniveau_1   = "{call findAllniveau_1()}";

    /** The id column index. */
    private static int    colone_1ColumnIndex    = 1;

    /** The name column index. */
    private static int    colone_2ColumnIndex  = 2;

    private static int    colone_3ColumnIndex    = 3;
    
    private static int    colone_4ColumnIndex    = 4;
    
    private static int    colone_5ColumnIndex    = 5;
    
    private static int    colone_6ColumnIndex    = 6;
    
    private static int    colone_7ColumnIndex    = 7;
    
    private static int    colone_8ColumnIndex    = 8;
    
    private static int    colone_9ColumnIndex    = 9;
    
    private static int    colone_10ColumnIndex    = 10;
    
    private static int    colone_11ColumnIndex    = 11;
    
    private static int    colone_12ColumnIndex    = 12;
    
    private static int    colone_13ColumnIndex    = 13;
    
    private static int    colone_14ColumnIndex    = 14;
    
    private static int    colone_15ColumnIndex    = 15;
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
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex),result.getString(colone_8ColumnIndex), result.getString(colone_9ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex));
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
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex));
            }
            result.close();
        }
        return example;
    }


    public static Example getniveau_1Bycolone_3(final String colone_3) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_3);
        Example example = null;

        callStatement.setString(1, colone_3);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex));
            }
            result.close();
        }
        return example;
    }
    
    public static Example getniveau_1Bycolone_4(final String colone_4) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_4);
        Example example = null;

        callStatement.setString(1, colone_4);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex));
            }
            result.close();
        }
        return example;
    }
     
    public static Example getniveau_1Bycolone_5(final String colone_5) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_5);
        Example example = null;

        callStatement.setString(1, colone_5);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex));
            }
            result.close();
        }
        return example;
    }
 
    public static Example getniveau_1Bycolone_6(final String colone_6) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_6);
        Example example = null;

        callStatement.setString(1, colone_6);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex));
            }
            result.close();
        }
        return example;
    }
    
    public static Example getniveau_1Bycolone_7(final String colone_7) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_7);
        Example example = null;

        callStatement.setString(1, colone_7);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex));
            }
            result.close();
        }
        return example;
    }
   
    public static Example getniveau_1Bycolone_8(final String colone_8) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_8);
        Example example = null;

        callStatement.setString(1, colone_8);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex));
            }
            result.close();
        }
        return example;
    }
    
    public static Example getniveau_1Bycolone_9(final String colone_9) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_9);
        Example example = null;

        callStatement.setString(1, colone_9);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex));
            }
            result.close();
        }
        return example;
    }

    public static Example getniveau_1Bycolone_10(final String colone_10) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_10);
        Example example = null;

        callStatement.setString(1, colone_10);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_8ColumnIndex), result.getString(colone_9ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex));
            }
            result.close();
        }
        return example;
    }
    
    public static Example getniveau_1Bycolone_11(final String colone_11) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_11);
        Example example = null;

        callStatement.setString(1, colone_11);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_8ColumnIndex), result.getString(colone_9ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex));
            }
            result.close();
        }
        return example;
    }
    
    public static Example getniveau_1Bycolone_12(final String colone_12) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_12);
        Example example = null;

        callStatement.setString(1, colone_12);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_8ColumnIndex), result.getString(colone_9ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex)
            }
            result.close();
        }
        return example;
    }
    
    public static Example getniveau_1Bycolone_13(final String colone_13) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_13);
        Example example = null;

        callStatement.setString(1, colone_13);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_8ColumnIndex), result.getString(colone_9ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex)
            }
            result.close();
        }
        return example;
    }
    
    public static Example getniveau_1Bycolone_14(final String colone_14) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_14);
        Example example = null;

        callStatement.setString(1, colone_14);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_8ColumnIndex), result.getString(colone_9ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex)
            }
            result.close();
        }
        return example;
    }
    
    public static Example getniveau_1Bycolone_15(final String colone_15) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlniveau_1Bycolone_15);
        Example example = null;

        callStatement.setString(1, colone_15);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_8ColumnIndex), result.getString(colone_9ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex)
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
                examples.add(new Example(result.getInt(colone_1ColumnIndex), result.getString(colone_2ColumnIndex), result.getString(colone_3ColumnIndex), result.getString(colone_4ColumnIndex), result.getString(colone_5ColumnIndex), result.getString(colone_6ColumnIndex), result.getString(colone_7ColumnIndex), result.getString(colone_8ColumnIndex), result.getString(colone_9ColumnIndex), result.getString(colone_10ColumnIndex), result.getString(colone_11ColumnIndex), result.getString(colone_12ColumnIndex), result.getString(colone_13ColumnIndex), result.getString(colone_14ColumnIndex), result.getString(colone_15ColumnIndex)));
            }
            result.close();
        }
        return examples;
    }
}
