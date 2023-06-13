package exercicios.poo.aula81.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Numero da conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite seu Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        char r;
        System.out.print("Tem deposito inicial (s/n)? ");
        r = sc.next().charAt(0);
        if (r == 's') {
            System.out.printf("Qual valor deseja depositar? R$");
            double valorDeposito = sc.nextDouble();
            conta = new Conta(nome, numero, valorDeposito);
        } else {
            conta = new Conta(nome, numero);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);
        System.out.println();

        System.out.print("Deseja depositar qual valor ? R$");
        double valor = sc.nextDouble();
        conta.depositar(valor);
        System.out.println("Conta Atualizada " + conta);

        System.out.println();
        System.out.print("Deseja sacar qual valor ? R$");
        valor = sc.nextDouble();
        conta.sacar(valor);

        System.out.println("Conta Atualizada" + conta);
        sc.close();
    }
}
