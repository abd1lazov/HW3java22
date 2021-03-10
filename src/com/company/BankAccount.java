package com.company;

public class BankAccount extends Exception {

    private double amount;

    public void deposite(double sum) {
        amount += sum;
    }

    public double getAmount() {
        return amount;
    }

    public double withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("У вас не достаточно средств", getAmount());
        }
        amount -= sum;
        System.out.println("Снимаем с баланса:" + sum);
        return amount;
    }
}



