package operators;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Num: ");
        float num1 = sc.nextInt();
        System.out.print("Enter second Num: ");
        float num2 = sc.nextInt();

        double add = num1 + num2;
        float sub = Math.abs(num1-num2);
        double mult = num1 * num2;
        float div = num1 / num2;
        float mod = num1 % num2;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);
    }
}
