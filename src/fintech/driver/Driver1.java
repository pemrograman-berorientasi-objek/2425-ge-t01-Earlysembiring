package fintech.driver;

import java.util.Scanner;

/**
 * Penulis: 12S23018 Early Sembiring
 * Penulis: 12S23032 Seprian Siagian
 */
public class Driver1 {

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);

      
        String command = scanner.nextLine();
        String owner = scanner.nextLine();
        String accountName = scanner.nextLine();

       
        if ("create-account".equals(command)) {
           
            double balance = 0.0;

           
            System.out.println(accountName + "|" + owner + "|" + balance);
        } else {
            System.out.println("Perintah tidak dikenal.");
        }

        scanner.close();
    }
}