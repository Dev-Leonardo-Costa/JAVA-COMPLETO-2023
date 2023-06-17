package demo_dao_jdbc.application;

import demo_dao_jdbc.model.entities.Department;
import demo_dao_jdbc.model.entities.Saller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "Livro");
        Saller saller = new Saller(1, "Leo", "leo@gmail.com", new Date(), 3000.0, department);
        System.out.println(saller);

    }
}
