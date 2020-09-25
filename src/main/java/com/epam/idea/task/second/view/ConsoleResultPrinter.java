package com.epam.idea.task.second.view;

public class ConsoleResultPrinter implements ResultPrinter {
    @Override
    public void print(String name) {
        System.out.print("Hello " + name);
    }
}
