package excecao.try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String[] vet = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vet[posicao]);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Of Bounds exception ");
        } catch (InputMismatchException ex){
            System.out.println("Valor errado");
        }

        sc.close();
    }
}
