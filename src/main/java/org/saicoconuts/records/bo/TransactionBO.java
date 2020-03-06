package org.saicoconuts.records.bo;

import org.saicoconuts.records.entity.Transaction;

public interface TransactionBO
{
	boolean save(Transaction transaction);
}
