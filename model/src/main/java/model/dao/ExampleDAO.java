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


    /** The sql all examples. */
    private static String sqlAllniveau_1   = "{call findAllniveau_1()}";

    private static int sqlAllniveau_1ColomnIndex = 0;
        
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
            	int i = 1;
            	for (i=1; i<=15; i++){
            		sqlAllniveau_1ColomnIndex = i;
                	examples.add(new Example(result.getString(sqlAllniveau_1ColomnIndex)));
                	}}
            result.close();
        }
        return examples;
    }
    

}
