package src.interfaces.container;

import src.interfaces.tasks.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//create a container Stack
public class Stack implements Container {
    //Create a container List
    List<Task> tasks;

    // create a constructor for started the List tasks
    public Stack() {
        this.tasks = new ArrayList<>();
    }

    // implements all method of the Container
    @Override
    public Optional<Task> pop() {// daca nu existsa elemente in tasks, va aparea eroare "IndexOutOfBoundsException" ce trebue de trat
        if (tasks.size() - 1 >= 0) {
            // scoatem taskul si il citim
            Task taskToRetrieve = tasks.get(size() - 1);//tasks.get(size()-1) = pozitia din lista tasks
            //taskul citi il stergem
            tasks.remove(tasks.size() - 1);
            //il intoarcem ca tip de return
            return Optional.of(taskToRetrieve);
        }

        return Optional.empty();
    }

    @Override
    public void push(Task task) {
        // adaugam taskul primit ca imput in metoda
        tasks.add(task);
    }

    @Override
    public int size() {
        return tasks.size();
    }

    @Override
    public boolean isEmpty() {
        return tasks.isEmpty();
    }


    @Override
    public String toString() {
        return "Stack{" +
                "tasks=" + tasks +
                '}';
    }
}
