import jdk.swing.interop.SwingInterOpUtils;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Never use "magic words"  like "MIY"  be as descriptive as you can so the person reading your code knows!!
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");  //"asking question...so we can imput in our termianl
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();  //small number, so use a byte for smaller stroage for faster run times
        int numberOfPayments = years * MONTHS_IN_YEARS;

        double mortgage =  principal
                            *(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        String mortgageFormatted = String.valueOf(NumberFormat.getCurrencyInstance());  //here, i am translating the output into a currency, so the user can easily read, and comprehend the price 
        System.out.println("Mortgage: " + mortgageFormatted);






    }

}
