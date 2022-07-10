import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.CheckedOutputStream;
//https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int j : nums1) {
            arrayList.add(j);
        }
        for (int j : nums2) {
            arrayList.add(j);
        }
        Collections.sort(arrayList);
        int arrayLength=arrayList.size();
        if(arrayList.size()%2!=0){
            return arrayList.get(arrayLength/2);
        }
        else{
            double time=arrayList.get((arrayLength-1)/2)+arrayList.get((arrayLength+1)/2);
            return time/2;
        }
    }

    public static void main(String[] args) {
        int []arr1={1,2};
        int []arr2={3,4};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
