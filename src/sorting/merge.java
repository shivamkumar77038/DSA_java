package sorting;

public class merge {
    static void join(int[] a , int st,int mid,int end){
        int[] merge = new int[end-st+1];
        int index1 = st;
        int index2 = mid+1;
        int k =0;

        while(index1<=mid && index2<=end){
            if(a[index1] >= a[index2]){
                merge[k++] = a[index2++];
            }else{
                merge[k++] = a[index1++];
            }
        }
        while(index1 <= mid){
            merge[k++] = a[index1++];
        }
        while (index2 <= end){
            merge[k++] = a[index2++];
        }
        for(int i =0,j=st ;i<merge.length ;i++,j++){
            a[j] = merge[i] ;
        }

    }

    static void mergeSort(int[] a,int st,int end){
        if(st>=end){
            return ;
        }
        int mid = st+(end-st)/2;
        mergeSort(a,st,mid);
        mergeSort(a,mid+1,end);
        join(a,st,mid,end);
    }
    public static void main(String[] args) {
        int[] arr = {44,46,8,4,6,566,488};
        int n = arr.length-1;
        mergeSort(arr,0,n);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
