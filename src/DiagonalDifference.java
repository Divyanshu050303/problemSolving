import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        int leftDiag=0, rightdiag=0;
        List<List<Integer>> list=new ArrayList<>();
        List<Integer>in=new ArrayList<>();
        List<Integer>in1=new ArrayList<>();
        List<Integer>in2=new ArrayList<>();
        in.add(1);
        in.add(2);
        in.add(3);
        in1.add(4);
        in1.add(5);
        in1.add(6);
        in2.add(9);
        in2.add(8);
        in2.add(9);
        list.add(in);
        list.add(in1);
        list.add(in2);
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            for (int j = 0; j <list.get(i).size() ; j++) {
                if(i==j){
                    leftDiag+=list.get(i).get(j);
                }

            }
            rightdiag+=list.get(i).get((list.size()-1)-i);

        }
        System.out.println(leftDiag);
        System.out.println(rightdiag);
        int n=leftDiag-rightdiag;


    }
}
