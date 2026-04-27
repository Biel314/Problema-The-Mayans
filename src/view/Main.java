package view;

import java.util.Scanner;
import controller.CtlConversor;

public class Main {

    public static void main(String[] args) {

        CtlConversor converter = new CtlConversor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Converta os valores Maias para decimal:");
        System.out.println("| * = 0 |");
        System.out.println("| . = 1 |");
        System.out.println("| - = 5 |");

        System.out.print("Digite os símbolos: ");
        String simb = scanner.nextLine();
        
        try {
            int r = converter.decimal(simb);
            System.out.println("Valor decimal: " + r);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            
        }

        scanner.close();
    }
}