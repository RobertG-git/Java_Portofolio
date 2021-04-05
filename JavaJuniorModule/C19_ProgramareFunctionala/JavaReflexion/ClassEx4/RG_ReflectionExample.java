package src.C19_ProgramareFunctionala.JavaReflexion.ClassEx4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RG_ReflectionExample {

    private String testMethod() {
        return "Sunt student la Academia Devmind";
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // Object creation
        RG_ReflectionExample example = new RG_ReflectionExample();

        // Method creation
        Method m = example.getClass().getDeclaredMethod("testMethod");

        // Object access even if set accessible is not set to true;
        //m.setAccessible(true);
        System.out.println(m);
        System.out.println(m.invoke(example));

    }
}
