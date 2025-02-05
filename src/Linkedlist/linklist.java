package Linkedlist;

public class linklist {

    public static void  printlinked(node st){
        if(st == null){
            return ;
        }
        System.out.println(st.data);
      printlinked(st.next);
    }

    public static class node{
        int data ;
        node next ;
        node(int a){
            this.data = a;
        }
    }

    public static class linkedlist{
        node head = null ;
        node tail = null;
        int size = 0;
        // adding function
          void addAtend(int v){
             node temp = new node(v);
             if(head == null){
                 head = temp;
                 tail= temp;

             }else {
                 tail.next = temp;
                 tail = temp;

             }
             size++;
          }
          // printing function
        void print(){
              node temp = head ;
              while(temp != null){
                  System.out.print(temp.data+" ");
                  temp= temp.next;
              }
        }
        //size function
         int size(){
              return size;
         }
         // add at begining
        void addAtbegining(int v){
              node temp = new node(v);
              temp.next = head ;
              head = temp ;
              size++;
        }
        // insert element at given index
        void insertAt(int v,int i){
              if(i==1){
                  addAtbegining(v);
                  return;
              } else if (i==size) {
                  addAtend(v);
                  return;
              }
              if(i>size) return;
            node temp = new node(v);
              node target = head ;
              for(int j =1 ;j<i-1;j++){
                  target= target.next;
              }
              temp.next = target.next;
              target.next = temp;
              size++;

        }
    }


    public static void main(String[] args) {

        linkedlist ll = new linkedlist();
        ll.addAtend(10);
        ll.addAtend(20);
        ll.addAtend(30);
        ll.addAtend(40);

       ll.insertAt(100,6);
        System.out.println(ll.tail.data);

        ll.print();

    }
}
