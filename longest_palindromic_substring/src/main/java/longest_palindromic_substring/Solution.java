package longest_palindromic_substring;

class Solution {
    public String longestPalindrome(String s) {
        String res = "";

        for (int start = 0; start < s.length(); start++) {
            for (int end = s.length(); end > start; end--) {
                final String substring = s.substring(start, end);
                if (isPalindromic(substring) && substring.length() > res.length()) {
                    res = substring;
                }
            }
        }

        return res;
    }

    private boolean isPalindromic(final String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}