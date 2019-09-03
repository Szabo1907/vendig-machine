package com.sda.vendingmachine.storage;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Item {

    private int id;
    private String name;
    private BigDecimal price;

    @Override
    public String toString(){
        return  " Produsul are numele:  " +  name  +    "   si pretul   " +   price  ;


    }
}
