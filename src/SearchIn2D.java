import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2D {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int [][] arr= {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,45},
                {33,34,38,50}
        };
        int target = 37;
        System.out.println(Arrays.toString(Search(arr,target)));
    }
    static int[] Search(int [][] matrix, int target)
    {
        int r=0;
        int c= matrix.length-1;
        while (r< matrix.length && c>=0)
        {
            if (matrix[r][c]== target)
            {
                return new int[]{r,c};
            }
            if (matrix[r][c]< target)
            {
                r++;
            }
            else
            {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
