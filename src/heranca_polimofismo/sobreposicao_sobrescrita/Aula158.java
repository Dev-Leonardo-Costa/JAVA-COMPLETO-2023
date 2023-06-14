package heranca_polimofismo.sobreposicao_sobrescrita;

import heranca_polimofismo.upcasting_dowcasting.entities.Conta;
import heranca_polimofismo.upcasting_dowcasting.entities.ContaNegocio;
import heranca_polimofismo.upcasting_dowcasting.entities.ContaPoupanca;

public class Aula158 {
    public static void main(String[] args) {


        Conta conta1 = new Conta(1001, "leo", 1000.0);
        conta1.saque(200.0);
        System.out.println(conta1.getSaldo());

        Conta conta2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
        conta2.saque(200.0);
        System.out.println(conta2.getSaldo());


        Conta conta3 = new ContaNegocio(1003, "Elis", 1000.0, 500.0);
        conta3.saque(200.0);
        System.out.println(conta3.getSaldo());


    }
}
