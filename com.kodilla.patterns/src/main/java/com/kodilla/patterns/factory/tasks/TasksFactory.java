package com.kodilla.patterns.factory.tasks;

public final class TasksFactory {
    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String DrivingTask = "DrivingTask";

    public final Task makeTask(final String taskName) {
        switch (taskName) {
            case (ShoppingTask):
                return new ShoppingTask("Grocery","Milk",2.0);
            case PaintingTask:
                return new PaintingTask("Paint balcony","blue","balcony walls");
            case DrivingTask:
                return new DrivingTask("To school","school","bus");
            default:
                return null;

        }
    }
}
