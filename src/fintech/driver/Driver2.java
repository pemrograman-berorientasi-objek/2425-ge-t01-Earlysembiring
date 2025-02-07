package fintech.driver;

import fintech.model.Account;
import java.util.Scanner;

/**
 * Penulis: 12S23018 Early Sembiring
 * Penulis: 12S23032 Seprian Siagian
 */
public class Driver2 {

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input
        String command = scanner.nextLine();
        String owner = scanner.nextLine();
        String accountName = scanner.nextLine();

        // Memeriksa apakah perintah adalah "create-account"
        if ("create-account".equals(command)) {
            // Membuat akun dengan saldo awal 0.0
            double balance = 0.0;

            // Menampilkan informasi akun
            System.out.println(accountName + "|" + owner + "|" + balance);
        } else {
            System.out.println("Perintah tidak dikenal.");
        }

        scanner.close();
    }
}

