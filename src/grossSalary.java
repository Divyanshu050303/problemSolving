import java.util.Scanner;

public class grossSalary {
    public static void main(String[] args) {
        System.out.println("Enter your basic pay");
        Scanner sc=new Scanner(System.in);
        double pay=sc.nextDouble();
        double da=(pay*25)/100;
        double hra=(pay*15)/100;
        double pf=(pay*8.33)/100;
        double np=da+hra+pf;
        double gp=np-pf;
        System.out.println("Dearness Allowance "+da);
        System.out.println("House Rent Allowance "+hra);
        System.out.println("Provident Fund "+pf);
        System.out.println("Net pat"+np);
        System.out.println("Gross pay "+gp);
    }
}
