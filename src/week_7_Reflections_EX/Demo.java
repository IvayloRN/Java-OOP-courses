package week_7_Reflections_EX;

import week_7_Reflections_EX.harvestingFields.RichSoilLand;

import java.lang.reflect.*;


public class Demo {
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Class<RichSoilLand> clazz = RichSoilLand.class;

		/*Field[] declaredFields = clazz.getFields();
		for (Field field : declaredFields) {
			System.out.println("Name - " + field.getName());
			System.out.println("Modifiers - " + Modifier.toString(field.getModifiers()));
			System.out.println("Types - " + field.getType());
			System.out.println();
			Modifier.isPublic(field.getModifiers());
		}
		Constructor<RichSoilLand> privateConstructor = clazz.getDeclaredConstructor(String.class);
		privateConstructor.setAccessible(true);
		RichSoilLand Koki = privateConstructor.newInstance("Koki");


		Method[] declaredMethods = clazz.getDeclaredMethods();
		Method[] methods = clazz.getMethods();

		Method declaredMethod = declaredMethods[1];
		declaredMethod.invoke(Koki, "Svetlio");
		declaredMethod.setAccessible(true);

		System.out.println(Koki.getTestString());


*/


/*
		Arrays.stream(clazz.getDeclaredFields())
				.filter(e-> Modifier.isPrivate(e.getModifiers()))
				.forEach(System.out::println);

		Arrays.stream(clazz.getDeclaredFields())
				.filter(e-> Modifier.isProtected(e.getModifiers()))
				.forEach(System.out::println);

		Arrays.stream(clazz.getDeclaredFields())
				.filter(e-> Modifier.isPublic(e.getModifiers()))
				.forEach(System.out::println);


		Arrays.stream(clazz.getDeclaredFields()).forEach(System.out::println);

*/

	}


	//"{access modifier} {field type} {field name}"
	//protected String testString
	//private int week_7_Reflections_EX.harvestingFields.RichSoilLand.testInt
}
