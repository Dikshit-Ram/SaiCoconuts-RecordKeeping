package org.saicoconuts.records.bo;

import org.saicoconuts.records.dao.TransactionRepository;
import org.saicoconuts.records.entity.Consumer;
import org.saicoconuts.records.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TransactionBOImpl implements TransactionBO {

    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionBOImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public boolean saveOrUpdateTransaction(final Set<Transaction> transactions) {
        return !transactionRepository.saveAll(transactions).isEmpty();
    }

    @Override
    public boolean deleteTransactions(final Set<Transaction> transactions) {
        transactionRepository.deleteAll(transactions);
        return true;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public List<Transaction> getTransactionsByConsumer(final Consumer consumer) {
        return transactionRepository.findAllByConsumer(consumer);
    }
}
