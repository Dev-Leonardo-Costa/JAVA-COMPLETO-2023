package sintaxe_opcional;

import java.util.Scanner;

public class Aula38 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite valor doa dia: ");
        int expressao = sc.nextInt();
        String dia;

        switch (expressao) {
            case 1:
                dia = "domingo";
                break;

            case 2:
                dia = "Segunda";
                break;

            case 3:
                dia = "Terça";
                break;

            case 4:
                dia = "Quarta";
                break;

            case 5:
                dia = "Quinta";
                break;

            case 6:
                dia = "Sexta";
                break;

            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Valor invalido";
                break;
        }
        System.out.println("Dia da semana:" + dia);

        // Mesma que podemos fazer é usar condicional

        System.out.println("Informe o outro dia");
        int y = sc.nextInt();
        if (y == 1) {
            dia = "Domingo";
        } else if (y == 2) {
            dia = "Segunda";
        } else if (y == 3) {
            dia = "Terça";
        } else if (y == 4) {
            dia = "Quarta";
        } else if (y == 5) {
            dia = "Quinta";
        } else if (y == 6) {
            dia = "Sexta";
        } else if (y == 7) {
            dia = "Sabado";
        } else {
            System.out.println("Numero invalido");
        }

        System.out.println("Dia da semana: " + dia);
    }
}
