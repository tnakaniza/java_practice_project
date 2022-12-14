package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] arg){

        //1. Get the number of hours worked.
        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2.Get the hourly pay rate.
        System.out.println("Enter the employee's payrate");
        double rate = scanner.nextDouble();

        //3. Multiply hours worked and payrate.
        double grossPay = hours * rate;

        //4. Display results.
        System.out.println("The Employee's gross pay is $" + grossPay);
        scanner.close();
    }
}
