public class NumberLineJumps {
    static int ans=0;
    static void jumps(int num){
        int rem=0;
        if(num<10){
            ans= num;
            return;
        }
        while(num>0){
            rem+=num%10;
            num=num/10;
        }
        num=rem;
        jumps(num);


    }

    public static void main(String[] args) {
        ans=38;
        jumps(ans);
        System.out.println(ans);
    }
}
