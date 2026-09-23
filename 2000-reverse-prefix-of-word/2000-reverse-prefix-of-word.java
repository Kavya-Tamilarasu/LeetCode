class Solution {
    public String reversePrefix(String word, char ch) {

        Stack<Character> stack = new Stack<>();

        int index = -1;

        
        for (int i = 0; i < word.length(); i++) {

            stack.push(word.charAt(i));

            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }

        
        if (index == -1) {
            return word;
        }

        StringBuilder result = new StringBuilder();

        
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        
        result.append(word.substring(index + 1));

        return result.toString();
    }
}