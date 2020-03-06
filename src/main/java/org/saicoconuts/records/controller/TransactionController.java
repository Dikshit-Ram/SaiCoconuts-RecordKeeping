package org.saicoconuts.records.controller;

import org.saicoconuts.records.bo.TransactionBO;
import org.saicoconuts.records.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/transaction")
public class TransactionController
{
	private TransactionBO transactionBO;

	public TransactionController(@Autowired TransactionBO transactionBO){
		this.transactionBO = transactionBO;
	}

	@RequestMapping(method = GET)
	public ResponseEntity<?> getAllTransactions() {
		return ResponseEntity.ok().build();
	}

	@RequestMapping(value = "/create", method = POST, consumes = "application/json")
	public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction) {
		if(transactionBO.save(transaction)) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.badRequest().build();
	}
}
