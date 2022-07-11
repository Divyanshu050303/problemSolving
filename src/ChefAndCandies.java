import java.util.Scanner;

public class ChefAndCandies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        for (int i = 0; i < size; i++) {
            int child= sc.nextInt();
            int candy= sc.nextInt();
            if(candy>child){
                System.out.println("0");
            }
            else{
                int buy=child-candy;
                System.out.println(buy%4);
            }
        }
    }
}
