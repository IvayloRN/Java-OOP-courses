package week4_Interfaces_and_Abstractions_LAB._5_Border_control;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> iDs = new ArrayList<>();

        String line = scanner.nextLine();
        while (!"End".equals(line)){
            String[] tokens = line.split(" ");
            if (tokens.length == 3){
                iDs.add(tokens[2]);
            }else{
                iDs.add(tokens[1]);
            }
            line = scanner.nextLine();
        }
        String numsToCheck = scanner.nextLine();
        if (!iDs.isEmpty()){
            for (String id: iDs) {
                if (id.endsWith(numsToCheck)){
                    System.out.println(id);
                }
            }
        }

    }
}
