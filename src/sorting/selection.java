package sorting;

public class selection {
 static void selectionsort(int[]a){
     int n = a.length;
     for(int i =0 ;i<n;i++){
         int min = i ;
         for(int j = i+1 ;j<n;j++){
             if(a[min] > a[j]){
                 min = j ;
             }
         }
         int f = a[min];
         a[min] = a[i];
         a[i] = f ;
     }
 }
    public static void main(String[] args) {
        int[] a = {5,46,73,451,78,812};
        selectionsort(a);
        for(int i : a){
            System.out.println(i);
        }
    }
}
