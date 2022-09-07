import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PermutationClear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 0; i < n; i++) {

            int a1= sc.nextInt();
            int []a=new int[a1];
            for (int j = 0; j < a1; j++) {
                a[i]= sc.nextInt();
            }
            int b1= sc.nextInt();
            int []b=new int[b1];
            for (int j = 0; j < b1; j++) {
                b[i]=sc.nextInt();
            }
            for (Integer t:b) {
                for (Integer t1:a
                     ) {
                    if(!Objects.equals(t, t1)){
                        System.out.print(t+" ");
                    }

                }

            }
            System.out.println();

        }
    }
}
