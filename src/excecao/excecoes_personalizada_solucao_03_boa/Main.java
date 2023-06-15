package excecao.excecoes_personalizada_solucao_03_boa;

import excecao.excecoes_personalizada_solucao_03_boa.model.Exception.DomainException;
import excecao.excecoes_personalizada_solucao_03_boa.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in: (dd/MM/yyyy)");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out: (dd/MM/yyyy)");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in: (dd/MM/yyyy)");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out: (dd/MM/yyyy)");
            checkOut = sdf.parse(sc.next());

            reservation.updateDate(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException ex) {
            System.out.println("Date Invalid format");
        } catch (DomainException ex){
            System.out.println("Error in reservation!"+ ex.getMessage());
        } catch (RuntimeException ex){
            System.out.println("Unexpected error");
        }

        sc.close();

    }
}
