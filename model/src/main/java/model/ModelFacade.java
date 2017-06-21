package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ModelFacade implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public Example getniveau_1Bycolone_1(final int colone_1) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_1(colone_1);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    @Override
    public Example getniveau_1Bycolone_2(final String colone_2) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_2(colone_2);
    }


    public Example getniveau_1Bycolone_3(final String colone_3) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_3(colone_3);
    }

    public Example getniveau_1Bycolone_4(final String colone_4) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_4(colone_4);
    }

    public Example getniveau_1Bycolone_5(final String colone_5) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_5(colone_5);
    }

    public Example getniveau_1Bycolone_6(final String colone_6) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_6(colone_6);
    }
    

    public Example getniveau_1Bycolone_7(final String colone_7) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_7(colone_7);
    }
   
    public Example getniveau_1Bycolone_8(final String colone_8) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_8(colone_8);
    }

    public Example getniveau_1Bycolone_9(final String colone_9) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_9(colone_9);
    }

    public Example getniveau_1Bycolone_10(final String colone_10) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_10(colone_10);
    }

    public Example getniveau_1Bycolone_11(final String colone_11) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_11(colone_11);
    }

    public Example getniveau_1Bycolone_12(final String colone_12) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_12(colone_12);
    }

    public Example getniveau_1Bycolone_13(final String colone_13) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_13(colone_13);
    }

    public Example getniveau_1Bycolone_14(final String colone_14) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_14(colone_14);
    }

    public Example getniveau_1Bycolone_15(final String colone_15) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_15(colone_15);
    }
 
    
    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     */
    @Override
    public List<Example> getAllniveau_1() throws SQLException {
        return ExampleDAO.getAllniveau_1();
    }

}
