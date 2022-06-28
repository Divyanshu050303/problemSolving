import java.util.Scanner;

public class candy {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int number= sc.nextInt();
        for(int i=1;i<=number;++i){
            solve(i);
        }

        }
        static void solve(int number){
            for (int i = 0; i <number ; i++) {
                int n= sc.nextInt();
                int m= sc.nextInt();
                int sum=0;
                for (int j = 0; j < n; j++) {
                    sum+=sc.nextInt();
                }
                System.out.print("Case #" + (i+1) + ": "+ sum%m);
            }
        }

}

