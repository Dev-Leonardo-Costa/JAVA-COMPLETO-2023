package poo.aula70e71.versao2;

public class Calculador {
    public final double PI = Math.PI;

    public double circuferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
