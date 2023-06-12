package exercicios.poo_aula69.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        System.out.printf("Nome: ");
        funcionario.setNome(sc.nextLine());
        System.out.printf("Salario: ");
        funcionario.setSalario(sc.nextDouble());
        System.out.printf("Imposto: ");
        funcionario.setTaxa(sc.nextDouble());

        funcionario.salarioLiquido();

        System.out.println("Funcionario: " + funcionario);

        System.out.print("Digite a porcentagem do aumento do salario do funcionario");
        double porcetagem = sc.nextDouble();
        funcionario.aumentarSalario(porcetagem);

        System.out.println("Update Salario Funcionario " + funcionario);

    }
}
