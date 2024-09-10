public class Stream {
    public static void main(String[] args) {
        String str = "baccad";
        skip("",str);
        System.out.println("Original: "+str);
    }
    static void skip(String p,String up )
    {
        if(up.isEmpty())
        {
            System.out.println("New String: "+p);
            return;
        }
        char ch = up.charAt(0);
        if (ch=='a')
        {
            skip(p,up.substring(1));
        }
        else {
            skip(p+ch,up.substring(1));
        }
    }
}

