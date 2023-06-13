package for_foreach;

public class Aula96 {

    public static void main(String[] args) {


        String[] nomes = new String[]{"leo", "nardo", "silva"};

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        System.out.println("-----------------");
        for (String obj: nomes) {
            System.out.println(obj);
        }
    }

}
