package src.interfaces.tasks;

public class CounterOutTask extends AbstractTask implements Task {

    private static int counter;

   /* public CounterOutTask() {
      //  p/u a nu se repeta codul a fost scris in Class AbstractTask

        this.id = "cac9f5cf-255d-46f1-9663-2207f1f18411";
        this.createdAT = LocalDateTime.now();
    } */

    @Override
    public void execute() {
       // this.executedAt = LocalDateTime.now();
        counter++;
       // System.out.println(this);
        super.execute();
    }

    @Override
    public String toString() {
        return "CounterOutTask{Executed" + counter +", times}";
    }
}
