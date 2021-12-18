package src.inheritance.person;

public class Students extends Person{
    private String program;
    private int year;
    private double feet;

    public Students(String name, String address, String program, int year, double feet) {
        super(name, address);
        this.program =  program;
        this.year = year;
        this.feet = feet;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

    }

    public double getFeet() {
        return feet;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }


    @Override
    public String toString() {
        //return String.format("Student[Person[name = %s, address = %s], program = %s, year = %s, feet = %s]", getName(), getAddress(), program, year, feet);
        return String.format("Student[%s, program = %s, year = %s, feet = %s]",super.toString() , program, year, feet);
    }
}
