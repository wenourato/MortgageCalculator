import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Never use "magic words"  like "MIY"  be as descriptive as you can so the person reading your code knows!!
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        int principal = 0;  //we are decalring principal here, outside of the scope, so it can be accessed in other pieces of the code
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {  //infinite loop will run until the user inputs a valif principal
            System.out.print("Principal: ");  //"asking question...so we can imput in our termianl
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
                System.out.println("Enter a value between 1000 and 1000000 ");
            }
        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if(annualInterest >= 1 && annualInterest <= 30) {
                break;
            }
            System.out.println("Enter a value between 1 and 30");
            monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();  //small number, so use a byte for smaller stroage for faster run times
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEARS;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        double mortgage =  principal
                            *(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);  //here, i am translating the output into a currency, so the user can easily read, and comprehend the price
        System.out.println("Mortgage: " + mortgageFormatted);






    }

}
