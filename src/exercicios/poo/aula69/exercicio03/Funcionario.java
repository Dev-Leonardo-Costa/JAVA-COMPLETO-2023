package exercicios.poo.aula69.exercicio03;

public class Funcionario {

    private String nome;
    private double salario;
    private double taxa;

    private double porcentagem;

    public double salarioLiquido() {
        return salario - taxa;
    }

    public void aumentarSalario(double porcentagem) {
        salario += salario * porcentagem / 100.0;
    }

    public String toString() {
        return "Nome: " + nome
                + String.format(" R$%.2f", salarioLiquido());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
