package demo_dao_jdbc.model.factory;

import demo_dao_jdbc.model.dao.SellerDao;
import demo_dao_jdbc.model.impl.SelllerDaoJDBC;
import projeto_com_jdbc.db.DB;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SelllerDaoJDBC(DB.getConnection());
    }

}