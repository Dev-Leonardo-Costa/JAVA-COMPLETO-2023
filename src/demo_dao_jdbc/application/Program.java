package demo_dao_jdbc.application;

import demo_dao_jdbc.model.dao.SellerDao;
import demo_dao_jdbc.model.entities.Department;
import demo_dao_jdbc.model.entities.Seller;
import demo_dao_jdbc.model.factory.DaoFactory;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "Livro");
        Seller saller = new Seller(1, "Leo", "leo@gmail.com", new Date(), 3000.0, department);
        System.out.println(saller);

        SellerDao sellerDao = DaoFactory.createSellerDao();
    }
}
