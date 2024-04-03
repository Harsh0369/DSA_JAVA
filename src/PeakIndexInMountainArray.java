public class PeakIndexInMountainArray {
    public static void main(String[] args) {

    }
    public int peak(int[] arr){
        int start  = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = end - (end- start+1)/2;
            if (arr[mid]>arr[mid+1]){
                end = mid;
            }
            else {
                start= mid+1;
            }
        }
        return start;
    }
}
