package Linkedlist;

public  class doubleLink {

    //doublelinkedlist node creation
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

    //printing double linkedlist
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

    //function for checking double linkedlist is palidrome;
    public static int palindromecheck(dnode head){
        if(head==null) return 1;
        dnode temp = head;
        dnode tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }

        while(temp!=tail && temp.prev!=tail){
            if(temp.val != tail.val) return -1;
            temp = temp.next ;
            tail = tail.prev;
        }
        return 1;
    }

    //target sum in non decreasing double linkedlist
    public static boolean findtarget(dnode head,int target){
        if(head==null || head.next==null) return false;
        dnode temp = head;
        dnode tail = head;
        while(tail.next!=null){
            tail= tail.next;
        }
        while(temp!=tail && temp.prev!=tail){
            if(temp.val+tail.val==target) return true;
            if(temp.val+tail.val < target){
                temp=temp.next ;
            }else{
                tail = tail.prev;
            }

        }
        return false;
    }

    //finding critical point of min amx in double linkedlist
     public static int findcritical(dnode head){
        if(head.next == null || head==null || head.next.next==null) return 0 ;
        dnode temp = head.next;
        int max = 0;
        int min = 0;
        while(temp.next!=null){
            if((temp.prev.val < temp.val) && (temp.next.val < temp.val)){
                System.out.println(temp.val);
            }
            else if((temp.prev.val>temp.val)&&(temp.next.val > temp.val)){
                System.out.println(temp.val);
            };

            temp = temp.next;
         }
        return  max ;
     }
     



    public static void main(String[] args) {

        dnode a = new dnode(10);
        dnode b = new dnode(12);
        dnode c = new dnode(9);
        dnode d = new dnode(25);
        dnode e = new dnode(10);

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







    }
}
