package fintech.model;



/**
 * @author 12S23018_Early 
 * @author 12S23032_Seprian
 */
import java.util.Date;

public class Transaction {
    private String id;
    private double amount;
    private Date date;
    private String description;

    // Constructor
    public Transaction(String id, double amount, Date date, String description) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }
    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public double getAmount() {return amount;}

    public void setAmount(double amount) {this.amount = amount;}

    public Date getDate() {return date;}

    public void setDate(Date date) {this.date = date;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    @Override
    public String toString() {return "Transaction{" +"id='" + id + '\'' +", amount=" + amount +", date=" + date +", description='" + description + '\'' + '}';}
}