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

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    @Override
    public Example getniveau_1Bycolone_3(final String colone_3) throws SQLException {
        return ExampleDAO.getniveau_1Bycolone_3(colone_3);
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
