class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0;
        ArrayList<Integer> merge = new ArrayList<>();
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merge.add(nums1[i]);
                i++;
            } else {
                merge.add(nums2[j]);
                j++;
            }
        }
        while (i < m) {
            merge.add(nums1[i]);
            i++;
        }

        while (j < n) {
            merge.add(nums2[j]);
            j++;
        }
        int len = merge.size();
        int mid = len / 2;
        double median;
        if (len % 2 == 0) {
            median = ((merge.get(mid - 1)) + (merge.get(mid))) / 2.0;
        } else {
            median = merge.get(mid);
        }

        return median;
    }
}