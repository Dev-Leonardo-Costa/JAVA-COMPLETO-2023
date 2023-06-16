package interfaces.solucaos.model.service;

import interfaces.solucaos.model.entities.CarRental;
import interfaces.solucaos.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;
    private TaxService service;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService service) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.service = service;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxService getService() {
        return service;
    }

    public void setService(BrazilTaxService service) {
        this.service = service;
    }

    public void processsInvoice(CarRental carRental) {

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = service.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));

    }
}
