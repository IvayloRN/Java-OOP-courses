package week_7_Reflections_EX.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);

        Class<BlackBoxInt> clazz = BlackBoxInt.class;
        String input = scanner.nextLine();
        Constructor<BlackBoxInt> boxIntConstructor = clazz.getDeclaredConstructor();
        boxIntConstructor.setAccessible(true);

        BlackBoxInt myInt = boxIntConstructor.newInstance();
        Method[] methods = clazz.getMethods();

        while (!"END".equals(input)){
            String command = input.split("_")[0];
            int parameter = Integer.parseInt(input.split("_")[1]);
            Method method = clazz.getDeclaredMethod(command, int.class);
            method.setAccessible(true);
            method.invoke(myInt, parameter);

            Field innerValue = clazz.getDeclaredField("innerValue");
            innerValue.setAccessible(true);
            System.out.println(innerValue.get(myInt));

            input = scanner.nextLine();
        }



    }
}
