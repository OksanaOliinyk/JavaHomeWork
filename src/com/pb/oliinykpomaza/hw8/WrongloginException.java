package com.pb.oliinykpomaza.hw8;

 public class WrongloginException extends Exception {
    private String detail;

    public void WrongLoginException() {
        detail = "Incorrect login";
    }

    public void WrongLoginException(String message) {

        detail = message;
    }

    @Override
    public String toString() {
        return "WrongLoginException: " + detail;
    }
}

