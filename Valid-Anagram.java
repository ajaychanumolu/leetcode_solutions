1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()){
4            return false;
5        }
6        char[] sarray = s.toCharArray();
7        char[] tarray = t.toCharArray();
8        Arrays.sort(sarray);
9        Arrays.sort(tarray);
10        return Arrays.equals(sarray,tarray);// check the content in the array 
11    }
12}