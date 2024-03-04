package week3_InheritanceEX._6_animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalType = scanner.nextLine();
        while (!"Beast!".equals(animalType)){

            try {
                String[] tokens = scanner.nextLine().split("\\s+");
                String animalName = tokens[0];
                int animalAge = Integer.parseInt(tokens[1]);

                switch (animalType){

                    case"Cat":
                        Cat cat = new Cat(animalName, animalAge, tokens[2]);
                        System.out.println(cat);
                        break;

                    case"Dog":
                        Dog dog = new Dog(animalName,animalAge,tokens[2]);
                        System.out.println(dog);
                        break;
                    case"Frog":
                        Frog frog = new Frog(animalName,animalAge,tokens[2]);
                        System.out.println(frog);
                        break;
                    case"Kitten":
                        Kitten kitten = new Kitten(animalName, animalAge);
                        System.out.println(kitten);
                        break;
                    case"Tomcat":
                        Tomcat tomcat = new Tomcat(animalName, animalAge);
                        System.out.println(tomcat);

                        break;
                }
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }


            animalType = scanner.nextLine();




        }
    }
}
