public class febo1 {
    public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.println("prtin the febonaci series of the given no ");
        for(int i=0; i<10; i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
