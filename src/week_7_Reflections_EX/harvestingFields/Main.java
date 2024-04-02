package week_7_Reflections_EX.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Class<RichSoilLand> clazz = RichSoilLand.class;
        String line = scanner.nextLine();
        Field[] fields = clazz.getDeclaredFields();

        while (!"HARVEST".equals(line)){
            switch (line){
                case "public":
                    Arrays.stream(fields)
                            .filter(e-> Modifier.isPublic(e.getModifiers()))
                            .forEach(field -> System.out.println(Modifier.toString(field.getModifiers()) + " " +  field.getType().getSimpleName() +" "
                                    +  field.getName()));
                    break;
                case "private":
                    Arrays.stream(fields)
                            .filter(e-> Modifier.isPrivate(e.getModifiers()))
                            .forEach(field -> System.out.println(Modifier.toString(field.getModifiers()) + " " +  field.getType().getSimpleName() +" "
                                    +  field.getName()));
                    break;
                case "protected":
                    Arrays.stream(fields)
                            .filter(e-> Modifier.isProtected(e.getModifiers()))
                            .forEach(field -> System.out.println(Modifier.toString(field.getModifiers()) + " " +  field.getType().getSimpleName() +" "
                                    +  field.getName()));
                    break;
                case "all":
                    Arrays.stream(fields).forEach(field->
                            System.out.println(Modifier.toString(field.getModifiers()) + " " +  field.getType().getSimpleName() +" "
                                    +  field.getName()));
                    break;
            }
            line = scanner.nextLine();
        }
//"{access modifier} {field type} {field name}"
//             protected                                      String                      testString
//  Modifier.toString(field.getModifiers()        field.getType().getSimpleName()       field.getName()
    }
}
