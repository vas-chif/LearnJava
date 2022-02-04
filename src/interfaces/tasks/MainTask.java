package src.interfaces.tasks;

import java.util.ArrayList;
import java.util.List;

public class MainTask {

    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();
        tasks.add(new OutTask("This is first to run!"));
        tasks.add(new RandomOutTask());
        tasks.add(new CounterOutTask());
        tasks.add(new OutTask("This is second to run!!"));
        tasks.add(new CounterOutTask());
        tasks.add(new RandomOutTask());
        tasks.add(new CounterOutTask());

        for (Task task:tasks){
            task.execute();
        }
    }
}
