package com.example.demo.Controller;


import com.example.demo.Entity.Transaction;
import com.example.demo.Exception.TransferDataNotFoundException;
import com.example.demo.Interface.Transfer;
import com.example.demo.ServiceImpl.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transfer")
public class TransferController {
    private final TransferService transferService;
    private final Transfer transfer;


    @Autowired
    public TransferController(TransferService transferService,
                              Transfer transfer) {
        this.transferService = transferService;
        this.transfer = transfer;
    }

    @PostMapping
    public ResponseEntity<Transaction> addTransfer (@RequestBody Transaction transaction){
        Transaction add = transferService.addTransfer(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).body(add);
    }

    @GetMapping
    public ResponseEntity<List<Transaction>>getTransaction(){
        List<Transaction> getListData = transferService.getTransaction();
        if (getListData == null){
            throw new TransferDataNotFoundException("no data was found");
        }
        return ResponseEntity.ok(getListData);
    }
}
