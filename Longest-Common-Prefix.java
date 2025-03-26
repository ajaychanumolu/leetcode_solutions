class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
    
    for(int i = 1 ; i<strs.length ; i++){
        if(prefix == \\){
            return \\;

        }
            String tempstring = \\;
            int searchsize = Math.min(prefix.length(), strs[i].length());
            for(int j =0 ; j<searchsize ;j++){
                if(prefix.charAt(j) != strs[i].charAt(j)){
                    break ;
                }
                tempstring += prefix.charAt(j);
            }
            prefix = tempstring ;
        }
        return prefix ;
    }
}