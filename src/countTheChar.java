public class countTheChar {
    //https://practice.geeksforgeeks.org/problems/easy-string2212/1
    static String transform(String S)
    {
        if(S==null || S.length()==0){
            return "";
        }
        char [] inputChar=S.toCharArray();
        char preChar=0;
        int counter=0;
        StringBuilder sb=new StringBuilder();
        for(char e:inputChar){
            if(preChar==e){
                counter++;
            }
            else {
                if(preChar!=e){
                    sb.append(counter).append(preChar);
                    preChar=e;
                    counter=1;
                }
            }
            sb.append(counter).append(preChar);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(transform("aaABBb"));
    }
}
