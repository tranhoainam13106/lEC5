package Lec5_Excercise;
import java.util.Scanner;
public class Ex2_MultiplicationTable { 
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number from 2 to 9 to print its multiplication table: ");
            int number = scanner.nextInt();
            System.out.println("Multiplication Table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}