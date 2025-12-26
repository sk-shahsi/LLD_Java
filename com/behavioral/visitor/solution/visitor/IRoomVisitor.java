package com.behavioral.visitor.solution.visitor;

import com.behavioral.visitor.solution.element.DeluxeRoom;
import com.behavioral.visitor.solution.element.StandardRoom;
import com.behavioral.visitor.solution.element.SuiteRoom;

// Visitor interface - defines operations
public interface IRoomVisitor {
    void visitStandardRoom(StandardRoom room);

    void visitDeluxeRoom(DeluxeRoom room);

    void visitSuiteRoom(SuiteRoom room);

}
