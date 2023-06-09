package exercicios.poo.aula164.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shape: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Shape: " + i + " data:");
            System.out.print("Rectangle or Circle (r / c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (Black/Blue/Red): ? ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Retactangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("Shape area: ");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f%n", shape.area()));
        }

        sc.close();
    }
}
