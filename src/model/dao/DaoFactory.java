package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    /**
     * responsible for instantiating the DAO classes
     * @return SellerDaoJDBC class
     */
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
   

}
