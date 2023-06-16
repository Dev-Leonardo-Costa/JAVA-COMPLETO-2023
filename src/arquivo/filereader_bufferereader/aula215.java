package arquivo.filereader_bufferereader;

import java.io.*;

public class aula215 {
    public static void main(String[] args) {

        String path = "C:\\Users\\Elisane\\Downloads\\Curso-Java-Nélio-Alves-2023\\in.txtf";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {

                if (br != null) {
                    br.close();
                }

                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
