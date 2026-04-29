import java.util.*;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0, j = 0;
        List<int[]> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            int id1 = nums1[i][0];
            int val1 = nums1[i][1];
            int id2 = nums2[j][0];
            int val2 = nums2[j][1];

            if (id1 == id2) {
                result.add(new int[]{id1, val1 + val2});
                i++;
                j++;
            } 
            else if (id1 < id2) {
                result.add(new int[]{id1, val1});
                i++;
            } 
            else {
                result.add(new int[]{id2, val2});
                j++;
            }
        }

        // Add remaining elements from nums1
        while (i < nums1.length) {
            result.add(new int[]{nums1[i][0], nums1[i][1]});
            i++;
        }

        // Add remaining elements from nums2
        while (j < nums2.length) {
            result.add(new int[]{nums2[j][0], nums2[j][1]});
            j++;
        }

        // Convert List to array
        int[][] resArray = new int[result.size()][2];
        for (int k = 0; k < result.size(); k++) {
            resArray[k] = result.get(k);
        }

        return resArray;
    }
}