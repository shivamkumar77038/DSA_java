package Linkedlist;

public  class doubleLink {
    public static class dnode{
        int val ;
         static int  size = 0;
        dnode prev = null;
        dnode next = null;

        public dnode(int v){
            this.val=v;
            this.size++;
        }

        public int sizee(){
            return size;
        }
    }

    public static void print(dnode head){
        if(head ==null) return;
        System.out.println(head.val);
        print(head.next);
    }
    //insert at head
    public static dnode insertht(dnode head,int x){
        dnode a = new dnode(x);
        dnode temp = head ;
        temp.prev = a;
        a.next = temp;
        a.prev = null;

        return a;
    }

    //insert at tail
    public static dnode insertail(dnode head,int x){
        dnode a = new dnode(x);
        dnode temp = head ;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = a ;
        a.prev = temp;
        a.next = null;
        return head ;
    }
    //insert at any index
    public static dnode insetat(dnode head,int i,int value){
        if(i==0){
            return insertht(head,value);
        }
        if(i==head.sizee()-1){
            return insertail(head,value);
        }
        if(i> head.sizee()-1){
            System.out.println("note possible");
            return head;
        }
        dnode temp = head;
        for(int j=1;j<i;j++){
            temp = temp.next;
        }
        dnode r = temp.next ;
        dnode z = new dnode(value);
        temp.next = z ;
        z.next = r ;
        z.prev = temp ;
        r.prev = z;
        return head;
    }
    //delete head
    public static dnode delethd(dnode head){
        dnode temp = head.next;
        head.next = null ;
         temp.prev = null ;
         dnode.size--;
         return temp ;

    }

    //delet tail
    public static dnode deletetail(dnode head){
        if(head==null) return head ;

        dnode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next.prev = null;
        temp.next = null;
        dnode.size--;
        return head;
  }

    // delete at any index
    public static dnode delatany(dnode head,int i){
        if(head==null) return head ;
        if(i==0) return delethd(head);
        if(i== head.sizee()-1) return deletetail(head);
        dnode temp = head ;
        for(int j =1 ;j<i;j++){
            temp = temp.next ;
        }
        temp.next = temp.next.next;
        dnode.size--;
        return head ;

    }


    public static void main(String[] args) {

        dnode a = new dnode(10);
        dnode b = new dnode(11);
        dnode c = new dnode(12);
        dnode d = new dnode(13);
        dnode e = new dnode(14);

        a.next = b;
        a.prev = null;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;
        e.next = null;
        e.prev = d;
        System.out.println("size is "+ a.sizee());
        print(a);
        dnode z = delatany(a,3);
        System.out.println("size " + a.sizee());
        print(z);





    }
}
