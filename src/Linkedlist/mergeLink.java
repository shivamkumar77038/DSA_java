package Linkedlist;
import java.util.LinkedList;


public class mergeLink {



    public static linked sort(linked a){

        linked slow = a;
        linked fast = a.next;
        while(fast != null){
           if(slow.val != fast.val){
               slow.next = fast;
               slow = slow.next;
               fast = fast.next;


           }else{
               fast = fast.next;

           }
        }
        return a ;

    }
    public static class linked{
        int val ;
        linked next = null;
        linked(int v){
            this.val = v ;
        }
    }

    public static void display(linked head){
        if(head==null) return ;
        System.out.println(head.val);
        display(head.next);
    }
    public static void main(String[] args){
       linked a = new linked(2);
       linked b = new linked(3);
       linked c = new linked(3);
       linked d = new linked(3);
       linked e = new linked(6);
       linked f = new linked(6);
       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
       e.next = f;
       f.next = null;
       linked z = sort(a);

       display(z);








    }
}
