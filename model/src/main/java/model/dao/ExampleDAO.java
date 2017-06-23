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

	/*		Methode choix lvl
	 * lvl_1 , lvl_2, lvl_3, lvl_4, lvl_5
	 * 
	 */
		public static String test(){
			String order;
			int choix = 5;
		switch (choix){
			case 1:
				order = "{call findniveau_1()}";
					break;
			case 2:
				order = "{call findniveau_2()}";
					break;
			case 3:
				order = "{call findniveau_3()}";
					break;
			case 4:
				order = "{call findniveau_4()}";
					break;
			case 5:
				order = "{call findniveau_5()}";
					break;
			default :
				order = "Choose LVL";
				break;
		}
		return order;
		}
		
    /** The sql all lvl. */

	private static String sqlAlllvl = test();
    private static int sqlAlllvlColomnIndex = 0;
        
    /**
     * Gets the all lvl.
     *
     * @return the all lvl
     * @throws SQLException
     *             the SQL exception
     */
    public static List<Example> getAlllvl() throws SQLException {
        final ArrayList<Example> examples = new ArrayList<Example>();
        final CallableStatement callStatement = prepareCall(sqlAlllvl);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
            		int i = 1;
            	for (i=1; i<=30; i++){
            		sqlAlllvlColomnIndex = i;
                	examples.add(new Example(result.getString(sqlAlllvlColomnIndex)));
                	}}
            result.close();
        }
        return examples;
    }
    

}
