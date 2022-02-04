package src.interfaces.tasks;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class AbstractTask implements Task {
    protected String id;
    protected LocalDateTime createdAT;
    protected LocalDateTime executedAt;

    protected AbstractTask() {
        /*pentru a usura citirea codului logica de initialiazare a tascului am mutato  in interiorul classei
        AbstractTask deaoarece este comuna p/u toate taskurile */
        id = UUID.randomUUID().toString();
        createdAT = LocalDateTime.now();
    }
    @Override
    public void execute() {
         /*pentru a usura citirea codului metoda execute am mutato in classa AbstractTask si am implementat
         ITask , am lasta partial metoda execute in CounterOutTask deoarece trebue sa incrementeze nr. de fiecare
          data ce sa executa */
        this.executedAt = LocalDateTime.now();
        System.out.println(this);
    }

    @Override
    public void printCreateAt() {
        System.out.println("Task created at : " + createdAT);
    }

    @Override
    public void printExecuteAt() {
        System.out.println("Task executed at : " + executedAt);
    }

    @Override
    public String toString() {
        return String.format("[id = %s, created at = %s, executed at = %s]", id, createdAT, executedAt);
    }
}
