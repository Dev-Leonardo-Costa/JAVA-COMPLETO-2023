package generics_set_map.generic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // cuidado com type safety quando usaro Object
        Scanner sc = new Scanner(System.in);

        PrintService service = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int value = sc.nextInt();
            service.addValue(value);
        }

        service.printt();

        System.out.println("first: "+ service.first());

        sc.close();
    }
}
