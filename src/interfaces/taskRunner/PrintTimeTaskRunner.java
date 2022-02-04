package src.interfaces.taskRunner;

import src.interfaces.container.Container;
import src.interfaces.tasks.AbstractTask;
import src.interfaces.tasks.Task;

import java.util.ArrayList;
import java.util.List;

public class PrintTimeTaskRunner implements TaskRunner {
    private Container container;

    public PrintTimeTaskRunner(Container container) {
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
            Task taskToExecution = container.pop().get();//extrace cite un task din container prin intermediu metodei .pop()
            taskToExecution.execute();// apeleaza metoda .execute() pe el
            afterExecution(taskToExecution);//apeleaza metoda .afterExecute() , de mai jos
        }

    }

    @Override
    public void afterExecution(Task task) {
        task.printCreateAt();
        task.printExecuteAt();
    }


}
