package week3_InheritanceLAB._4_StackOfStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class StackOfStrings {
    private ArrayList<String> data;
    public StackOfStrings (){
        this.data = new ArrayList<>();
    }
    public void push(String item){
        data.add(item);
    }
    public String pop(){
        return data.remove(data.size() - 1);
    }
    public String peek(){
        return data.get(data.size() - 1);
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }
}
//•	Public method: push(String item): void
//•	Public method: pop(): String
//•	Public method: peek(): String
//•	Public method: isEmpty(): boolean