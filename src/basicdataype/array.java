package basicdataype;

public class array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2]=11;
        arr[3]=54;
  int [] arr1 = arr;

  arr1[1] = 100;

        for(int i : arr){
            System.out.println(i);
        }



    }
}
