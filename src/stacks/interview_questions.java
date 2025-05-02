package stacks;
import java.util.*;
public class interview_questions {

    // finding just next greater number in array using stack
      public static int[] find_greater(int[] arr){
          Stack<Integer> st = new Stack<>();
          int[] res = new int[arr.length];
          int l = arr.length;
          for(int i = l-1;i>=0;i--){
              if(st.isEmpty()){
                  st.push(arr[i]);
                  res[i] = -1;
              }
              if(st.peek()>arr[i]){
                  res[i]  = st.peek();
              }else{
                  res[i] = -1;
              }
              if(arr[i]>st.peek()){
                  st.push(arr[i]);
              }
          }




          return res ;
      }
    //remove conscutive number which occcure more than or equal to 2 times in a array
    public static int[] removed(int[] arr) {
        int l = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < l; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            }else if(st.peek() == arr[i]){
                if (i==l-1 || arr[i] != arr[i + 1]) st.pop();
            }
        }
        int[] res = new int[st.size()];

        for(int i = res.length-1;i>=0;i--){

            res[i] = st.pop();

        }
        return res;

    }

    //checking brackets are balanced and nested using stack
    public static boolean bracked_balanced(String str){
        Stack<Character> n = new Stack<>();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='('){
                n.push(str.charAt(i));
            }else if(str.charAt(i)==')'){
                if(n.empty()){
                    return false;
                }
                n.pop();
            }
        }
        boolean ans = n.empty();
        return ans;
    }

    //simple method
    public static void balance(String str){
        int open = 0;

        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='('){
                open++;
            }else{
                open--;
            }
        }
        if(open==0){
            System.out.println("balanced");
        }else{
            System.out.println("nonbalanced");
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,2,5,6,3,4,5};



        }
    }

