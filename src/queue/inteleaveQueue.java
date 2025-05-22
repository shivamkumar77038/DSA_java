package queue;
import java.util.LinkedList;
import java.util.*;

public class inteleaveQueue {
    public static Queue<Integer> interleave(Queue<Integer> q){
        if (q.size() % 2 != 0) {
            System.out.println("Queue must have even number of elements.");
            return null;
        }
        int n = q.size()/2;

        Stack<Integer> s = new Stack<>();
        System.out.println(n);
        //removing half element from queue
        for(int i=0;i<n;i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i =0;i<n;i++){
            q.add(q.remove());
        }
        for(int i=0;i<n;i++){
            s.push(q.remove());
        }

        for(int i=0;i<n;i++){
            q.add(s.pop());
            q.add(q.remove());

        }
        return q;


    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        Queue<Integer> q1= interleave(q);
        System.out.println(q1);

    }
}
