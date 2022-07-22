public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        //https://leetcode.com/problems/valid-palindrome/
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        return s.equals(new StringBuilder(s).reverse().toString());

    }
}
