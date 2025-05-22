package collectionframwok;
import java.util.*;
public class hashmp {

    public static class hashmap<K,V>{
         private int BUCKET_SIZE = 5; // bucket size
          private Double lamda = 0.72;
          
        int sizen = 0;

        //node clas
        public class node{
            K key;
            V value;

            node(K key, V value) {

            this.key =key;
            this.value =value;
         }
        }

        //bucket created
        public LinkedList<node>[] bucket ;

        //intializtio of nbucket
        public void initbucket(){
            bucket = new LinkedList[BUCKET_SIZE];
            for(int i =0;i<bucket.length;i++){
                bucket[i] = new LinkedList<>();
            }
        }

        //class constructor
        hashmap(){
            initbucket();
        }

        //searching in bucket
        private int searchkey(int index,K key){
            LinkedList<node> ll = bucket[index];
            for(int i =0;i<ll.size();i++){
                if(ll.get(i).key==key) {
                    return i;
                }
            }
            return -1;
        }

        //hashfunction
        public int hashfunction( K key){
            int hashkey = key.hashCode();
            return Math.abs(hashkey)%bucket.length;
        }

        /*insert put 1 check exist then add increaase size*/
        public void put(K key,V value){
            int bucketIndex = hashfunction(key);
            int i = searchkey(bucketIndex,key);
            if(i==-1){
                node node = new node(key,value);
                bucket[bucketIndex].add(node);
                sizen++;
            }else{
               bucket[bucketIndex].get(i).value = value;
               sizen++;
            }

        }

        //get(k)
        public V get(K key){
            int bucketIndex = hashfunction(key);
            int index = searchkey(bucketIndex,key);
            if(index != -1){
               return bucket[bucketIndex].get(index).value;
            }else{
                System.out.println("Key Does not Found");
                return null;
            }
        }

        //remove function
        public V remove(K key){
            int bucketIndex = hashfunction(key);
            int index = searchkey(bucketIndex,key);
            if(index != -1){
                V val = bucket[bucketIndex].get(index).value;
                bucket[bucketIndex].remove(index);
                sizen--;

                return val;
            }else{
                return null;
            }
        }

        //size()
        public int size(){
            return sizen;
        }

        //print
        public void printhash(){
            for(int i =0;i<bucket.length;i++){
                LinkedList<node>ll = bucket[i];
                for(int j=0;j<ll.size();j++){
                    System.out.print(ll.get(j).value);
                }
                System.out.println();
            }
        }

    }




    public static void main(String[] args) {
         hashmap<Integer,String> hash = new hashmap<>();
         hash.put(1,"shivam");
         hash.put(2,"kumar");
         hash.put(3,"harsh");
         hash.put(4,"rajput");



        }

}
