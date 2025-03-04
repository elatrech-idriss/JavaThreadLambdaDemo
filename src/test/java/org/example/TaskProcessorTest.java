package org.example;

import org.junit.Test;

public class TaskProcessorTest {
    @Test
    public void testExecuteTask() {
        TaskProcessor processor = new TaskProcessor();
        processor.executeTask();
        // Pas d'assertion ici, on vérifie juste que la méthode tourne sans erreur.
    }
}