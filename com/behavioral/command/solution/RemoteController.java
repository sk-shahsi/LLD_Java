package com.behavioral.command.solution;

// Invoker - with undo functionality

import java.util.Stack;

public class RemoteController {
    ICommand command; // Holds reference to the command
    Stack<ICommand> commandHistory = new Stack<>();

    RemoteController() {
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandHistory.push(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            ICommand lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }

}
