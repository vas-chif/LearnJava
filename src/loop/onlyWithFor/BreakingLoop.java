package src.loop.onlyWithFor;

// example with breaking loop
public class BreakingLoop {
    public static void main(String[] args) {
        String[] programmers = {"Tony", "Boria", "Elina", "Serj", "Elis"};
        System.out.println("With break");
        for (String name : programmers) {
            if (name.equals("Elina"))
                break;
            System.out.print("Programmer: " + name + ". ");
        }
        System.out.println("\n");
        /* In acest cas "for" parcurge tot "array" de tip "String"  atunci cind elementul "Elina" citi din cadrul
        "array"-ului va vi echivalent cu "Elina" atunci ciclul ("loop") se va opri.
         La console: vom obtine tote elemtele din inintea elemetului "Elina"  dar nu va publica elementul "Elina".
         */
        System.out.println("Without break");
        for (String name : programmers) {
            if (name.equals("Elina"))
                System.out.println("Programmer: " + name);
        }
        /*
        In acesta cas "for" va parcurge tot "array" de tip "String" si atunci cin va gasi elementul "Elina" va publica
        la console doar elementul "Elina".
         */
    }
}

