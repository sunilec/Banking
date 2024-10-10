package com.sunil.service;

import com.sunil.entities.Transaction;
import com.sunil.payload.TransactionDto;

public interface TransactionService {

    void saveTransactions(TransactionDto transactionDto);
}
