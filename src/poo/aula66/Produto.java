package poo.aula66;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public double totalEstoque() {
        double total = preco * quantidade;
        return total;
    }

    public void addProduto(int qtd) {
        this.quantidade += qtd;
    }

    public void removeProtudos(int qtd) {
        this.quantidade -= qtd;
    }

    public String toString() {
        return "Dados do Produto " + nome +
                ", R$" + String.format("%.2f", preco)
                + ", Qtd: " + quantidade
                + " Total: " + String.format("%.2f", totalEstoque());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
