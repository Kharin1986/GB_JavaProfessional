package HW1_Generics;

import java.util.ArrayList;
import java.util.Arrays;

//2. Написать метод, который преобразует массив в ArrayList;
public class ArrayToList {
    public static <T> ArrayList<T> arrToArrayList(T []array){
//        ArrayList <T> arrayList = new ArrayList<>();
//        for (int i = 0; i <array.length; i++) {
//            arrayList.add(array[i]);
//        }
        ArrayList <T> arrayList = new ArrayList<>(Arrays.asList(array));
        return arrayList;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        ArrayList <Integer> arrayList = arrToArrayList(intArray);
        System.out.println(arrayList.toString());

        String[] strArray = {"w","t","f"};
        ArrayList <String> stringArrayList = arrToArrayList(strArray);
        System.out.println(stringArrayList.toString());
    }
}
