import java.util.Arrays;

public class KthSmallestElementinaSortedMatrix {
    public static void kthSmallest(int[][] matrix, int k) {
        int count=0;
        int []arr=new int[matrix.length*matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                arr[count]=matrix[i][j];
                count++;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[k]);
    }
    public static void main(String[] args) {
        int [][]arr={{1,2},{1,3}};
        kthSmallest(arr, 2);

    }
}
