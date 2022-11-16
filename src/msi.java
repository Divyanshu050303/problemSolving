import java.util.ArrayList;
import java.util.Arrays;

public class msi {
    public static void main(String[] args) {
        int n=2, q=2;
        int []a={1,3};
        int []b={4,1};
        int []qu={1,2};
        System.out.println(solve(n, a, b, q, qu));


    }

        static  ArrayList<Long> solve (int N, int[] A, int[] B, int Q, int[] Queries){
            // code here
            ArrayList<Long> list = new ArrayList<>();
            long[] A1 = Arrays.stream(A).asLongStream().toArray();
            long[] B1 = Arrays.stream(B).asLongStream().toArray();
            long[] Queries1 = Arrays.stream(Queries).asLongStream().toArray();
            for (long i = 0; i < (long) Q; i++) {
                long ans = 0;
                for (int j = 0; j < (long) N; j++) {
                    if (ans < Queries1[(int) i] * A1[j] + B1[j])
                        ans = Queries1[(int) i] * A1[j] + B1[j];
                }
                list.add(ans);
            }
            return list;
        }



}