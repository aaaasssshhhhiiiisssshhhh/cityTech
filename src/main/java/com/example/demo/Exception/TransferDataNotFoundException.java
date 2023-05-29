package com.example.demo.Exception;

public class TransferDataNotFoundException extends RuntimeException {
    private final String reason;

    public TransferDataNotFoundException(String reason) {
        super(reason);
        this.reason = reason;
    }
    public String getReason (){
        return reason;
    }
}
