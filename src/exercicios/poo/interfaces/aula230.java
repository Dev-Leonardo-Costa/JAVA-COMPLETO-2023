package exercicios.poo.interfaces;

import exercicios.poo.interfaces.exercicio.model.entities.Contract;
import exercicios.poo.interfaces.exercicio.model.entities.Installment;
import exercicios.poo.interfaces.exercicio.model.service.ContractService;
import exercicios.poo.interfaces.exercicio.model.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class aula230 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.print("Valor do contrato: ");
        double totalVlue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalVlue);

        System.out.print("Entre com numeros de parcelas: ");
        int parcelas = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj, parcelas);

        System.out.println("Parcelas: ");

        for (Installment installment : obj.getInstallments()){
            System.out.println(installment);
        }

    }
}
