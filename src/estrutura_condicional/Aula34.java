package estrutura_condicional;

import java.util.Scanner;

/*
Estrutura condicional composta e simples
 */
public class Aula34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas Horas?");
        int horas = sc.nextInt();

        if (horas < 12) {
            System.out.println("Bom dia!");
        } else if (horas >= 12 && horas < 18) {
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }

        sc.close();
    }
}
