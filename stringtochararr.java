public class stringtochararr {
    public static void main(String[] args) {
        String str= "hello i am niyaz";
        char ch[]= new char[str.length()];
        for(int i=0; i<ch.length; i++)
        {
            ch[i]=str.charAt(i);
        }
        for(int i=0; i<ch.length; i++)
        {
            System.out.println(ch[i]);
        }
    }
}
