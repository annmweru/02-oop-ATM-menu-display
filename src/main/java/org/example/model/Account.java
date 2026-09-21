package org.example.model;

public class Account {
    private double balance = 100000;
    public  String accountNumber;
    public  String ownerName;
    private int currentPin = 1994;

    public Account(){
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getOwnerName(){
        return ownerName;
  }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCurrentPin() {

        return currentPin;
    }

    public void setCurrentPin(int currentPin) {

        this.currentPin = currentPin;
    }
}
