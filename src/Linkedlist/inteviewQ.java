package Linkedlist;
import java.util.Scanner;
public class inteviewQ {
    public static void  printlinked(node st){
        if(st == null){
            return ;
        }
        System.out.println(st.val);
        printlinked(st.next);
    }
    // deleting nth node from last
    public static node removen(node head,int val){
        node slow = head;
        node fast = head;
        for(int i =1;i<=val;i++){
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return head ;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next ;
        return head;
    }
// nth node getting
    public static node nNode(node head,int val){
        node slow = head;
        node fast = head;
        for(int i =1;i<=val;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
//getting nth node from last
     static void nthnode(int num,node head){
         int length  = 0;
         node temp = head ;
         while(temp!=null){
             length++;
             temp = temp.next;
         }

         node temp1 = head ;
         for(int i =0;i<length-num;i++){
             temp1 = temp1.next;
         }
           temp1.val = temp1.next.val;
         temp1.next = temp1.next.next;
     }

    public static class node{
       int val ;
       node next = null;
       node(int v){
           this.val = v ;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       node a = new node(0);
       node b = new node(1);
       a.next = b;
       node c = new node(2);
       b.next = c ;
       node d = new node(3);
       c.next = d;
       node e = new node(4);
       d.next=e;
       node f = new node(5);
       e.next =f ;

        System.out.println("enter a number from end node");
        int num = sc.nextInt();
        printlinked(a);
        System.out.println("after");

        printlinked(a);




    }
}
