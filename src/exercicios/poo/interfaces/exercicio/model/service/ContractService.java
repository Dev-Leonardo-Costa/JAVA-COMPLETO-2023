package exercicios.poo.interfaces.exercicio.model.service;

import exercicios.poo.interfaces.exercicio.model.entities.Contract;
import exercicios.poo.interfaces.exercicio.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService service;

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }

    public void processContract(Contract contract, int months) {

        double basicQuata = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = service.interest(basicQuata, i);
            double fee = service.paymentFee(basicQuata + interest);
            double quota = basicQuata + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));

        }
    }
}
