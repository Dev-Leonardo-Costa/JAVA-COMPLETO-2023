package heranca.upcasting_dowcasting.entities;

public class Aula157 {
    public static void main(String[] args) {


        Conta conta1 = new Conta(1001,"leo", 0.0);
        ContaNegocio contaNegocio1 = new ContaNegocio(1002,"Elis",0.0,0.02);

        // Upcasting
        Conta conta2 = contaNegocio1;
        Conta conta3 = new ContaNegocio(1003,"Chico",0.0,0.5);
        Conta conta4 = new ContaPoupanca(1004,"Jose",0.0,0.09);

        //Dowcasting
        ContaNegocio conta5 = (ContaNegocio) conta3;
        conta5.emprestimo(100.0);

        if (conta3 instanceof ContaNegocio){
            ContaNegocio conta6 = (ContaNegocio) conta3;
            conta6.emprestimo(100.0);
            System.out.println("Emprestado!");
        }

        if (conta3 instanceof ContaPoupanca){
            ContaPoupanca contaPoupanca = (ContaPoupanca) conta4;
            contaPoupanca.atualizarSaldo();
            System.out.println("Atualizada!");
        }

    }
}
