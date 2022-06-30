import java.util.Arrays;

public class fibonacci {
    //https://leetcode.com/problems/fibonacci-number/
    static int fibo2(int n){
        int []fiboArray=new int[n+1];
        Arrays.fill(fiboArray, -1);
        if(n<=1)
            return n;
        if(fiboArray[n]!=-1)
            return fiboArray[n];
        return fiboArray[n]=fibo2(n-1)+fibo2(n-2);
    }
}
