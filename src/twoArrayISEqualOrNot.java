
import java.util.Arrays;

public class twoArrayISEqualOrNot {
    //https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=1&curated
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int c=0;
        for(int i=0;i<N;i++){
            if(A[i]==B[i]){
                c++;
            }
        }
        return c == N;
    }
}
