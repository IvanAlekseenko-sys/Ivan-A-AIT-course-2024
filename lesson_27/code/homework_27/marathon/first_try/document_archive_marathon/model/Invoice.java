package homework_27.marathon.first_try.document_archive_marathon.model;

public class Invoice extends Document{

    private double amount;

    public Invoice(int id, String author, int yearOfIssue, String name, double amount) {
        super(id, author, yearOfIssue, name);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "amount=" + amount +
                "} " + super.toString();
    }
}
