package sorting;

public class insertion {
  public static void insertion_sort(int[] arr) {
      int n = arr.length;
      for(int i = 1 ;i<n;i++){
          int j = i;

          while(j>0 && arr[j-1]>arr[j]){
              int d = arr[j];
              arr[j] = arr[j-1];
              arr[j-1] = d ;
              j--;
          }
      }
  }

    public static void main(String[] args) {
        int[] a = {454,465,46,3,460,54};
        insertion_sort(a);
        for(int i : a){
            System.out.println(i);
        }

    }
}
