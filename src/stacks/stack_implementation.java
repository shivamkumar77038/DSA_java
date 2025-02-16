package stacks;

public class stack_implementation {
    //implementing using linkedlist
    public static class node{
        int value ;
        node next = null;
        node(int v){
            this.value = v;
        }

    }
    public static class linkedStack{
        node head = null;
        node tail = null;
        int size = 0;
        //push
        void push(int v){
            node n = new node(v);
            if(head == null){
                head = tail = n;
            }else{
                tail.next = n ;
                tail = n ;

            }
            size++;
        }
        //peek
        int peek(){
            if(head == null){
                System.out.println("stack is empty");
                return -1;
            }else{
                return tail.value;
            }
        }
        //size
        int size(){
            return size;
        }
        //pop
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }else{
                node temp = head ;
                while(temp.next.next!=null){
                    temp = temp.next ;
                }
                int value = temp.next.value;
                temp.next = null;
                size--;
                return value;
            }
        }

        //display
        void display(){
            node temp = head;
            if(head ==null){
                System.out.println("stack is empty");
                return ;
            }
            while(temp!=null){
                System.out.print(temp.value+" ");
                temp =temp.next;
            }
        }
    }

    //implementing stack using array
    public static class stack{
        int[] arr = new int[5];
        int idx = 0;
        //push
        void push(int el){
            if(idx==arr.length){
                System.out.println("stack is full");
                return ;
            }
            arr[idx] = el;
            idx++;
        }

        //peek
        int peek(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            System.out.println(arr[idx-1]);
            return arr[idx-1];
        }

        //pop
        int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            int curr = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return curr;
        }

        //size
        int size(){
            return idx;
        }

        //display
        void display(){
            for(int i = 0 ;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
        }

        //isempty
        boolean isempty(){
            if(idx==0){
                return true;
            }else{
                return false;
            }
        }

        //isfull
        boolean isfull(){
            if(idx==arr.length){
                return true;
            }else{
                return false;
            }
        }

    }

    public static void main(String[] args) {








    }
}
