class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n, k, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int n, int k, int index, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < n; i++) {
            current.add(i + 1);
            backtrack(n, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}