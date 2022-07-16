public class SortanArray {
    //https://leetcode.com/problems/sort-an-array/
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;


    }
    public void quickSort(int []arr, int low, int high){
        int pi=partition(arr, low, high);
        if(low<pi-1){
            quickSort(arr, low, pi-1);
        }
        if(pi<high)
            quickSort(arr, pi, high);
    }
    public int partition(int []arr, int low, int high){
        int pivot=arr[(low+high)/2];
        while(low<=high){
            while(arr[low]<pivot)
                low++;
            while(arr[high]>pivot)
                high--;
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }
}
