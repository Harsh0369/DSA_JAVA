import java.util.Scanner;

public class ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,4,6,8,9,22,43};
        System.out.println("Enter the Target Element:");
        int target = sc.nextInt();
        int ans= search(array,target);
        System.out.println("The nearest Element is at index number:"+ans);
    }
    static int search(int[] arr,int target){
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
                return mid;
            }
        }
        return start;
    }
}
