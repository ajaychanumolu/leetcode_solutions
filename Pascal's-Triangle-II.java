import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1); // Start with [1]

        for (int i = 0; i < rowIndex; i++) {
            List<Integer> nextRow = new ArrayList<>();
            
            // Initialize with 0s, size = res.size() + 1
            for (int j = 0; j <= res.size(); j++) {
                nextRow.add(0);
            }

            // Fill nextRow based on res
            for (int j = 0; j < res.size(); j++) {
                nextRow.set(j, nextRow.get(j) + res.get(j));
                nextRow.set(j + 1, nextRow.get(j + 1) + res.get(j));
            }

            res = nextRow;
        }

        return res;
    }
}
