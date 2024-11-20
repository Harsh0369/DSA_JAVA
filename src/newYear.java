import java.util.Scanner;

public class newYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        int sum=0;
        System.out.println("Enter Number of Problems:");
        n = sc.nextInt();
        System.out.println("Enter the time taken to reach:");
        k = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            sum+=i*5;
            if (sum+k>240)
            {
                i-=1;
                System.out.println("Number of Questions="+i);
                break;
            }
        }
    }
}
