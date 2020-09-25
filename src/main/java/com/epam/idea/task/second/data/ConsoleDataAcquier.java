package com.epam.idea.task.second.data;

import java.util.Scanner;

public class ConsoleDataAcquier implements DataAcquier {
    public String getName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        return name;
    }
}
