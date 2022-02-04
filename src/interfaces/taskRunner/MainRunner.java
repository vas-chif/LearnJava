package src.interfaces.taskRunner;

import src.interfaces.container.Container;
import src.interfaces.container.Stack;
import src.interfaces.tasks.CounterOutTask;
import src.interfaces.tasks.OutTask;
import src.interfaces.tasks.RandomOutTask;

public class MainRunner {
    public static void main(String[] args) {
        Container stack = new Stack();
        stack.push(new OutTask("Hi!"));
        stack.push(new RandomOutTask());
        stack.push(new CounterOutTask());
        System.out.println(stack + "\n ---");

        PrintTimeTaskRunner runner = new PrintTimeTaskRunner(stack);
        runner.addTask(new OutTask("Bye!"));
        System.out.println(stack + "\n ---");

        runner.executeAll();
        System.out.println("---\n" + stack);
    }
}
