package src.interfaces.tasks;

import java.util.Random;

public class RandomOutTask extends AbstractTask implements Task {


    private int randomNumber;

    public RandomOutTask() {
        Random rd = new Random();
        this.randomNumber = rd.nextInt(100);
        /* p/u a nu se repeta codul a fost scris in Class AbstractTask
        this.id = "5301f1ef-cf00-421e-8a2e-29acbf96787e";
        this.createdAT = LocalDateTime.now(); */
    }

   /* @Override // p/u a nu se repeta codul a fost scris in Class AbstractTask
    public void execute() {
        this.executedAt = LocalDateTime.now();
        System.out.println(this);
    } */

    @Override
    public String toString() {
        return "RandomOutTask{" +
                "randomNumber=" + randomNumber +
                '}';
    }
}
