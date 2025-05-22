package queue;
import java.util.LinkedList;
import java.util.Queue;

public class questions {
    public static int[] negative(int[] arr,int k){
        int n = arr.length;
        int[] res = new int[n-k+1];
        Queue<Integer> st = new LinkedList<>();
        for(int i =0;i<n;i++){
            if(arr[i]<0) {
                st.add(i);
            }
        }
        int j =0;
        for(int i=0;i<n-k+1;i++){
            if(st.size()>0 && st.peek()>=i){
                res[j]=arr[st.peek()];
                j++;
            }else if(st.size()>0 && st.peek()<i){
                st.remove();
            }

            if(st.size()==0){
                res[j] =0;
                j++;
            }
        }



        return res;

    }
    public static void main(String[] args) {
        int[] arr = {10,-1,5,6,-7,10,-8,2};
        int[] res = negative(arr,3);
        for (int i : res){
            System.out.println(i);
        }
    }

}

