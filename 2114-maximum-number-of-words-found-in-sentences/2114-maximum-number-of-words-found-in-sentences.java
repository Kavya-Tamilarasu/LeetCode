class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLen = 0;
		
        for (String curr : sentences) {
            int currLen = curr.split(" ").length;
            if (maxLen < currLen)
                maxLen = currLen;
        }
        return maxLen;
    }
}