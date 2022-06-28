import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        System.out.println("Enter the date");
        Scanner sc=new Scanner(System.in);
        int date= sc.nextInt();
        if(date>31){
            System.out.println("Invalid day number");
        }
        else{
            if(date==3 ||date==10||date==17||date==24||date==31){
                System.out.println("Monday");
            }
            else if(date==4 ||date==11||date==18||date==25){
                System.out.println("Tuesday");
            }
            else if(date==5 ||date==12||date==19||date==26){
                System.out.println("Wednesday");
            }
            else if(date==6 ||date==13||date==20||date==27){
                System.out.println("Thursday");
            }
            else if(date==7 ||date==14||date==21||date==28){
                System.out.println("Friday");
            }
            else if(date==1 ||date==8||date==15||date==22||date==29){
                System.out.println("Friday");
            }
            else if(date==2 ||date==9||date==16||date==23||date==30){
                System.out.println("Friday");
            }
        }
    }
}
