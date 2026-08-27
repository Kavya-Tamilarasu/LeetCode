class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        int[] a = new int[101];
        int[] b = new int[101];
        int[] c = new int[101];

        for (int num : nums1)
            a[num] = 1;

        for (int num : nums2)
            b[num] = 1;

        for (int num : nums3)
            c[num] = 1;

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {

            if (a[i] + b[i] + c[i] >= 2) {
                result.add(i);
            }
        }

        return result;
    }
}