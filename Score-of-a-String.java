class Solution {
    public int scoreOfString(String s) {
        int size = s.length();
        int score = 0;
        for (int i = 0; i < size-1; i++) {
            int ascii1 = (int) s.charAt(i);
            int ascii2 = (int) s.charAt(i+1);
            score += Math.abs(ascii1-ascii2);
        } return score;
    }
}