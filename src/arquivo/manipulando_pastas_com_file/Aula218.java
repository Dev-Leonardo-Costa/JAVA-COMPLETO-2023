package arquivo.manipulando_pastas_com_file;

import java.io.File;
import java.util.Scanner;

public class Aula218 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do diretorio: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] diretorios = path.listFiles(File::isDirectory);
        System.out.println("Pastas: ");
        for (File files : diretorios){
            System.out.println(files);
        }

        File[] arquivos = path.listFiles(File::isFile);
        System.out.println("Arquivos: ");
        for (File files : arquivos){
            System.out.println(files);
        }

        boolean sucesso = new File(strPath + "\\feito").mkdir();
        System.out.println("Diretorio criado!!" + sucesso);
    }
}
