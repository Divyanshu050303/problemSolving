import java.util.Arrays;

class GFG1
{
    static boolean checkSorted(int n, int[] arr)
    {
        int []b = new int[n];
        System.arraycopy(arr, 0, b, 0, n);
        Arrays.sort(b, 0, n);
        int ct = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != b[i])
                ct++;
        return ct == 0 || ct == 2;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = {4,3,1,2};
        int n = arr.length;
        if (checkSorted(n, arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}