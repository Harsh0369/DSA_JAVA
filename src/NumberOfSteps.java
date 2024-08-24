public class NumberOfSteps {
        public static int numberOfSteps(int num) {
            return helper(num,0);

        }
        private static int helper(int n, int c){
            if (n==0)
                return c;
            if (n%2==0)
            {
                return helper(n/2,c+1);
            }
            else {
                return helper(n-1,c+1);
            }

        }

    public static void main(String[] args) {
            int ans= numberOfSteps(14);
        System.out.println("Answer:"+ans);
    }
}
