package ro.sci.carrental.Domain.domain.payment;

/**
 * Created by iulia on 6/20/2017.
 */
public class Transaction {
    private int transactionNo;
    private String paymentDate;
    private PaymentMethod paymentMethod;
    private double amount;

    public Transaction(int transactionNo, String paymentDate) {
        this.transactionNo = transactionNo;
        this.paymentDate = paymentDate;
    }

    public int getTransactionNo() {return transactionNo;}
    public void setTransactionNo() {this.transactionNo = transactionNo;}

    public String getPaymentDate() {return paymentDate;}
    public void setPaymentDate() {this.paymentDate = paymentDate;}

    public PaymentMethod getPaymentMethod() {return paymentMethod;}
    public void setPaymentMethod() {this.paymentMethod = paymentMethod;}

    public double getAmount() {return amount;}
    public void setAmount() {this.amount = amount;}
}