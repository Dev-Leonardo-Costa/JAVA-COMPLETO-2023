package exercicios.poo.aula81.exercicio;

public class Conta {

    private String nome;
    private int numero;
    private double saldo;

    public Conta(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public Conta(String nome, int numero, double depositoIncial) {
        this.nome = nome;
        this.numero = numero;
        depositar(depositoIncial);
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo = saldo - valor - 5.00;
    }

    public String toString() {
        return "Nome = " + nome +
                " Numero = " + numero +
                String.format(" Saldo = R$%.2f", saldo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
