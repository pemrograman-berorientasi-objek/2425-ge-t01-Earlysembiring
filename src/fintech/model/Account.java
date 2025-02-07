package fintech.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 12S23018_Early
 * @author 12S23032_Seprian
 */
public class Account {
    private String akun_id;
    private String akun_nama;
    private double balance;
    private List<Transaksi> transaksi; 

    public Account(String akun_id, String akun_nama, double balance) {
        this.akun_id = akun_id;
        this.akun_nama = akun_nama;
        this.balance = balance;
        this.transaksi = new ArrayList<>();
    }

    public String getakun_id() {return akun_id;}

    public void setakun_id(String akun_id) {this.akun_id = akun_id;}

    public String getakun_nama() {return akun_nama;}

    public void setakun_nama(String akun_nama) {this.akun_nama = akun_nama;}

    public double getBalance() {return balance;}

    public void setBalance(double balance) {this.balance = balance;}

    public List<Transaksi> getTransaksi() {return transaksi;}

    public void addTransaksi(Transaksi transaksi) {
        this.transaksi.add(transaksi);
        this.balance += transaksi.getAmount(); 
    }

    @Override
    public String toString() {
        return "Account{" + "akun_id='" + akun_id + '\'' + ", akun_nama='" + akun_nama + '\'' + ", balance=" + balance + ", transaksi =" + transaksi + '}';
    }
}