import java.util.Scanner;

public class hackerman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int alic= sc.nextInt();
            int bob= sc.nextInt();
            int sum=alic+bob;
            int count=0;
            for(int j=2;j<sum;j++){
                if(sum%j==0){
                    count++;
                }

                if(count==0){
                    System.out.println("Alice");
                }
                else{
                    System.out.println("Bob");
                }
        }
        }
    }
}
