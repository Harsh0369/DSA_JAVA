import java.util.ArrayList;

public class RecursionLS {
    static int search(int[] arr,int target,int index)
    {
        if (index== arr.length)
        {
            return -1;
        }
        if (arr[index]==target)
        {
            return index;
        }
        else
        {
            return search(arr,target,index+1);
        }
    }
    static boolean search2(int[] arr,int target,int index)
    {
        if (index== arr.length)
        {
            return false;
        }
        else
        {
            return (index==target) || search2(arr,target,index+1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void allIndex(int[]arr,int target,int index)
    {
        if (index== arr.length)
        {
            return;
        }
        if (arr[index]==target)
        {
            list.add(index);
        }
        allIndex(arr,target,index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,6,9,27,45,2};
        int target=6;

        System.out.println(search2(arr,target,0));
    }
}
