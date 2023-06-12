package exercicios.poo_aula69.exercicio01;

public class Aluno {

    private String nome;
    private double p1;
    private double p2;
    private double p3;

    public String getNome() {
        return nome;
    }

    public double avaliacao() {
        double notaFinal = p1 + p2 + p3;
        double valorFaltante = 100.00 - notaFinal;

        if (notaFinal > 60.0) {
            System.out.printf("Final da Grade = %.2f%n", notaFinal);
            System.out.print("Aprovado!");
        } else {
            System.out.printf("Final da Grade = %.2f%n", notaFinal);
            System.out.print("\nReprovado!");
            System.out.printf("Faltou %.2f Pontos", valorFaltante);
        }

        return notaFinal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP3() {
        return p3;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }
}
