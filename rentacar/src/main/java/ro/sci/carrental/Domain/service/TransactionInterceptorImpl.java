package ro.sci.carrental.Domain.service;

import ro.sci.carrental.Domain.domain.Payment.Transaction;

import java.util.List;

/**
 * Created by iulia on 6/20/2017.
 */
public class TransactionInterceptorImpl implements TransactionInterceptor<Transaction> {
    public List<Transaction> findAll(Transaction transactions) {return null;}

    public List<Transaction> findByTransactionNo(int transactionNo) {return null;}
}
