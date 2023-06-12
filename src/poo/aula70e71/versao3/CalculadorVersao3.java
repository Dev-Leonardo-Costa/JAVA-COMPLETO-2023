package poo.aula70e71.versao3;

public class CalculadorVersao3 {
    public static final double PI = Math.PI;

    public static double circuferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public static double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
