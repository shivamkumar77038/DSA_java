package collectionframwok;

import java.util.HashMap;

public class hashQuestion {

    public static boolean isAnagram(String str, String str1) {
        if(str.length()!= str1.length()) return false;
        HashMap<Character,Integer> hs = new HashMap<>();
       //inserting
         for(int i=0;i<str.length();i++){
           if(hs.containsKey(str.charAt(i))){
               hs.put(str.charAt(i),hs.get(str.charAt(i))+1);
           }else {
               hs.put(str.charAt(i),1);

           }
       }
         for(int i=0;i<str1.length();i++){
           if(hs.containsKey(str1.charAt(i))){
               hs.put(str1.charAt(i), hs.get(str1.charAt(i)) - 1);
           }else{
               return false;
           }
         }
         System.out.println(hs.values());
         for(int i : hs.values()){

           if(i!=0) return false;
         }

          return true;
         }

    public static boolean isIsomorphic(String s, String t){
       HashMap<Character,Character> hs = new HashMap<>();

       for(int i=0;i<s.length();i++){
           char a = s.charAt(i);
           char b = t.charAt(i);
           if(hs.containsKey(a)){
               if(hs.get(a)!= b) return  false;
           }else if(hs.containsValue(b)){
               return false;
           }else {
               hs.put(a,b);
           }
       }
       return true;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int[] res = new int[2];
        for(int i =0;i<nums.length;i++){
            int val = target - nums[i];
            if(hs.containsKey(val)){
                res[0] = i;
                res[1] = hs.get(val);
                return res;
            }else{
                hs.put(nums[i],i);
            }
        }

        return res;
    }

    public static int subarray(int[] arr){

        HashMap<Integer,Integer> hs = new HashMap<>();
        int max_length = 0;
        int preceder = 0;
        hs.put(0,-1);
        for(int i = 0;i<arr.length;i++){
             preceder = preceder+arr[i];
             if(hs.containsKey(preceder)){
                 int len = i - hs.get(preceder);
                 max_length = Math.max(len,max_length);
             }else{
                 hs.put(preceder,i);
             }
        }

        return max_length;
    }
    


    public static void main(String[] args){
        String str = "shivam";
        String str2 ="shivao";
        int[] arr = {15,-1,0,-10,-4};
        int ans = subarray(arr);
        System.out.println(ans);

    }
}
