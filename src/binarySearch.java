public class binarySearch {
    //https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&curated
    int binarysearch(int arr[], int n, int k) {
        int low, high, mid;
        low=0;
        high=n-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if (arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
