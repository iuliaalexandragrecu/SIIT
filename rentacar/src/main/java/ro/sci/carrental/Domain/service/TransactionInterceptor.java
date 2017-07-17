package ro.sci.carrental.Domain.service;

import ro.sci.carrental.Domain.domain.customer.Transaction;

import java.util.List;

/**
 * Created by iulia on 6/20/2017.
 */
public interface TransactionInterceptor<Transaction> {
    /**
     * Find all transactions
     * @return List <Transaction>
     */
    List<Transaction> findAll (Transaction transactions);

    /**
     * Find transaction by transaction number
     * @return List <Transaction>
     */
    List<Transaction> findByTransactionNo (int transactionNo);
}
