package org.example;
import java.util.ArrayList;
public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Please enter a number ");
        list.add(100);
        list.add(200);

        for(Integer i : list )
        {
            System.out.println("The value is: " + i);
        }
    }
}
