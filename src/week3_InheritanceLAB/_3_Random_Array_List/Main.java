package week3_InheritanceLAB._3_Random_Array_List;

public class Main {

    public static void main(String[] args) {
        RandomArrayList<Integer> randomArrayList = new RandomArrayList<>();
        randomArrayList.add(16);
        randomArrayList.add(90);
        randomArrayList.add(444);
        randomArrayList.add(216);
        System.out.println(randomArrayList.getRandomElement());
    }
}
