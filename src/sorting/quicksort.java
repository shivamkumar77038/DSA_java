package sorting;

public class quicksort {
   static int partiton(int[] arr,int low,int high){
       int pivot = arr[high]; // Choose the last element as the pivot
       int i = low - 1; // Pointer for smaller element

       for (int j = low; j < high; j++) {
           // If current element is smaller than or equal to pivot
           if (arr[j] <= pivot) {
               i++;
               // Swap arr[i] and arr[j]
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }

       // Place pivot in the correct position by swapping
       int temp = arr[i + 1];
       arr[i + 1] = arr[high];
       arr[high] = temp;

       return i + 1;

   }

    static void sort(int[] a ,int st ,int end){
        if(st<end){
            int pivot = partiton(a,st,end);
            sort(a,st,pivot-1);
            sort(a,pivot+1,end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {46,45,87,156,184,78,8417};
        sort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.println(i);
        }

    }
}
