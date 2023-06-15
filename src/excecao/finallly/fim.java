package excecao.finallly;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fim {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Elisane\\Downloads\\Curso-Java-Nélio-Alves-2023\\in.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException ex){
            System.out.println("error file: "+ ex.getMessage());
        } finally {
            if (scanner != null){
                scanner.close();
            }
            System.out.println("Bloco executado");
        }
    }
}
