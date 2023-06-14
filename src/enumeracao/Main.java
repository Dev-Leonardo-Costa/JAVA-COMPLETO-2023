package enumeracao;

import enumeracao.enums.Status;
import enumeracao.model.Pedido;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(12, new Date(), Status.PEDENTE);

        System.out.println(pedido);

    }
}
