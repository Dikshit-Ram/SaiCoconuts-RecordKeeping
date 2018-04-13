package org.saicoconuts.records.dao;

import org.saicoconuts.records.entity.Consumer;
import org.saicoconuts.records.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
    List<Transaction> findAllByConsumer(Consumer consumer);
}
