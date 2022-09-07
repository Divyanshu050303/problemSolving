import java.util.Scanner;

public class fever {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t= sc.nextInt();
            if(t>98){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
