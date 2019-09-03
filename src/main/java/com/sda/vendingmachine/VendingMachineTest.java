package com.sda.vendingmachine;

import com.sda.vendingmachine.bank.Bank;
import com.sda.vendingmachine.bank.Coin;
import com.sda.vendingmachine.implementation.VendingMachinelmpl;
import com.sda.vendingmachine.storage.Item;
import com.sda.vendingmachine.storage.VendingStorige;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class VendingMachineTest {

    public static void main(String[] args) {
        Item heidiChocolate = new Item(1, "Ciocolata Heidi", BigDecimal.valueOf(5));
        Item mineralWater = new Item(2, "Mineral Water", BigDecimal.valueOf(7));
        Item cocaCola = new Item(3, "CocaCola", BigDecimal.valueOf(10));

        Queue<Item>chocolateItemqQueue = new ArrayDeque<Item>();

        chocolateItemqQueue.add( heidiChocolate);
        chocolateItemqQueue.add(heidiChocolate);
        chocolateItemqQueue.add( heidiChocolate);


        Queue<Item>watherItemqQueue = new ArrayDeque<Item>();
        watherItemqQueue.add(mineralWater);

        Queue<Item>colaItemqQueue = new ArrayDeque<Item>();
        colaItemqQueue.add(cocaCola);

        Map<Integer, Queue<Item>> storageMap= new HashMap<>();
        storageMap.put(22, chocolateItemqQueue);
        storageMap.put(23, watherItemqQueue);
        storageMap.put(24, colaItemqQueue);

        VendingStorige vendingStorage = new VendingStorige(storageMap);
        System.out.println(vendingStorage);

        Bank bank = new Bank();
        Queue<Coin> oneDollars = new ArrayDeque<>();
        oneDollars.add(Coin.ONE_DOLLAR);
        oneDollars.add(Coin.ONE_DOLLAR);
        oneDollars.add(Coin.ONE_DOLLAR);

        Queue<Coin> dimes = new ArrayDeque<>();
        dimes.add(Coin.DIME);

        Queue<Coin> halfs = new ArrayDeque<>();
        halfs.add(Coin.HALF);
        halfs.add(Coin.HALF);

        Queue<Coin> penny = new ArrayDeque<>();
        penny.add(Coin.PENNY);
        penny.add(Coin.PENNY);
        penny.add(Coin.PENNY);

        bank.setOneDollarStack(oneDollars);
        bank.setDimeStack(dimes);
        bank.setHalfStack(halfs);
        bank.setPennyStack(penny);
        bank.setQuarterStack(new ArrayDeque<>());
        bank.setNickeStack(new ArrayDeque<>());

        System.out.println(bank);

        VendingMachinelmpl iVendingMachine = new VendingMachinelmpl();
        iVendingMachine.setStorige(vendingStorage);
        iVendingMachine.setBank(bank);

        System.out.println("Produsul este: "   + iVendingMachine.getItem(22));
        System.out.println(vendingStorage);

        iVendingMachine.getItem(30);
      //  iVendingMachine.getItem(25);

       // Queue<Coin> wallet1= new ArrayDeque<>();
      //  wallet1.add(Coin)












    }
}
