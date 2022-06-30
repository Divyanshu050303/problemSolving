import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades=new ArrayList<>();
       List<Integer> result=new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        for (Integer e:grades) {
            if(e>33){
            if(e%5==3){
                result.add(e+2);
            }

            else {
                result.add(e);
            }
            }
            if(e<=33) {
            result.add(e);
            }
//            else if(e%5==1){
//                result.add(e+1);
//            }
        }
        System.out.println(result);
    }
}
