import java.util.Scanner;

public class OtherCalculator {
        public static void main(String args[]) {
            do{
                Scanner typed=new Scanner(System.in);
                System.out.println("Please type: 1 for add, 2 for subtract, 3 for multiply or 4 for divide");
                int userInput=typed.nextInt();
                System.out.println("Please enter the first number to calculate:");
                double number1=typed.nextDouble();
                System.out.println("Please enter the second number to calculate:");
                double number2=typed.nextDouble();
                if (userInput==1){
                    System.out.println("The answer is");
                    double result=number1+number2;
                    System.out.println(result);
                }
                if (userInput==2){
                    System.out.println("The answer is");
                    double result=number1-number2;
                    System.out.println(result);
                }
                if (userInput==3){
                    System.out.println("The answer is");
                    double result=number1*number2;
                    System.out.println(result);
                }
                if (userInput==4){
                    System.out.println("The answer is");
                    double result=number1/number2;
                    System.out.println(result);
                }
                System.out.println("Do you want to perform another calculation? Press 1 for yes or 2 for no.");
                int pressed=typed.nextInt();

            }while(pressed==1);

        }
    }


