// File: Assignment5/Easy/SumOfIntegers.java
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");

        int sum = 0;
        for (String part : parts) {
            try {
                int number = Integer.parseInt(part); // Autoboxing happens here
                numbers.add(number);
                sum += number; // Unboxing here
            } catch (NumberFormatException e) {
                System.out.println("Invalid input detected: " + part + " (skipping)");
            }
        }

        System.out.println("Sum of numbers: " + sum);
        scanner.close();
    }
}
