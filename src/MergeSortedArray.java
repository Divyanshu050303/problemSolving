import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int m=3, n=3;
        int []nums1={1,2,3,0,0,0};
        int []nums2={2,3,5};
        int k=0;
        System.out.println(nums1.length);
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[k];
            k++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
