class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        else if (n<5) return n-1;
        else return fib(n-1) + fib(n-2);
        }
}