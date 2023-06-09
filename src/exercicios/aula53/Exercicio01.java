package exercicios.aula53;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 1° Numero: ");
        int x = sc.nextInt();

        for (int i = 0; i <= x; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }

}
