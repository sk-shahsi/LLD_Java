package com.behavioral.state.context;

import com.behavioral.state.vendingmachinestates.Coin;
import com.behavioral.state.vendingmachinestates.State;
import com.behavioral.state.vendingmachinestates.impl.DispenseState;
import com.behavioral.state.vendingmachinestates.impl.HasMoneyState;
import com.behavioral.state.vendingmachinestates.impl.IdleState;
import com.behavioral.state.vendingmachinestates.impl.SelectionState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine(){
        vendingMachineState = new State();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(HasMoneyState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public void setVendingMachineState(DispenseState dispenseState) {
    }

    public void setVendingMachineState(SelectionState selectionState) {
    }

    public void setVendingMachineState(IdleState idleState) {
    }
}
