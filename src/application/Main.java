package application;
import java.util.Scanner;

import Calculus.Calculation;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the total number of elements (Maybe the number of steps? Or the total distance?) ");
        double totalElements = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What is the number of samples (How many steps did you make? What distance did you walk?) ");
        double samples = scanner.nextDouble();
        scanner.nextLine();

        Calculation calculation = new Calculation(totalElements, samples);

        System.out.println(calculation.toString());

        
        scanner.close();
    }
}