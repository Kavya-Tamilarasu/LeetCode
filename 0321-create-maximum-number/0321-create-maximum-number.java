class Solution {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {

        int[] result = new int[k];

        int start = Math.max(0, k - nums2.length);
        int end = Math.min(k, nums1.length);

        for (int i = start; i <= end; i++) {

            int[] a = maxSubsequence(nums1, i);
            int[] b = maxSubsequence(nums2, k - i);

            int[] merged = merge(a, b);

            if (greater(merged, 0, result, 0)) {
                result = merged;
            }
        }

        return result;
    }

    private int[] maxSubsequence(int[] nums, int k) {

        int[] stack = new int[k];
        int top = 0;

        int remove = nums.length - k;

        for (int num : nums) {

            while (top > 0 &&
                   stack[top - 1] < num &&
                   remove > 0) {

                top--;
                remove--;
            }

            if (top < k) {
                stack[top++] = num;
            } else {
                remove--;
            }
        }

        return stack;
    }

    
    private int[] merge(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length || j < b.length) {

            if (greater(a, i, b, j)) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        return result;
    }

    
    private boolean greater(int[] a, int i, int[] b, int j) {

        while (i < a.length && j < b.length) {

            if (a[i] > b[j]) {
                return true;
            }

            if (a[i] < b[j]) {
                return false;
            }

            i++;
            j++;
        }

        return i != a.length;
    }
}