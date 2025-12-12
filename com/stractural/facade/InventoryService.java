package com.stractural.facade;
//  Subsystem A: Inventory
public class InventoryService {
    public boolean checkStock(String productId){
        System.out.println("Checking stock for product"+productId);
        return true;
//        assuming it's always in stock
    }
}
