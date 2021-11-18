package src.accesmodifiersAndConstructor.accesmodifiers.statics;

public class MainStatic {
    public static void main(String[] args) {

        System.out.println(StaticMethod.age); // eset recomandate ca variabilele statice sa fie apelate prin mediul clasei
        StaticMethod.doSomething();           // eset recomandate ca methodele statice sa fie apelate prin mediul clasei

        StaticMethod sm = new StaticMethod();  // nu este necesar la chemarea variabilelor su metodelor statice
       // sm.age = 18; //se pot apela doar scrindi manual, ide ascunde posibilitatea de a accesa variabilele statice prin instanta
        sm.doSomething(); //se pot apela doar scrindi manual, ide ascunde posibilitatea de a accesa methodelor statice prin instanta

    }
}
