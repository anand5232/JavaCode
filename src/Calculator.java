import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        char operator;
        Double num1,num2,result;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose operator +, -, * or /");
        operator = input.next().charAt(0);

        System.out.println("Enter First Number");
        num1= input.nextDouble();

        System.out.println("Enter Second Number");
        num2 = input.nextDouble();

        switch(operator){

            case '+':
                result=num1+num2;
                System.out.println("Result = "+result);
                break;
            case '-':
                result=num1-num2;
                System.out.println("Result = "+result);
                break;
            case '*':
                result=num1*num2;
                System.out.println("Result ="+result);
                break;
            case '/':
                result=num1/num2;
                System.out.println("Result = "+result);
                break;
            default:
                System.out.println("You Choose Invalid Operator ");
                break;


        }
    }
}
