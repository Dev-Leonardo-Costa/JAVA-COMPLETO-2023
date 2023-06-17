package demo_dao_jdbc.application;

import demo_dao_jdbc.model.dao.SellerDao;
import demo_dao_jdbc.model.entities.Department;
import demo_dao_jdbc.model.entities.Seller;
import demo_dao_jdbc.model.factory.DaoFactory;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        System.out.println("========= Teste 1 Seller metodo findById ==========");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();

        System.out.println("========= Teste 2 Seller metodo findByDepartmentId ==========");
        Department department = new Department(4, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller sellerList : list) {
            System.out.println(sellerList);
        }


    }
}
