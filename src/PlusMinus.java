import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
//https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        float a=0;
        float b=0;
        float c=0;
        for(Integer x : arr){
            if(x>0){
                a+=1;
            }
            else if(x<0){
                b+=1;
            }
            else{
                c+=1;
            }
        }
        int d=arr.size();


        System.out.printf("%.6f\n",a/d);
        System.out.printf("%.6f\n",b/d);
        System.out.printf("%.6f\n",c/d);

    }

    public static void main(String[] args) {
        ArrayList<Integer> aar=new ArrayList<>();
        aar.add(-4);
        aar.add(3);
        aar.add(-9);
        aar.add(0);

        aar.add(4);
        aar.add(1);
        plusMinus(aar);
    }
}
