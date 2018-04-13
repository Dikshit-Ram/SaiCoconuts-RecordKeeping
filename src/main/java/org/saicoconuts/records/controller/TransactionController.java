package org.saicoconuts.records.controller;

import org.saicoconuts.records.bo.TransactionBO;
import org.saicoconuts.records.entity.Consumer;
import org.saicoconuts.records.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping(value = "/transactions")
public class TransactionController {
    private TransactionBO transactionBO;

    @Autowired
    public TransactionController(TransactionBO transactionBO) {
        this.transactionBO = transactionBO;
    }

    @RequestMapping(method = GET)
    public ResponseEntity<?> getTransactions(@RequestBody Consumer consumer) {
        if(consumer != null)
            return new ResponseEntity<>(transactionBO.getTransactionsByConsumer(consumer), HttpStatus.OK);
        return new ResponseEntity<>(transactionBO.getAllTransactions(), HttpStatus.OK);
    }

    @RequestMapping(method = PUT)
    public ResponseEntity<?> saveTransactions(@RequestBody Set<Transaction> transactions) {
        if(transactionBO.saveOrUpdateTransaction(transactions)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @RequestMapping(method = DELETE)
    public ResponseEntity<?> deleteTransactions(@RequestBody Set<Transaction> transactions) {
        if(transactionBO.deleteTransactions(transactions)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
