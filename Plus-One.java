1class Solution {
2    public int[] plusOne(int[] digits) {
3        
4        int current_digit = digits.length - 1 ;
5            
6        while(digits[current_digit] == 9){
7             
8            if(current_digit == 0){
9                int[] newarray = new int[digits.length + 1];
10                newarray[0] = 1;
11                return newarray;
12            }
13        digits[current_digit] = 0;
14            current_digit --;
15        }
16        
17        digits[current_digit] ++;
18        return digits;  
19        
20        
21    }
22                   
23
24}