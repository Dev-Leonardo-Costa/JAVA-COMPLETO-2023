package exercicios.aula93;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluguel[] vet = new Aluguel[10];

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++){
            System.out.println("Aluguel #"+ i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String emeil = sc.nextLine();
            System.out.print("Numero aluguel: ");
            int nAluguel = sc.nextInt();

            vet[nAluguel] = new Aluguel(nome, emeil);

        }

        for (int i = 0; i < 10; i++){
            if (vet[i] != null){
                System.out.printf(String.valueOf(i + ": " + vet[i]));
            }
        }

        sc.close();

    }
}
