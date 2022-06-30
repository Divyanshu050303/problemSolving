import java.util.Arrays;

public class Tribonacci {
    //https://leetcode.com/problems/n-th-tribonacci-number/
    static int fibo2(int n){
        if(n<3){
            if(n==0)
                return 0;

            if(n==1)
                return 1;

            if(n==2)
                return 1;
        }
        int []fiboArray=new int[n+1];
        fiboArray[0]=0;
        fiboArray[1]=1;
        fiboArray[2]=1;
        for(int i=3;i<=n;i++){
            fiboArray[i]=fiboArray[i-1]+fiboArray[i-2]+fiboArray[i-3];
        }
        return fiboArray[n];
    }

    public static void main(String[] args) {
        System.out.println(fibo2(3));
    }
}
