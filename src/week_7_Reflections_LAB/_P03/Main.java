package week_7_Reflections_LAB._P03;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<Reflection> clazz = Reflection.class;

        Arrays.stream(clazz.getDeclaredFields())
                .sorted(Comparator.comparing(Field::getName))
                .filter(e-> !Modifier.isPrivate(e.getModifiers()))
                .forEach(e-> System.out.println(e.getName() + " must be private!"));

        Arrays.stream(clazz.getDeclaredMethods())
                .filter(e-> !e.getName().equals("toString"))
                .sorted(Comparator.comparing(Method::getName))
                .filter(Main::filterByType)
                .forEach(method -> System.out.println(formatPrint(method)));





    }

    private static String formatPrint(Method method) {
        String postFix = method.getName().startsWith("get") ? "public!" : "private!";
        return method.getName() + " have to be " + postFix;
    }

    private static boolean filterByType(Method method) {
        return (method.getName().startsWith("get") && !Modifier.isPublic(method.getModifiers())) ||
                (method.getName().startsWith("set")) && !Modifier.isPrivate(method.getModifiers());


    }

}
