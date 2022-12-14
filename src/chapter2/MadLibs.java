package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] arg){

        //1. Get the number of hours worked.
        System.out.println("Enter a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        //2.Get the hourly pay rate.
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        //3. Multiply hours worked and pay rate.
        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();

        //4. Display results.
        System.out.println("On a " + adjective + "" + season + " day, I drink a minimum of "+ number+ " cups of coffee");
        scanner.close();
    }
}
