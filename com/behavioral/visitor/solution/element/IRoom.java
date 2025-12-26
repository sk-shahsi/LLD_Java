package com.behavioral.visitor.solution.element;

import com.behavioral.visitor.solution.visitor.IRoomVisitor;

// Element interface - represents rooms(elements) that can be visited
public interface IRoom {
    void accept(IRoomVisitor visitor);

}
