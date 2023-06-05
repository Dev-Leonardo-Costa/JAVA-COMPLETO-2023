package exercicios.aula28;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
     hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
     decimais.*/
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner digitado = new Scanner(System.in);
        int numero;
        double horasTrabalhadas, valorDaHora, salario;

        System.out.println("Digite o Numero:");
        numero = digitado.nextInt();

        System.out.println("Digite As Horas Trabalhadas:");
        horasTrabalhadas = digitado.nextDouble();

        System.out.println("Digite o Valor da Hora:");
        valorDaHora = digitado.nextDouble();

        salario = (horasTrabalhadas * valorDaHora);

        System.out.printf("Number = %d%nSalary = R$%.2f%n", numero, salario);
    }

}
