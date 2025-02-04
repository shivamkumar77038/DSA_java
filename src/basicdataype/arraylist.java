package basicdataype;

import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(10);
        arr.add("first");
        arr.add("second");
        arr.add("third");
        arr.add("fourth");
        arr.add("five");
        arr.add("first");
        arr.add("second");
        arr.add("third");
        arr.add("fourth");
        arr.add("five");
        arr.add("first");
        arr.add("second");
        arr.add("third");
        arr.add("fourth");
        arr.add("five");
        System.out.println(arr.size());



        for(String s : arr){
            System.out.println(s);
        }
         String[] arr1 = arr.toArray(new String[0]);
    }
}
