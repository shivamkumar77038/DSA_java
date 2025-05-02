package queue;
import java.util.Stack;
public class ImplemetQeueUsingStack {


    //implenting queue using stack(add,remove,peek,size,isempty,print)
    public static  class usingStack<T>{
        Stack<T> st1 = new Stack<>();
        Stack<T> st2 = new Stack<>();
        int size = 0;

        public void add(T n){
            st1.push(n);
            size++;
        }
        public T delete(){
            if(st1.isEmpty()){
                throw new RuntimeException("Stack is empty");
            }else{
                while(st1.size()>1){
                    st2.push(st1.pop());
                }
                T n = st1.pop();
                while(st2.size()>0){
                    st1.push(st2.pop());
                }
                return n ;
            }
        }
// printing
        public void printqueue(){
            System.out.println("Stack from front to back");
            while(st1.size()>0){
                st2.push(st1.pop());
            }
            while(st2.size()>0){
                System.out.print(st2.peek()+" ");
                st1.push(st2.pop());
            }
        }
//peek method
        public T peek(){
            if(st1.size()==0){
                throw new RuntimeException("Stack is empty");
            }
            while(st1.size()>0){
                st2.push(st1.pop());
            }
            T n = st2.peek();
            while(st2.size()>0){
                st1.push(st2.pop());
            }
            return n;
        }



    }




    public static void main(String[] args) {
       usingStack<Integer> qu = new usingStack<>();
       qu.add(5);
       qu.add(10);
       qu.add(25);
        System.out.println("peek "+ qu.peek());
       qu.printqueue();

    }
}
