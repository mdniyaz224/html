public class febonaci {
    public static void main(String[] args) {
        int a=0,b=1;
        int c;
        System.out.println("print fenonaci series");
       
        for(int i=1; i<=5; i++){
            System.out.println(a);//0 1 
            c=a+b;//c=0+1=1,2
            a=b;//1
            b=c;//1

        }
    }
}
