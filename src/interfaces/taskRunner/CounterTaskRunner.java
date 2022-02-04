package src.interfaces.taskRunner;

import src.interfaces.container.Container;
import src.interfaces.tasks.AbstractTask;
import src.interfaces.tasks.Task;

public class CounterTaskRunner implements TaskRunner {
    private Container container;
    private int counter;

    public CounterTaskRunner(Container container) {
        this.container = container;
    }

    @Override
    public void addTask(Task task) {
        container.push(task);
    }

    @Override
    public void executeAll() {
        System.out.println("Start executing task...");
        while (!container.isEmpty()) {
            Task taskToExecution = container.pop().get();
            taskToExecution.execute();
            afterExecution(taskToExecution);
        }
        System.out.println("Done!");
    }

    @Override
    public void afterExecution(Task task) {
        counter++;
    }

    public int getCounter() {
        return counter;
    }


}
