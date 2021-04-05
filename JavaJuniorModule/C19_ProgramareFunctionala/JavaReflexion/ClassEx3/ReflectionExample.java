package src.C19_ProgramareFunctionala.JavaReflexion.ClassEx3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

    public void list() {
        Class student = Student.class;

        Method[] methods = student.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Field[] fields = student.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

    }

    public static void main(String[] args) {
        new ReflectionExample().list();
    }
}
