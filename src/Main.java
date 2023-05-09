import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String name,lastname;
        int phonenumber;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name");
        name = s.nextLine();
        System.out.println("Enter Last Name");
        lastname = s.nextLine();
        System.out.println("Enter Phone Number");
        phonenumber = s.nextInt();

    }
}