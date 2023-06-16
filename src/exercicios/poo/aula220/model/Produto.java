package exercicios.poo.aula220.model;

public class Produto {

    private String nome;
    private double valor;
    private int qdt;

    public Produto(){}

    public Produto(String nome, double valor, int qdt) {
        this.nome = nome;
        this.valor = valor;
        this.qdt = qdt;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQdt() {
        return qdt;
    }

    public void setQdt(int qdt) {
        this.qdt = qdt;
    }
    public double subTotal(){
        return valor = valor * qdt;
    }

    @Override
    public String toString() {
        return nome +","
                + String.format("%.2f", valor) +","+ qdt;
    }
}

