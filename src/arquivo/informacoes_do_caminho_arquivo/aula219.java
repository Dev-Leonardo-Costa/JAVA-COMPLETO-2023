package arquivo.informacoes_do_caminho_arquivo;

import java.io.File;
import java.util.Scanner;

public class aula219 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do diretorio: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("Nome: " + path.getName());
        System.out.println("Caminho: " + path.getParent());
        System.out.println("Path: " + path.getPath());

    }
}
