package basicdataype;

public class binarysearch {
    static int binary(int st , int end , int[] a,int target){
        if(st>end){
            return -1;
        }
        int mid= st + (end - st) / 2;
        if(a[mid]==target) {
            System.out.println("element found");
            return 1;
        }


        if(a[mid]>target){
          return  binary(st,mid-1,a,target);
        }else{
           return  binary(mid+1,end,a,target);
        }


    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int n = a.length-1;
       int p = binary(0,n,a,8);
        System.out.println(p);
    }
}
