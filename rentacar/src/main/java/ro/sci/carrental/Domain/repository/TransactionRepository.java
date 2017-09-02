package ro.sci.carrental.Domain.repository;

import java.util.List;

/**
 * Created by iulia on 6/20/2017.
 */
public interface TransactionRepository<Transaction> {

    //getAll, get by transaction no, get by payment date, add, addall, delete, update

    /**
     * Get all transactions in the system\
     * @return List<Transaction>
     */
    List<Transaction> getAll();

    /**
     * Get transactions by transaction number
     * @return List<Transaction>
     */
    List<Transaction> getTransactionByTransactionNo();

    /**
     * Get transaction by payment day
     * @return List <Transaction>
     */

    List<Transaction> getTransactionByPaymentDay();

    /**
     * Add a transaction
     */
    void add(Transaction transaction);

    /**
     * Add all transactions
     */
    void addAll (Transaction transaction);

    /**
     * Remove a transaction
     */
    void delete (Transaction transaction);

    /**
     * Update a transaction
     */
    void update (Transaction transaction);
}
