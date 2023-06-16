package arquivo.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class aula216 {
    public static void main(String[] args) {

        String path = "C:\\Users\\Elisane\\Downloads\\Curso-Java-Nélio-Alves-2023\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
