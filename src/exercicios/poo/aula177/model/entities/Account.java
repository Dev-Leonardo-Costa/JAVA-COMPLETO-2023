package exercicios.poo.aula177.model.entities;

import excecao.excecoes_personalizada_solucao_03_boa.model.Exception.DomainException;

public class Account {

    private int number;
    private String holder;
    private Double balance;
    private Double withdrowLimit;

    public Account(int number, String holder, Double balance, Double withdrowLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrowLimit = withdrowLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrowLimit() {
        return withdrowLimit;
    }

    public void setWithdrowLimit(Double withdrowLimit) {
        this.withdrowLimit = withdrowLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    public void validateWithdraw(double amount) {
        if (amount > getWithdrowLimit()) {
            throw new DomainException("Erro de saque: quantia excede o valor!");
        }

        if (amount > getBalance()) {
            throw new DomainException("Error, Saldo insuficiente!");
        }
    }

    @Override
    public String toString() {
        return "Account " +
                "number=" + number +
                ", holder=' " + holder + '\'' +
                ", balance= " + balance +
                ", withdrowLimit= " + withdrowLimit +
                ' ';
    }
}
