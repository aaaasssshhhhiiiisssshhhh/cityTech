package com.example.demo.ServiceImpl;

import com.example.demo.Entity.Transaction;
import com.example.demo.Exception.TransferCannotBeNullException;
import com.example.demo.Interface.Transfer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferService {
    private final Transfer transfer;

    public TransferService(Transfer transfer) {
        this.transfer = transfer;
    }

    public Transaction addTransfer (Transaction transaction){
        if (transaction == null){
            throw new TransferCannotBeNullException("transfer value is null");
        }
        return transfer.save(transaction);
    }
    public List<Transaction> getTransaction(){
        return transfer.findAll();
    }
}
