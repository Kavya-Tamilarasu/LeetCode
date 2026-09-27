class Solution {
    public int primePalindrome(int n) {
        if (n >= 8 && n <= 11) {
            return 11;
        }
        
        
        for (int i = 1; i <= 100000; i++) {
            String s = String.valueOf(i);
            StringBuilder sb = new StringBuilder(s.substring(0, s.length() - 1));
            int palindrome = Integer.parseInt(s + sb.reverse().toString());
            
            if (palindrome >= n && isPrime(palindrome)) {
                return palindrome;
            }
        }
        return -1;
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
