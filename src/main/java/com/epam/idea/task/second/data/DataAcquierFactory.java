package com.epam.idea.task.second.data;

public class DataAcquierFactory {
    public static DataAcquier createDataAcquier (String type) {
        switch (type) {
            case "console":
                return new ConsoleDataAcquier();
            default:
                throw new IllegalArgumentException("Unknown type" + type);
        }
    }
}
