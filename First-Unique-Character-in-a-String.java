import java.util.Hashtable ;
class Solution {
    public int firstUniqChar(String s) {
        //hash table for these problem 
    Hashtable<Character , Integer> map =new Hashtable<>();
     for(int i=0 ;i<s.length();i++){
        if(!map.containsKey(s.charAt(i))){
            map.put(s.charAt(i), 1);
        }
        else {
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);

        }
     }
     for(int i=0; i<s.length();i++){
        if(map.get(s.charAt(i))== 1){
            return i;
        }
        

     }
    return -1;

    }
}