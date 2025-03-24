class Solution {
    public boolean isPalindrome(String s) {
        String newstr = \\;
        for(int i = 0 ; i <s.length() ; i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newstr += s.charAt(i);
            }
        }
        newstr = newstr.toLowerCase();
                for(int i = 0 ; i <newstr.length() / 2 ; i++){
                    if(newstr.charAt(i) != newstr.charAt(newstr.length() - i - 1)){
                        return false;
                    }
                }
                return true;
    }
}