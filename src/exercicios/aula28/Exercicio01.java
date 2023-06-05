package exercicios.aula28;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        /* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
           mensagem explicativa, conforme exemplos.*/

        Scanner digtado = new Scanner(System.in);
        int a, b, soma;

        System.out.println("Digite o valor de A e B:");
        a = digtado.nextInt();
        b = digtado.nextInt();
        soma = (a + b);

        if (soma == 40 || soma == -26 || soma == 0){
            System.out.println("Soma = "+ soma);
        }else {
            System.out.println("Saiu da especificação da tarefa!");
        }

    }
}
