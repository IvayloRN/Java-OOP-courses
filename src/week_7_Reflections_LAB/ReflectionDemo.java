package week_7_Reflections_LAB;

import week_7_Reflections_LAB._P03.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<String> stringClass = String.class;
        Field[] fields = stringClass.getFields();

        Class<?> stringClazFromName = Class.forName("java.lang.String");
        Class<?> stringClazFromClass = String.class;


        //~~~~~~~~~~~~~~~

        Class<Reflection> clazz = Reflection.class;

        //~~~~~~~~~~~~~~~


        System.out.println(clazz);
        System.out.println(clazz.getSuperclass());

        Class<?>[] interfaces = clazz.getInterfaces();

        for (Class<?> i : interfaces) {
            System.out.println(i);
        }

        Constructor<Reflection> constructor = clazz.getDeclaredConstructor();
        constructor.newInstance();

    }

}
