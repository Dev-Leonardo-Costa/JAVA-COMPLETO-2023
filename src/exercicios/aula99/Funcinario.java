package exercicios.aula99;

public class Funcinario {

    private int id;
    private String nome;
    private double salario;

    public Funcinario(int id, String nome, double saldo) {
        this.id = id;
        this.nome = nome;
        this.salario = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double aumentoSalario(double porcentagem){
        salario = salario + salario * porcentagem / 100.0;
        return porcentagem;
    }

    public String toString() {
        return "Id = "+ id +
                " Nome = " + nome +
                String.format(" Saldo = %.2f ", salario);
    }
}
