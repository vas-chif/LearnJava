package src.interfaces.container;

import src.interfaces.tasks.CounterOutTask;
import src.interfaces.tasks.OutTask;
import src.interfaces.tasks.RandomOutTask;
import src.interfaces.tasks.Task;

import java.util.Optional;

public class MainContainer {
    public static void main(String[] args) {
        Container queue = new Queue();
        queue.push(new OutTask("Hi!"));
        queue.push(new RandomOutTask());
        System.out.println(queue);

        Container stack = new Stack();
        stack.push(new OutTask("Bye!"));
        stack.push(new CounterOutTask());
        stack.push(new RandomOutTask());
        System.out.println(stack);

        System.out.println("\n apply method pop...");
        queue.pop();
        stack.pop();
        System.out.println(queue);
        System.out.println(stack);

        System.out.println("\nTransferring data ... ");
        stack.transferForm(queue);
        System.out.println(stack);
        System.out.println(queue);
        System.out.println("");

        Optional<Task> possibleTask = stack.pop();

        if (possibleTask.isPresent()){
            Task task = possibleTask.get();
            task.execute();
            System.out.println("----\n" + stack);
        }


    }
}
