import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
        int []arr ={1,3,6,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr)
    {
        boolean swapped;
        for (int i =0;i< arr.length;i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
