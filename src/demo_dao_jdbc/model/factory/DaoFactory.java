package demo_dao_jdbc.model.factory;

import demo_dao_jdbc.model.dao.SellerDao;
import demo_dao_jdbc.model.impl.SelllerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SelllerDaoJDBC();
    }

}
