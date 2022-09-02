public class strplendrom {
   public static void main(String[] args) {
    String str="amam";
   // char ch[]=new char[str.length()];
    System.out.println(str.length());
    int len=str.length();
    char ch[]=new char[len];
    int flag=0;
    int middle=len/2;
    for(int i=0; i<len; i++)
    {
        ch[i]=str.charAt(i);
    }
    for(int i=0; i<=middle; i++)
    {
        if(ch[i]!=ch[len-i-1])
        flag++;
        System.out.println(flag);
    }
    if(flag>=1)
    {
        System.out.println("no");
    }
    else {
        System.out.println("yes");
    }
   } 
}
