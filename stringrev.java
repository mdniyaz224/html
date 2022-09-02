public class stringrev {
    public static void main(String[] args) {
        String str="md niyaz";
       
       System.out.println("change it in the char array");
       char ch []= new char[str.length()];
       for(int i =0; i<str.length(); i++)
       {
        ch[i]=str.charAt(i);
       }
       for(int i=ch.length-1; i>=0; i--) 
       {
        System.out.print(ch[i]);
       }
    }
}
