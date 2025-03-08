class Solution {
    public int maxScore(String s) {
        int maxScore = Integer.MIN_VALUE;
        int n = s.length();
        
    
        for (int i = 1; i < n; i++) {
            // Split into left and right substrings
            String left = s.substring(0, i);
            String right = s.substring(i);
            
            // Count zeros in the left and ones in the right
            int leftZeros = countChar(left, '0');
            int rightOnes = countChar(right, '1');
            
            // Calculate the score
            int score = leftZeros + rightOnes;
            
            // Update maximum score
            maxScore = Math.max(maxScore, score);
        }
        
        return maxScore;
    }
    
    // Helper method to count occurrences of a character in a string
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
