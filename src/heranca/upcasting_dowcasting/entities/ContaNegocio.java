package heranca.upcasting_dowcasting.entities;

import heranca.upcasting_dowcasting.entities.Conta;

public class ContaNegocio extends Conta {

    private double limiteEmprestimo;

    public ContaNegocio() {
        super();
    }

    public ContaNegocio(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public ContaNegocio(Integer numero, String titular, Double saldo, double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double valorEmprestimo) {
        if (limiteEmprestimo <= valorEmprestimo) {
            saldo += valorEmprestimo - 10.0;
        }
    }
}
