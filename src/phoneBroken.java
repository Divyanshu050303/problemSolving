import java.util.Scanner;

public class phoneBroken {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 0; i <n ; i++) {
            int r= sc.nextInt();
            int b= sc.nextInt();
            if(r==b){
                System.out.println("ANY");
            }
            else if(r>b){
                System.out.println("NEW PHONE");
            }
            else{
                System.out.println("REPAIR");
            }
        }
    }
}
