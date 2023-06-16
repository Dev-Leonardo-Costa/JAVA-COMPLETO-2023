package interfaces.solucaos;

import interfaces.solucaos.model.entities.CarRental;
import interfaces.solucaos.model.entities.Veihcle;
import interfaces.solucaos.model.service.BrazilTaxService;
import interfaces.solucaos.model.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class aula225e226 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada: (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Retorno: (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental carRental = new CarRental(start,finish, new Veihcle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double priceperHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double priceperDay = sc.nextDouble();

        RentalService rentalService = new RentalService(priceperHour, priceperDay, new BrazilTaxService());

        rentalService.processsInvoice(carRental);

        System.out.println();
        System.out.println("Fatura: ");
        System.out.println("Pagamento basico: " + carRental.getInvoice().getBasicPayment());
        System.out.println("imposto: " + carRental.getInvoice().getTax());
        System.out.println("Pagamento total: " + carRental.getInvoice().getTotalPayment());

        sc.close();
    }
}
