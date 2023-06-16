package arquivo.filewriter_bufferedweiter;

import java.io.*;

public class aula217 {
    public static void main(String[] args) {

        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

        String path = "C:\\Users\\Elisane\\Downloads\\Curso-Java-Nélio-Alves-2023\\entrou.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
