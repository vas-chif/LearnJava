package src.interfaces.taskRunner;

import src.interfaces.tasks.Task;

public interface TaskRunner {
    void addTask(Task task);
    void executeAll();
    void afterExecution(Task task);
}
