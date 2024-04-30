public class FindingMissingNumber {
    public static void main(String[] args) {
        int[] arr={2,5,3,4};
        int n= missingNumber(arr);
        System.out.println("The Missing Number is:"+n);
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int missingNumber(int [] arr){
        int i = 0;
        while(i< arr.length)
        {
            if(arr[i]< arr.length && arr[i]!= arr[arr[i]])
            {
                swap(arr,i,arr[i]);
            }
            else {
                i++;
            }
        }
        for (int index = 0;index< arr.length;index++){
            if (arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
}
