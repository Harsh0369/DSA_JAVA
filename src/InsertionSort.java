import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2,4,6,3,7,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr)
    {
        int start =0;
        for (int i=0;i<arr.length;i++)
        {
            int last= arr.length-i-1;
            int maxIndex = maxIndex(arr,start,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int maxIndex(int[] arr,int start,int last){
        int max = start;
        for (int i= start;i<=last;i++){
            if (arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
}
