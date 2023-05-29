package com.example.demo.Exception;

public class TransferCannotBeNullException extends RuntimeException{

    private final String reason;

    public TransferCannotBeNullException(String reason) {
        super(reason);
        this.reason = reason;
    }
    public String getReason (){
        return reason;
    }
}
