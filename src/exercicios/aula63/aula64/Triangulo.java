package exercicios.aula63.aula64;

public class Triangulo {
    private static double a;
    private static double b;
    private static double c;

    public double calcularArea() {
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
