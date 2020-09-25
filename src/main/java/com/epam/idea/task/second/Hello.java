package com.epam.idea.task.second;

import com.epam.idea.task.second.data.DataAcquier;
import com.epam.idea.task.second.data.DataAcquierFactory;
import com.epam.idea.task.second.view.ConsoleResultPrinter;
import com.epam.idea.task.second.view.ResultPrinter;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Enter name");

        DataAcquier dataAcquier = DataAcquierFactory.createDataAcquier("console");
        String name = dataAcquier.getName();

        ResultPrinter result = new ConsoleResultPrinter();
        result.print(name);
    }
}
