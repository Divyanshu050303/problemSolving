import java.util.ArrayList;
import java.util.Collections;
//https://www.hackerrank.com/challenges/maximizing-xor/problem?isFullScreen=false
public class MaximizingXOR {
    public static int maximizingXor(int l, int r) {
        ArrayList<Integer> array=new ArrayList<>();
        for(int i=l;i<=r;i++){
            for(int j=l;j<=r;j++){
                array.add(i^j);
            }
        }
        return Collections. max(array);

    }
}
