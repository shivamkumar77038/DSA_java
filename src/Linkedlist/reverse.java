package Linkedlist;

public class reverse {
    public static node reversw(node head){
        if(head.next==null) return head;
        node newhead = reversw(head.next);
           head.next.next = head;
           head.next =null;
        return newhead ;
    }

    public static void  printlinked(node st){
        if(st == null){
            return ;
        }
        System.out.println(st.val);
        printlinked(st.next);
    }
    public static class node{
        int val ;
        node next = null;
        node(int v){
            this.val = v ;
        }
    }
    public static void main(String[] args) {
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
           node n = reversw(a);
        printlinked(n);
    }
}
