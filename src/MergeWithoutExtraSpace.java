import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first array size");
        int size1=sc.nextInt();
        System.out.println("Enter the size of second array");
        int size2= sc.nextInt();
        int []arr1=new int[size1];
        int []arr2=new int[size2];
        ArrayList<Integer> arrayList=new ArrayList<>();
        System.out.println("Enter the first array");
        for (int i = 0; i < size1; i++) {
            arr1[i]=sc.nextInt();
            arrayList.add(arr1[i] );
        }for (int i = 0; i < size2; i++) {
            arr2[i]=sc.nextInt();
            arrayList.add(arr2[i] );
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
