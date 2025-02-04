import java.util.*;
public class Main {

      public static void bublle_sort(int[] arr){
          int n = arr.length;
         int d =0 ;
         while(d<n){
             for(int i=0;i<n-1;i++){
                 if(arr[i]>arr[i+1]){
                     int c = arr[i];
                     arr[i] = arr[i+1];
                     arr[i+1] = c ;
                 }
             } d++;
         }
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[] a = {401,6,456,46,646,80};
          bublle_sort(a);
          for(int i : a){
              System.out.println( i);
          }


    }
}