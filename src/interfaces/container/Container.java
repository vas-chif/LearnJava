package src.interfaces.container;

import src.interfaces.tasks.Task;

import java.util.Optional;

                                 // Need two tipe of container Stack and Queue
public interface Container {
                                 //creat Task pop and import them src.interfaces.tasks.Task;
   Optional<Task> pop();

                                //created method push that receives a Task as an argument
    void push(Task task);

                                // size container
    int size();

    boolean isEmpty();

    default void transferForm(Container container) {
                                                    //if (container.isEmpty())
        while (!container.isEmpty()) {              // atita timp cit  container nu este gol
            push(container.pop().get());            // scot cite un element si il pun in containerul curent(tasks) =push(container)
                                                    //pentru fiecare element scos il citesc si il scterg cu metoda .pop = container.pop()
        }
    }
}
