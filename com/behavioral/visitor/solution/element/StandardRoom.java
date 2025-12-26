package com.behavioral.visitor.solution.element;

import com.behavioral.visitor.solution.visitor.IRoomVisitor;

// Concrete Element - Different room types
public class StandardRoom implements IRoom {
    private final String roomNumber;

    public StandardRoom(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void accept(IRoomVisitor visitor) {
        visitor.visitStandardRoom(this);
    }

    public String getRoomNumber() {
        return roomNumber;
    }

}
