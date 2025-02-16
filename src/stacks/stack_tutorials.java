package stacks;

import java.util.Stack;

public class stack_tutorials {

    //reversing stcak by recursion
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()) return;

        int i = st.pop();
        reverse(st);
        insertbtm(st,i);

        
    }

    //adding elemnt in bottom
    public static void insertbtm(Stack<Integer> st,int item){
        if(st.isEmpty()){
            st.push(item);
            return ;
        }
        int i = st.pop();
        insertbtm(st,item);
        st.push(i);

    }

    //display recursively
    public static void display(Stack<Integer>st){
        if(st.size()==0) return;
        int el = st.pop();
        display(st);
        st.push(el);
        System.out.println(el);
    }

    // inserting element in at any index
    public static void insertAt(Stack<Integer> st,int i,int ele){
        Stack<Integer> sn = new Stack<>();

        while( st.size() >= i){
            sn.push(st.pop());
        }

        st.push((ele));

        while(sn.size()>0){
            st.push(sn.pop());
        }
    }

    //copying stack in same order
    public static Stack copy(Stack<Integer> st){
        Stack<Integer> sn1 = new Stack<>();
        Stack<Integer> sn2 = new  Stack<>();
        while(st.size()>0){
             sn1.push(st.pop());
        }
        while(sn1.size()>0){
            sn2.push(sn1.pop());
        }
        return sn2 ;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new  Stack<>();
        st.push(45);
        st.push(12);
        st.push(455);
        st.push(132);
        st.push(405);
        st.push(182);
         reverse(st);
         display(st);


    }
}
