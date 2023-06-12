package poo.aula66;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;


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

    public Produto() {
    }

    public void qtdEmEstoque(Produto produto){
        System.out.println("Quantidade em Estoque");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
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
