public class TwoSum {
    public static void main(String[] args) {
        int[] nums= {2,7,11,15};
        int target=9;
        int[] ans= twoSum(nums,target);
        System.out.println(ans);
    }
    public static int[] twoSum(int[] nums, int target) {
        int s;
        int e;
        for (int i=0;i< nums.length;i++)
        {

            s=0;
            e= nums.length-1;
            int x= target-nums[i];
            while (s <= e){
                int mid= s+(e-s)/2;
                if (x< nums[mid]){
                    e= mid-1;
                } else if (x>nums[mid]) {
                    s= mid+1;
                }
                else if(nums[mid]==x){
                    return new int[]{i,mid};
                }
            }
        }
        return new int[]{};
    }
}
