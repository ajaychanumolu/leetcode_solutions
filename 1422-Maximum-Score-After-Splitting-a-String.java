class Solution {
    public int maxScore(String s) {
        int maxScore = Integer.MIN_VALUE;
        int n = s.length();
        
    
        for (int i = 1; i < n; i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            
            int leftZeros = countChar(left, '0');
            int rightOnes = countChar(right, '1');
            
            int score = leftZeros + rightOnes;
            
            maxScore = Math.max(maxScore, score);
        }
        
        return maxScore;
    }
    
    private int countChar(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }
}
