class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int counter = 1 ;
        for(int i =0 ; i < numRows ; i++){
            List<Integer> currentrow = new ArrayList<>();

            for(int j = 0 ; j < counter ;j++){
                if(j==0 || j == counter-1){
                    currentrow.add(1);   
                }
                else{
                    currentrow.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }

            }
            result.add(currentrow);
            counter ++ ;


        }
        return result ;
    }
}