package Exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Exercise_array1 {
    public static void main(String[] args) {

        //First way to create an array
        int[] array = new int[5];
        array[2] = 10;
        array[4] = 25;

        //Second way to create an array
        int [] array2 = {4,5,2,6,7,12};

        for (int i = 0 ; i < array2.length;i++)
        {
            System.out.println(array2[i]);
        }

        //ArrayList <Dynamic Array>
        //A dynamic array only accepts "object" data types
        ArrayList<Integer> arrayList1 =  new ArrayList<>();
        arrayList1.add(190);
        arrayList1.add(200);

        for (int i = 0 ; i < arrayList1.size();i++)
        {
            System.out.println( i+ ":"+arrayList1.get(i));
        }
        arrayList1.remove(0);

        System.out.println("Remove index 0 ");
        for (int i = 0 ; i < arrayList1.size();i++)
        {
            System.out.println(i+ ":"+arrayList1.get(i));
        }

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(2);
        linkedList1.add(5);

        System.out.println(linkedList1);
        String str = "Hello world";

        System.out.println(str);


    }
}
