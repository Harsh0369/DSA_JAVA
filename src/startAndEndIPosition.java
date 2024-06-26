public class startAndEndIPosition {
    public static void main(String[] args) {

    }
    public int[] searchRange(int num[],int target){
        int[] ans= {-1,-1};
        int start = search(num,target,true);
        int end = search(num,target,false);
        ans[0]= start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] arr,int target,boolean startindex){
        int ans=-1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid= start+(end-start)/2;
            if (target< arr[mid]){
                end= mid-1;
            } else if (target>arr[mid]) {
                start= mid+1;
            }
            else {
                ans= mid;
                if (startindex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
