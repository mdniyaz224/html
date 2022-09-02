public class countwordinstring {
    public static void main(String[] args) {
        String str="i am md niyaz";
        int len=str.length();
        char ch[]=new char[len];
        for(int i=0; i<len; i++)
        {
            ch[i]=str.charAt(i);
        }
        int count=1;
        for(int i=0; i<len; i++)
        {
                if(ch[i]==' ')
                {
                    count++;
                    
                }
        }
       System.out.println(count);
    }
}
