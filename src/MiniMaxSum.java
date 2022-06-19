import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=false
public class MiniMaxSum {
    public static void miniMaxSum(List<BigInteger> arr) {
         BigInteger sum= new BigInteger("0");
         BigInteger max, min;
         max= arr.get(0);
         min= arr.get(0);

         for(BigInteger s:arr){
             int res=s.compareTo(max);
             int red=s.compareTo(min);

             if(res==1){
                 max=s;
             }
             if(red==-1){
                 min=s;
             }
             sum=sum.add(s);
         }

        System.out.println(sum.subtract(max)+" "+sum.subtract(min));

    }

    public static void main(String[] args) {
        ArrayList<BigInteger> arr=new ArrayList<>();
        arr.add(BigInteger.valueOf(1));
        arr.add(BigInteger.valueOf(2));
        arr.add(BigInteger.valueOf(3));
        arr.add(BigInteger.valueOf(4));
        arr.add(BigInteger.valueOf(5));
        miniMaxSum(arr);
    }
}
