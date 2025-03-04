package org.example;

public class TaskProcessor {
    public void executeTask() {
        Runnable task = () -> {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running a lambda task.");
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}