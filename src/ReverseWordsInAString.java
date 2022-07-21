public class ReverseWordsInAString {
    //https://leetcode.com/problems/reverse-words-in-a-string/
    public String reverseWords(String s) {
        s=s.replaceAll("\\s+", " ");
        String []word=s.split(" ");

        String str="";
        for(int i=word.length-1;i>=0;i--){
            str=str+word[i]+" ";
        }
        return str.trim();

    }
}
