import java.util.Arrays;

public class ValidAnagram {
    //https://leetcode.com/problems/valid-anagram/
    public boolean isAnagram(String s, String t) {
        String s1 = s.replaceAll("\\s", "");
        String s2 = t.replaceAll("\\s", "");
        if (s1.length() != s2.length())
            return false;
        char[] ArrayS1 = s1.toLowerCase().toCharArray();
        char[] ArrayS2 = s2.toLowerCase().toCharArray();
        Arrays.sort(ArrayS1);
        Arrays.sort(ArrayS2);
        return Arrays.equals(ArrayS1, ArrayS2);
    }
}