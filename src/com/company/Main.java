package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposite(20000);
        while(true){
            try{
                System.out.println("ваш баланс:" + bankAccount.getAmount());
                bankAccount.withDraw(6000);
            }catch (LimitException s){
                System.out.println(s.getMessage());
           try {
               bankAccount.withDraw((int) bankAccount.getAmount());
               System.out.println("Ваш баланс:" + bankAccount.getAmount());
           }catch (LimitException limitException){
               limitException.printStackTrace();
           }
           break;
            }
        }
            }
        }