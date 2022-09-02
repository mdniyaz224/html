public class stringrr {
    public static void main(String[] args) {
        String str="hello";
        char ch[]=new char[str.length()];
        for(int i=0; i<str.length(); i++)
        {
            ch[i]=str.charAt(i);
        }
        for(int i=ch.length-1; i>=0; i-- )
        {
            System.out.println(ch[i]);
        }
    }
}
