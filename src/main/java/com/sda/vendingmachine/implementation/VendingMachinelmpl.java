package com.sda.vendingmachine.implementation;

import com.sda.vendingmachine.bank.Bank;
import com.sda.vendingmachine.bank.Coin;
import com.sda.vendingmachine.exception.SouldOutException;
import com.sda.vendingmachine.storage.Item;
import com.sda.vendingmachine.storage.VendingStorige;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Queue;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class VendingMachinelmpl implements IVendingMachine {
    private VendingStorige storige;
    private Bank bank;

    public Item getItem(int productCode) {
        Map<Integer,Queue<Item>> myStorageMap= storige.getStorageMap();

        Queue<Item> queueByProductCode = myStorageMap.get(productCode);

        if(queueByProductCode == null || queueByProductCode.size()==0){
            throw  new SouldOutException(" the product you requested is not available");

            }else{
                return queueByProductCode.poll();
            }
    }


    public void payItem(int productCode, Queue<Coin> amountPayed) {

    }

    public void getChange(BigDecimal amountExpected, BigDecimal amountReceived) {

    }

    public void cancelRequest() {

    }

}
