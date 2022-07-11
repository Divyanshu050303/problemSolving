import java.util.Scanner;

public class Bidding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for (int i = 0; i < size; i++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c=sc.nextInt();
            if(a>b && a>c){
                System.out.println("Charlie");
            }
            else if(b>a && b>c){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }
    }
}
