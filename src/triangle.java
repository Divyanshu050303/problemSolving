import java.util.Scanner;

public class triangle {

    static void check(){
        Scanner sc=new Scanner(System.in);
        int side1, side2, side3;
        System.out.println("Enter the first side of the triangle");
        side1=sc.nextInt();
        System.out.println("Enter the second side of the triangle");
        side2= sc.nextInt();
        System.out.println("Enter the third side of the triangle");
        side3= sc.nextInt();
        if((side1 + side2  >  side3) && (side2 + side3 > side1) && (side1 + side3 > side2)){
            if(side1*side1>side2*side2+side3*side3 || side3*side3>side2*side2+side1*side1 || side2*side2>side1*side1+side3*side3){
                System.out.println("Obtuse angle Triangle");
            }
            else if (side1*side1==side2*side2+side3*side3 || side3*side3==side2*side2+side1*side1 || side2*side2==side1*side1+side3*side3) {
                System.out.println("Right angle Triangle");
            }else if (side1*side1<side2*side2+side3*side3 || side3*side3<side2*side2+side1*side1 || side2*side2<side1*side1+side3*side3) {
                System.out.println("Acute Angle Triangle");
            }
        }
        else {
            System.out.println("Not a triangle");
        }

    }
    public static void main(String[] args) {
        check();
    }
}
