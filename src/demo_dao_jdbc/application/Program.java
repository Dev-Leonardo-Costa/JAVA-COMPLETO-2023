package demo_dao_jdbc.application;

import demo_dao_jdbc.model.entities.Department;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "Livro");
        System.out.println(department);

    }
}
