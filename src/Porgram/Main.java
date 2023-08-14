package Porgram;

import Employee.Entities;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Entities ent = new Entities();

        System.out.println("Enter rectangle width and height: ");


        ent.width = sc.nextDouble();
        ent.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", ent.area());
        System.out.printf("PERIMETER = %.2f%n", ent.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", ent.diagonal());
        sc.close();
    }


}

