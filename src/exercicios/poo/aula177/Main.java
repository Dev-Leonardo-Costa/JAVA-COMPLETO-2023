package exercicios.poo.aula177;

import exercicios.poo.aula177.model.entities.Account;
import exercicios.poo.aula177.model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Balance: ");
        double balance = sc.nextDouble();

        System.out.print("withdrowLimit: ");
        double withdrowLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrowLimit);

        System.out.println(account);

        System.out.println();
        System.out.print("Deseja sacar qual valor? ");
        double saque = sc.nextDouble();

        try {
            account.withdraw(saque);
            System.out.printf("Novo saldo: %.2f", account.getBalance());
        } catch (DomainException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
