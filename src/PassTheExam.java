import java.util.Scanner;

public class PassTheExam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        for (int i = 0; i < size; i++) {
            int s= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            if((s+b+c)>=100 && (s>=10 || b>=10|| c>=10)){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
        }
    }
}
