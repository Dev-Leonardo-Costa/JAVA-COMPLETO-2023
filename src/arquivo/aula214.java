package arquivo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class aula214 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Elisane\\Downloads\\Curso-Java-Nélio-Alves-2023\\in.txt");

        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException ex) {
            System.out.println("Error" + ex.getMessage());
        } finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}
