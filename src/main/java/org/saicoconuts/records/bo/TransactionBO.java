package org.saicoconuts.records.bo;

import org.saicoconuts.records.entity.Consumer;
import org.saicoconuts.records.entity.Transaction;

import java.util.List;
import java.util.Set;

public interface TransactionBO {
    boolean saveOrUpdateTransaction(Set<Transaction> transactions);
    boolean deleteTransactions(Set<Transaction> transactions);
    List<Transaction> getAllTransactions();
    List<Transaction> getTransactionsByConsumer(Consumer consumer);
}
