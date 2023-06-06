package exercicios.aula35;

import java.util.Scanner;

public class Exercicio04 {
    /*
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
    começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Hora Inicial e Hora Final do jogo:");
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracaoDoJogo;

        if (horaInicial < horaFinal){
            duracaoDoJogo = horaFinal - horaInicial;
        } else {
            duracaoDoJogo = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracaoDoJogo + "hs");

    }
}
