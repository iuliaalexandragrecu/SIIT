package ro.sci.carrental.Domain.repository;

import ro.sci.carrental.Domain.domain.Payment.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iulia on 6/20/2017.
 */
public class TransactionRepositoryImpl implements TransactionRepository<Transaction> {

    private List<Transaction> transactions = new ArrayList<Transaction>();

    public List<Transaction> getAll() {return null;}

    public List<Transaction> getTransactionByTransactionNo() {return null;}

    public List<Transaction> getTransactionByPaymentDay() {return null;}

    public void add(Transaction transaction) {transactions.add(transaction);}

    public void addAll(Transaction transaction) {transactions.addAll(transactions);}

    public void delete(Transaction transaction) {transactions.remove(transaction);}

    public void update(Transaction transaction) {transactions.set(transactions.indexOf(transaction), transaction);}
}
