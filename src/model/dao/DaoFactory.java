package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    /**
     * responsible for instantiating the DAO classes
     * @return SellerDaoJDBC class
     */
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }

}
