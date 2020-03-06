package org.saicoconuts.records.bo;

import org.saicoconuts.records.dao.TransactionRepository;
import org.saicoconuts.records.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TransactionBOImpl implements TransactionBO
{
	private TransactionRepository transactionRepository;

	public TransactionBOImpl(@Autowired TransactionRepository transactionRepository){
		this.transactionRepository = transactionRepository;
	}

	@Override
	public boolean save(Transaction transactions)
	{
		return StringUtils.isEmpty(transactionRepository.save(transactions).getTransactionId());
	}
}
