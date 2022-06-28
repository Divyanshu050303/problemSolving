import java.util.ArrayList;

public class CompareTheTriplets {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(17);
        list.add(28);
        list.add(30);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(99);
        list1.add(16);
        list1.add(8);
        int bob = 0, alic = 0;
        for (int i = 0; i < 3; i++) {
            if (list.get(i) > list1.get(i)) {
                alic++;
            }
            if (list.get(i) < list1.get(i)) {
                bob++;
            }

        }
        ArrayList<Integer> result=new ArrayList<>();
        result.add(alic);
        result.add(bob);
        System.out.println(result);
    }}
