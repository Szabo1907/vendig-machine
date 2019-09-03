package com.sda.vendingmachine.bank;

import lombok.Data;

import java.util.Queue;
@Data

public class Bank {


    //STACK -LIFO-LAST IN FIRST OUT
    //QUEVE - FIRST IN FIRST OUT

    private Queue<Coin> pennyStack;
    private Queue<Coin> nickeStack;
    private Queue<Coin> dimeStack;
    private Queue<Coin> halfStack;
    private Queue<Coin> quarterStack;
    private Queue<Coin> oneDollarStack;

    @Override
    public String toString() {
        return "monede de 1 dolar : " + oneDollarStack.size() +
                "monede de 1 dolar : " + dimeStack.size() +
                "monede de 1 dolar : " + pennyStack.size() +
                "monede de 1 dolar : " + nickeStack.size() +
                "monede de 1 dolar : " + halfStack.size() +
                "monede de 1 dolar : " + oneDollarStack.size();
    }
}
