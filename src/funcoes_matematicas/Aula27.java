package funcoes_matematicas;

public class Aula27 {

    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a, b, c;

        //Para saber a raiz quadrada
        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + a);
        System.out.println("Raiz quadrada de " + y + " = " + b);
        System.out.println("Raiz quadrada de 25 = " + c);

        //Para saber a pontecia
        a = Math.pow(x, y);
        b = Math.pow(x, 2.0);
        c = Math.pow(5.0, 2.0);
        System.out.println(x + " Elevado ao quadrado " + y + " = " + a);
        System.out.println(x + "Elevado ao quadrado " + x + " = " + b);
        System.out.println("5 Elevado ao quadrado " + c);

        // Para saber o valor absoluto
        a = Math.abs(y);
        b = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + a);
        System.out.println("Valor absoluto de " + z + " = " + b);

    }
}
