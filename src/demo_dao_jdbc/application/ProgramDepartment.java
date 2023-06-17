package demo_dao_jdbc.application;

import demo_dao_jdbc.model.dao.DepartmentDao;
import demo_dao_jdbc.model.dao.SellerDao;
import demo_dao_jdbc.model.entities.Department;
import demo_dao_jdbc.model.entities.Seller;
import demo_dao_jdbc.model.factory.DaoFactory;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProgramDepartment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========= Teste 1 Departmen metodo findById ==========");
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println();
//
//        System.out.println("========= Teste 2 Departmen metodo findByDepartmentId ==========");
//        Department department = new Department(4, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        for (Seller sellerList : list) {
//            System.out.println(sellerList);
//        }
//
//        System.out.println("========= Teste 3 Departmen metodo findAll ==========");
//        list = sellerDao.findAll();
//        for (Seller sellerList : list) {
//            System.out.println(sellerList);
//        }
//
//        System.out.println("========= Teste 4 Departmen metodo insert ==========");
//        Seller sellerNew = new Seller(null, "Eliomar Costa Silva", "elio@gmail.com", new Date(), 3000.0, department);
//        sellerDao.insert(sellerNew);
//        System.out.println("Sucesso insert: " + sellerNew.getId());
//
//        System.out.println("========= Teste 5 Departmen metodo update ==========");
//        seller = sellerDao.findById(3);
//        seller.setName("Costa");
//        sellerDao.update(seller);
//        System.out.println("Update completed!");
//
//        System.out.println("========= Teste 6 Departmen metodo update ==========");
//        System.out.print("Digite o Id que deseja remover: ");
//        int id = sc.nextInt();
//        sellerDao.deleteById(id);
//        System.out.printf("O codigo %d removido sucesso!", id);

    }
}
