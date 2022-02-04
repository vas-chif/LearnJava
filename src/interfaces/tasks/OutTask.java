package src.interfaces.tasks;

public class OutTask extends AbstractTask implements Task {

    private String valueToPrint;

    public OutTask(String valueToPrint) {
        this.valueToPrint = valueToPrint;
        /* p/u a nu se repeta codul a fost scris in Class AbstractTask
        this.id = "22dd7080-8a15-41e6-925a-1b5fd0b094d0";
        this.createdAT = LocalDateTime.now(); */
    }

    /*@Override  //p/u a nu se repeta codul a fost scris in Class AbstractTask
    public void execute() {
        this.executedAt = LocalDateTime.now();
        System.out.println(this);
    }  */

    @Override
    public String toString() {
        return "OutTask{" +
                "valueToPrint='" + valueToPrint + '\'' +
                '}';
    }
}
