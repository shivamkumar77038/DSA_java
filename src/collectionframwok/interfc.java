package collectionframwok;
import java.util.*;

public class interfc {





    public static void main(String[] args) {
     int[] arr = {1,3,2,1,4,2,1};
    Map<Integer,Integer> mp = new HashMap<>();
    for(int i =0;i<arr.length;i++){

        if(mp.containsKey(arr[i])){
           mp.put(arr[i],(mp.get(arr[i])+1));
        }else{
            mp.put(arr[i],1);
        }
    }
        System.out.println(mp);
    int max = -1;
    int key = -1;
    for(int j: mp.keySet()){
        if(mp.get(j) > max){
            max = mp.get(j);
            key = j;
        }
    }

        System.out.println(key);



    }


}
