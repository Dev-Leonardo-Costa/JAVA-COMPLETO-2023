package exercicios.poo_aula69.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Nome:");
        aluno.setNome(sc.nextLine());

        System.out.print("Prova1: ");
        aluno.setP1(sc.nextDouble());

        System.out.print("Prova2: ");
        aluno.setP2(sc.nextDouble());

        System.out.print("Prova3: ");
        aluno.setP3(sc.nextDouble());

        aluno.avaliacao();

    }
}
