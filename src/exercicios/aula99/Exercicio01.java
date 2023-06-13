package exercicios.aula99;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcinario> list = new ArrayList<>();

        System.out.print("Deseja registrar quantos funcionario ? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.print("Funcionario #" + (i + 1) + ": ");
            sc.nextLine();
            System.out.print("\nId: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: R$");
            double salario = sc.nextDouble();
            Funcinario funcinario = new Funcinario(id, nome, salario);
            list.add(funcinario);
        }

        System.out.print("Deseja da aumentar o salario de qual funcionario? ");
        int id = sc.nextInt();
        Funcinario idFuncinario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (idFuncinario == null) {
            System.out.println("Funcionario não existe!");
        } else {
            System.out.print("Qual a porcentagem do aumento? %");
            double porcetagem = sc.nextDouble();
            idFuncinario.aumentoSalario(porcetagem);
        }

        System.out.println();
        System.out.println("Lista dos funcionarios:");
        for (Funcinario funcinario : list){
            System.out.println(funcinario);
        }

        sc.close();
    }
}
