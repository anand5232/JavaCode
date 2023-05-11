import java.util.Scanner;

public class CalculatorByMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

         int value;

            System.out.println("Calculator Using Methods");
            System.out.println("Choose One Options: ");
            System.out.println(" 1. Addition ");
            System.out.println("2. Substraction ");
            System.out.println("3. Division ");
            System.out.println("4. Multiplication ");

            int choice = input.nextInt();
            System.out.println();

            if (choice == 1) {
                addition();
            } else if (choice == 2) {
                substraction();
            } else if (choice == 3) {
                division();
            } else if (choice == 4) {
                multiplication();
            }
            System.out.println();


            System.out.println(" Do You want to do More Operation Press 1 for Yes or Press 2 for No");
            value = input.nextInt();

    }



    public static void addition() {
        int num1, num2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Addition");

        System.out.println("Enter First Number");
        num1 = input.nextInt();
        System.out.println("Enter Second Number");
        num2 = input.nextInt();
        result = num1 + num2;
        input.close();
        System.out.println(" Sum = " + result);
    }

    public static void substraction() {
        int num1, num2, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Substraction ");
        System.out.println("Enter First Number");
        num1 = input.nextInt();
        System.out.println("Enter Second Number");
        num2 = input.nextInt();
        result = num2 - num1;
        input.close();
        System.out.println("Result = " + result);
    }

    public static void division() {
        int num1, num2, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Division");
        System.out.println("Enter first Number");
        num1 = input.nextInt();
        System.out.println("Enter the second number");
        num2 = input.nextInt();

        result = num2 / num1;
        input.close();
        System.out.println("Result = " + result);
    }

    public  static void multiplication() {
        int num1, num2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplication");
        System.out.println("Enter the First Number");
        num1 = input.nextInt();
        System.out.println("Enter the Second Number");
        num2 = input.nextInt();
        result = num1 * num2;
        input.close();
        System.out.println("Result = " + result);
    }





    }

