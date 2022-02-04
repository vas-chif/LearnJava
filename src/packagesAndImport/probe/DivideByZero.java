package src.packagesAndImport.probe;

import java.lang.reflect.Method;

public class DivideByZero {
    public static void main(String[] args) throws NoSuchMethodException {
        InvocationTargetExample invocationTargetExample = new InvocationTargetExample();
        int a = invocationTargetExample.divideByZeroExample();
        Method mt = InvocationTargetExample.class.getMethod("re");

        System.out.println();



    }

}
