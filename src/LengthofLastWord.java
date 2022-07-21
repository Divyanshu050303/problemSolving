public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        //https://leetcode.com/problems/length-of-last-word/
        String []word=s.split(" ");
        int n=word.length;
        String str=word[n-1];
        return str.length();

    }
}
